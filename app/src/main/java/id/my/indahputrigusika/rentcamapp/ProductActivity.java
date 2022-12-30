package id.my.indahputrigusika.rentcamapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        getSupportActionBar().hide();
    }
    public void pindah(View view) {
        if (view.getId() == R.id.panah4) {
            Intent panah4intent = new Intent(ProductActivity.this, DetailActivity.class);
            startActivity(panah4intent);
        }
        if (view.getId() == R.id.panah5) {
            Intent panah5intent = new Intent(ProductActivity.this, HomeActivity.class);
            startActivity(panah5intent);
        }
    }
}
