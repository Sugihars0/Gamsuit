package com.ahay.gamsuit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView janjipalsu;
    Button buton;
    int angka=0;

    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        janjipalsu = findViewById(R.id.janjipalsu);
        buton = findViewById(R.id.buton);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka = random.nextInt(3) + 1;
                if(angka == 1){
                    janjipalsu.setText("BATU");
                }else if(angka == 2){
                    janjipalsu.setText("GUNTING");
                }else if(angka == 3){
                    janjipalsu.setText("KERTAS");
                }
            }
        });

    }
}
