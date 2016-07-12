package pure_software.de.party_radar.services.actions;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import pure_software.de.party_radar.MainActivity;
import pure_software.de.party_radar.services.contracts.PersonalInformationContract;
import pure_software.de.party_radar.services.db_helper.PersonalInformationDbHelper;

import static pure_software.de.party_radar.services.contracts.PersonalInformationContract.*;

/**
 * Created by jfuchs on 12.07.2016.
 */
public class DatabaseAction extends MainActivity {

    private ContentValues values;

    public void writePersonalInformation(String prename, String name, String username, int age, int points, boolean fbRegistered, boolean appRegistered) {
        PersonalInformationDbHelper dbHelper = new PersonalInformationDbHelper(getApplicationContext());
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        values = new ContentValues();
        values.put(PersonalInformationContract.PersonalEntry.COLUMN_NAME_PRENAME, prename);
        values.put(PersonalInformationContract.PersonalEntry.COLUMN_NAME_NAME, name);
        values.put(PersonalInformationContract.PersonalEntry.COLUMN_NAME_USERNAME, username);
        values.put(PersonalInformationContract.PersonalEntry.COLUMN_NAME_AGE, age);
        values.put(PersonalInformationContract.PersonalEntry.COLUMN_NAME_POINTS, points);
        values.put(PersonalInformationContract.PersonalEntry.COLUMN_NAME_FB_REGISTERED, fbRegistered);
        values.put(PersonalInformationContract.PersonalEntry.COLUMN_NAME_APP_REGISTERED, appRegistered);

    }

}
