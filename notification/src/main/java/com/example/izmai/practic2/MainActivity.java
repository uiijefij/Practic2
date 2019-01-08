package com.example.izmai.practic2;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.support.v7.app.ActionBar;

public class MainActivity extends AppCompatActivity {
    private static final int MY_NOT_ID =12345;
    private static final int MY_REQUEST_ID = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressWarnings("deprecation")
    void onClickSendNotification(View view){
        NotificationCompat.Builder notificatonBuilder =new  NotificationCompat.Builder(this);
        notificatonBuilder.setAutoCancel(true);
        notificatonBuilder.setSmallIcon(R.mipmap.ic_launcher_round);
        notificatonBuilder.setTicker("this is MIREA");
        notificatonBuilder.setWhen(System.currentTimeMillis()+10*1000);
        notificatonBuilder.setContentTitle("this is title");
        notificatonBuilder.setContentText("THIS IS SPARTA");

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, MY_REQUEST_ID,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        notificatonBuilder.setContentIntent(pendingIntent);

        NotificationManager notificationService = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        Notification notification = notificatonBuilder.build();
        notificationService.notify(MY_NOT_ID,notification);
    }
}
