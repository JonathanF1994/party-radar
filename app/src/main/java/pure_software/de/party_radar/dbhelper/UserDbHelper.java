package pure_software.de.party_radar.dbhelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by jfuchs on 15.07.2016.
 */
public class UserDbHelper extends SQLiteOpenHelper {

    public static final String COLUMN_AGE = "age";
    public static final String COLUMN_APP_REGISTERED = "app_registered";
    public static final String COLUMN_FB_REGISTERED = "fb_registered";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public  static final String COLUMN_POINTS = "points";
    public static final String COLUMN_PRENAME = "prename";
    public static final String COLUMN_USER_NAME = "user_name";

    public static final String DB_NAME = "party.db";
    public static final int DB_VERSION = 1;

    // Not in alphabetic order, because illegal forward reference
    public static final String TABLE_USER = "user";

    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + TABLE_USER +
            "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                  COLUMN_PRENAME + " TEXT, " +
                  COLUMN_NAME + " TEXT, " +
                  COLUMN_USER_NAME + " TEXT NOT NULL, " +
                  COLUMN_AGE + " INTEGER NOT NULL, " +
                  COLUMN_POINTS + " INTEGER DEFAULT 0, " +
                  COLUMN_APP_REGISTERED + " INTEGER DEFAULT 0, " +
                  COLUMN_FB_REGISTERED + " INTEGER DEFAULT 0);";

    private static final String LOG_TAG = UserDbHelper.class.getSimpleName();

    public UserDbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        Log.d(LOG_TAG, "DbHelper hat die Datenbank: " + getDatabaseName() + " erzeugt!");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            Log.d(LOG_TAG, "Es wird eine Tabelle mit folgendem Befehl erzeugt: " + SQL_CREATE_TABLE);
            db.execSQL(SQL_CREATE_TABLE);
        } catch (SQLiteFullException ex) {
            Log.e(LOG_TAG, "Fehler beim anlegen der Tabelle: " + ex.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
