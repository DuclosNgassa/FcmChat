package info.softsolution.ebele.fcm;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by ndanji-ngassa on 01.07.2017.
 */

public class FcmIntentService extends IntentService{

    private static final String TAG = FcmIntentService.class.getSimpleName();
    public static final String KEY ="key";
    public static final String TOPIC ="topic";
    public static final String SUBSCRIBE ="subscribe";
    public static final String UNSUBSCRIBE ="unsubscribe";

    public FcmIntentService(){
        super(TAG);
    }

    @Override
    protected onHandleIntent(Intent intent){
        String key = intent.getStringExtra(KEY);
        switch(key){
            case SUBSCRIBE :
                //subscribe to a topic
                String topic = intent.getStringExtra(TOPIC);
                subscribeToTopic(topic);
                break;
            case UNSUBSCRIBE:
                String topic1 = intent.getStringExtra(TOPIC);
                unsubscribeToTopic(topic1);


        }

    }

}
