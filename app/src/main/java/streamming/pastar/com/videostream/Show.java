package streamming.pastar.com.videostream;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Show extends Activity {
    Button btChat;
    ProgressDialog pd;
    VideoView view;
    String URL = "http://www.androidbegin.com/tutorial/AndroidCommercial.3gp";

    /* (non-Javadoc) * @see android.app.Activity#onCreate(android.os.Bundle)*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
// TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);

        btChat = (Button) findViewById(R.id.btChat);
        view = (VideoView)findViewById(R.id.videoView1);

        pd = new ProgressDialog(Show.this);
        pd.setTitle("Video Streamming - Pastar");
        pd.setMessage("Buffering...");
        pd.setIndeterminate(false);
        pd.setCancelable(false);
        pd.show();

        try{
            MediaController controller = new MediaController(Show.this);
            controller.setAnchorView(view);
            Uri vid = Uri.parse(URL);
            view.setMediaController(controller);
            view.setVideoURI(vid);
        }catch(Exception e){
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }
        view.requestFocus();
        view.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public void onPrepared(MediaPlayer mp) {
// TODO Auto-generated method stub
                pd.dismiss();
                view.start();
            }
        });

        btChat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = getIntent();

                Intent i2 = new Intent(Show.this, Chat.class);
                i2.putExtra("nome", i.getStringExtra("nome"));
                startActivity(i2);
            }
        });
    }
}