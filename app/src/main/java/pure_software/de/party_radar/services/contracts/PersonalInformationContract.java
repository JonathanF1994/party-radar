package pure_software.de.party_radar.services.contracts;

import android.provider.BaseColumns;

import pure_software.de.party_radar.services.actions.BaseAction;

/**
 * Created by jfuchs on 12.07.2016.
 */
@SuppressWarnings("unused")
public class PersonalInformationContract extends BaseAction {
    public PersonalInformationContract(){}

    /* Inner class that defines the table contents */
    @SuppressWarnings("unused")
    public abstract class PersonalEntry implements BaseColumns {
        public static final String TABLE_NAME = "user";
        public static final String COLUMN_NAME_ID = "id";
        public static final String COLUMN_NAME_PRENAME = "prename";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_USERNAME = "username";
        public static final String COLUMN_NAME_AGE = "age";
        public static final String COLUMN_NAME_POINTS = "points";
        public static final String COLUMN_NAME_FB_REGISTERED = "fb_registered";
        public static final String COLUMN_NAME_APP_REGISTERED = "app_registered";
    }
}
