package com.pardaz.karafan.karafantest;

import android.content.SharedPreferences;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIDServices extends FirebaseInstanceIdService {


    @Override
    public void onTokenRefresh() {

        super.onTokenRefresh();

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        //To displaying token on logcat
        Log.i("Yousef: ", refreshedToken);
        SharedPreferences.Editor editor = getSharedPreferences("preference", MODE_PRIVATE).edit();
        editor.putString("token", refreshedToken);
        editor.apply();
        Log.i("Yousef: ", "hello");



    }

}
