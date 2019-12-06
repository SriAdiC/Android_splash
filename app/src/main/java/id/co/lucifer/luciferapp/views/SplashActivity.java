package id.co.lucifer.luciferapp.views;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import id.co.lucifer.luciferapp.MainActivity;
import id.co.lucifer.luciferapp.R;

public class SplashActivity extends AppCompatActivity {

    ImageView imgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Inisialisasi Objek --> Pengkondisian variabel widget dengan objek sesungguhnya
        imgLogo = (ImageView) findViewById(R.id.splash_imgLogo);

        // Sumber Animasi
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.fadeout);
//        implementasikan Animasi

        imgLogo.startAnimation(animation);

        //Menjalankan Splash Activity dalam beberapa detik
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent panggil = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(panggil);
                // Splash screen hilang
                finish();
            }
        }, 4000);
    }
}
