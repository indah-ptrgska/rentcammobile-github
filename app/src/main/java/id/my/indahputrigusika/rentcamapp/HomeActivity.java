package id.my.indahputrigusika.rentcamapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();
    }
    public void pindah(View view) {
        if (view.getId() == R.id.panah3) {
            Intent panah3intent = new Intent(HomeActivity.this, ProductActivity.class);
            startActivity(panah3intent);
        }
    }
}
