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
import android.widget.Toast;
import android.widget.VideoView;

import StaticData.TextPt;

public class Chat extends Activity {
    /* (non-Javadoc) * @see android.app.Activity#onCreate(android.os.Bundle)*/
    Button btSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
// TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

        btSend = (Button) findViewById(R.id.btEnviar);

        btSend.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(Chat.this, TextPt.getErrorByPosition(1), Toast.LENGTH_LONG).show();
            }
        });
    }
}
