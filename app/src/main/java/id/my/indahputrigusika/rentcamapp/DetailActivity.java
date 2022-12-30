package id.my.indahputrigusika.rentcamapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().hide();
    }
    public void pindah(View view) {
        if (view.getId() == R.id.panah6) {
            Intent panah6intent = new Intent(DetailActivity.this, ProductActivity.class);
            startActivity(panah6intent);
        }
        if (view.getId() == R.id.panah7) {
            Intent panah7intent = new Intent(DetailActivity.this, OrderActivity.class);
            startActivity(panah7intent);
        }
    }
}
