package iptv.g.iptv;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Canalsbt extends AppCompatActivity {

    VideoView canalSbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canalsbt);
        canalSbt =  (VideoView) this.findViewById(R.id.canalSbt);
        MediaController mc = new MediaController(this);
        canalSbt.setMediaController(mc);
        final String url = "https://www.youtube.com/watch?v=bk6Xst6euQk";
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                canalSbt.setVideoURI(Uri.parse(url));
            }
        });
        canalSbt.start();
    }
}
