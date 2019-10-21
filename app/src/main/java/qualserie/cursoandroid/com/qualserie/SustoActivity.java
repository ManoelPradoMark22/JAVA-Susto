package qualserie.cursoandroid.com.qualserie;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class    SustoActivity extends AppCompatActivity {

    private ImageView imagemSusto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_susto);

        imagemSusto = (ImageView) findViewById(R.id.imagemSusto2Id);

        imagemSusto.setImageResource(R.drawable.susto);
        MediaPlayer mp = MediaPlayer.create(SustoActivity.this, R.raw.grito_do_exorcista);
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {

                mp.release();
            }

        });
        mp.start();

    }
}
