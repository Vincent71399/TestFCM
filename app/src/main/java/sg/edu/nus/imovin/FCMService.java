package sg.edu.nus.imovin;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.pusher.pushnotifications.reporting.FCMMessageReceiver;

public class FCMService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d("fcm_test", "From: " + remoteMessage.getFrom());
    }

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.d("fcm_test", "Refreshed token: " + s);
    }
}
