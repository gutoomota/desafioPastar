package streamming.pastar.com.videostream;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import StaticData.TextPt;

public class VideoStreamActivity extends Activity {
    Button button;
    EditText nome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        button = (Button) findViewById(R.id.btEntrar);
        nome = (EditText) findViewById(R.id.tvNome);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                if(nome.getText().length() > 0) {
                    Intent i = new Intent(VideoStreamActivity.this, Show.class);
                    i.putExtra("nome", nome.getText());
                    startActivity(i);
                }else{
                    Toast.makeText(VideoStreamActivity.this, TextPt.getErrorByPosition(0), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
