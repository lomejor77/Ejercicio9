package cl.awakelabs.ejercicio9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initListeners();
        Intent intentGet = getIntent();
        int imageId = intentGet.getIntExtra("idImg", 0);
        Log.d("SecondActivity", String.valueOf(imageId));

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(imageId);
    }

    private void initListeners() {

        Button btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}