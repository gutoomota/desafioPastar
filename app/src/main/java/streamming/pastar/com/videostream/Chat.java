package streamming.pastar.com.videostream;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Chat extends Activity {
    Button btChat;
    /* (non-Javadoc) * @see android.app.Activity#onCreate(android.os.Bundle)*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
// TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);

        btChat = (Button) findViewById(R.id.btChat);
        Intent i = getIntent();

        btChat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

            }
        });
    }
}
