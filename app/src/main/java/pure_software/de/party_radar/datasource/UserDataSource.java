package pure_software.de.party_radar.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import pure_software.de.party_radar.dbhelper.UserDbHelper;
import pure_software.de.party_radar.memo.UserMemo;

/**
 * Created by jfuchs on 15.07.2016.
 */
public class UserDataSource {

    private static final String LOG_TAG = UserDataSource.class.getSimpleName();
    private String[] columns = {
            UserDbHelper.COLUMN_ID,
            UserDbHelper.COLUMN_APP_REGISTERED,
            UserDbHelper.COLUMN_FB_REGISTERED,
            UserDbHelper.COLUMN_PRENAME,
            UserDbHelper.COLUMN_NAME,
            UserDbHelper.COLUMN_USER_NAME,
            UserDbHelper.COLUMN_AGE,
            UserDbHelper.COLUMN_POINTS
    };


    private SQLiteDatabase database;
    private UserDbHelper dbHelper;

    public UserDataSource(Context context) {
        Log.d(LOG_TAG, "Unsere DataSource erzeugt jetzt den DbHelper!");
        dbHelper = new UserDbHelper(context);
    }

    public void open () {
        Log.d(LOG_TAG, "Eine Referenz auf die Datenbank wird jetzt angefragt.");
        database = dbHelper.getWritableDatabase();
        Log.d(LOG_TAG, "Datenbankreferenz erhalten. Pfad zur Datenbank: " + database.getPath());
    }

    public void close(){
        dbHelper.close();
        Log.d(LOG_TAG, "Datenbank mit Hilfe des DbHelpers geschlossen.");
    }

    public UserMemo createUserMemo(String prename, String name, String userName, int age) {
        ContentValues values = new ContentValues();
        values.put(UserDbHelper.COLUMN_PRENAME, prename);
        values.put(UserDbHelper.COLUMN_NAME, name);
        values.put(UserDbHelper.COLUMN_USER_NAME, userName);
        values.put(UserDbHelper.COLUMN_AGE, age);

        long insertId = database.insert(UserDbHelper.TABLE_USER, null, values);

        Cursor cursor = database.query(UserDbHelper.TABLE_USER, columns, UserDbHelper.COLUMN_ID + "=" + insertId,
                null, null, null, null);

        cursor.moveToFirst();
        UserMemo userMemo = new UserMemo(age, name, prename, userName);
        cursor.close();

        return userMemo;
    }
}
