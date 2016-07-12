package pure_software.de.party_radar.services;

import android.provider.BaseColumns;

/**
 * Created by jfuchs on 12.07.2016.
 */
public class PersonalInformationContract {
    public PersonalInformationContract(){}

    /* Inner class that defines the table contents */
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
