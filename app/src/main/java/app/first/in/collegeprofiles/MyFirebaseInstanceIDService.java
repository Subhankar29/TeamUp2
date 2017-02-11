package app.first.in.collegeprofiles;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by venkateshtata on 11/02/17.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static String  REG_TOKEN = "REG_TOKEN";


    public void onTokenRefresh() {

        String recent_token = FirebaseInstanceId.getInstance().getToken();

        Log.d(REG_TOKEN,recent_token);

    }
}
