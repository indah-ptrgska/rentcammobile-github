package id.my.indahputrigusika.rentcamapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    public static final int splash_timer = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        new Handler().postDelayed(() -> {
            Intent home = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(home);

            finish();
        }, splash_timer);
    }
}
