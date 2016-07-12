package pure_software.de.party_radar.services.db_helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import pure_software.de.party_radar.services.actions.BaseAction;

/**
 * Created by jfuchs on 12.07.2016.
 */
public class PersonalInformationDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "pradar.db";
    //TODO: Create sql-statement
    private static final String TABLE_NAME = "USER";
    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE " + TABLE_NAME + "(" +
            "ID INT PRIMARY KEY NOT NULL," +
            "PRENAME CHAR(100)," +
            "NAME CHAR(100)," +
            "USERNAME CHAR(100)," +
            "AGE INT(3) NOT NULL," +
            "POINTS INT NOT NULL," +
            "FB_REGISTERED INT(1) NOT NULL," +
            "APP_REGITERED INT(1) NOT NULL);";

    BaseAction baseAction = new BaseAction();

    public PersonalInformationDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        if(baseAction.checkTableExists(TABLE_NAME,db)) {
            getActualPartys();
        }
        //TODO: Haltepunkt setzen zum Prüfen
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    private void getActualPartys() {
        // TODO: Select to read party entrys from DB
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
