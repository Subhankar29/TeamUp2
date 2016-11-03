package app.first.in.collegeprofiles;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by venkateshtata on 02/11/16.
 */

public class DatabaseHelper {
    private static boolean persistenceEnable = false;
    private static FirebaseDatabase mDatabase;


    public static boolean isPersistenceEnable(){
        return persistenceEnable;
    }
    public static FirebaseDatabase getInstance() {
        if (mDatabase == null) {
            mDatabase = FirebaseDatabase.getInstance();
            if(persistenceEnable==true) {
                mDatabase.setPersistenceEnabled(true);
            }
        }

        return mDatabase;
    }
}
