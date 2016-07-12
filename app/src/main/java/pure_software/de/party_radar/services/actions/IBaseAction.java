package pure_software.de.party_radar.services.actions;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by jfuchs on 12.07.2016.
 */
interface IBaseAction {
    @SuppressWarnings("unused")
    /**
     * @author Jonathan Fuchs
     * @param String tablename, SQLiteDatabas db
     */
    boolean checkTableExists(String tablename, SQLiteDatabase db);
}
