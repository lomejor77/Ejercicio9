package cl.awakelabs.ejercicio9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    //Obtencion estatica de las imagenes
    int image1 = R.drawable.ic_launcher_foreground;
    int image2 = R.drawable.baseline_assignment_ind_24;
    int image3 = R.drawable.baseline_back_hand_24;
    int image4 = R.drawable.baseline_balance_24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }

    private void initListeners() {
        ImageButton btnUno = findViewById(R.id.btnUno);
        ImageButton btnDos = findViewById(R.id.btnDos);
        ImageButton btnTres = findViewById(R.id.btnTres);
        ImageButton btnCuatro = findViewById(R.id.btnCuatro);

        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveSecondActivity(image1);
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveSecondActivity(image2);
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveSecondActivity(image3);
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveSecondActivity(image4);
            }
        });
    }

    public void moveSecondActivity(int image1){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("idImg", image1);
        startActivity(intent);
    }
}