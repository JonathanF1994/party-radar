package pure_software.de.party_radar.services.actions;

import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.util.Log;

import pure_software.de.party_radar.pure_software.de.party_radar.general.GeneralImpl;
import pure_software.de.party_radar.services.actions.IBaseAction;

/**
 * Created by Jonathan Fuchs on 12.07.2016.
 */
@SuppressWarnings("FieldCanBeLocal")
public class BaseAction implements IBaseAction {
    private static final String CHECK_TABLE_EXISTS = "SELECT * FROM sqlite_master WHERE type='table' AND name='USER'";
    private boolean exists;

    @Override
    public boolean checkTableExists(String tablename, @NonNull SQLiteDatabase db) {

        exists = false;
        try {
            db.execSQL(CHECK_TABLE_EXISTS + tablename);
            exists = true;
        } catch(Exception e) {
            Log.i(GeneralImpl.LOG_TAG_INFORMATION, "Tabel does not exists in the database");
            exists = false;
        }
        return exists;
    }
}
