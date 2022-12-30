package id.my.indahputrigusika.rentcamapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
    }
    public void pindah(View view) {
        if (view.getId() == R.id.panah2) {
            Intent panah2intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(panah2intent);
        }
    }
}
