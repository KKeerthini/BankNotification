package com.android.keerthini.banknotification.fcmnotification;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Keerthini on 02/10/2017.
 */

public class BankNotificationInstanceIDService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.e("FCM Device token:", ""+ refreshedToken);
    }

    private void sendRegistrationToServer(String token) {

    }
}