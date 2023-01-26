package com.example.alimashayekhi.nudemcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    SwitchCompat switchButton;
    ImageView imageViewLight;
    SwitchCompat switchButton1;
    ImageView imageViewLight1;
    SwitchCompat switchButton2;
    ImageView imageViewLight2;
    SwitchCompat switchButton3;
    ImageView imageViewLight3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchButton=findViewById(R.id.switchButton);
        imageViewLight=findViewById(R.id.imageView);

        switchButton1=findViewById(R.id.switchButton1);
        imageViewLight1=findViewById(R.id.imageView1);


        switchButton2=findViewById(R.id.switchButton2);
        imageViewLight2=findViewById(R.id.imageView2);

        switchButton3=findViewById(R.id.switchButton3);
        imageViewLight3=findViewById(R.id.imageView3);

        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(compoundButton.isChecked()){
                    imageViewLight.setImageResource(R.drawable.p1);

                }else{ imageViewLight.setImageResource(R.drawable.p2);}

            }

        });


        switchButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(compoundButton.isChecked()){
                    imageViewLight1.setImageResource(R.drawable.p1);

                }else{ imageViewLight1.setImageResource(R.drawable.p2);}

            }

        });

        switchButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(compoundButton.isChecked()){
                    imageViewLight2.setImageResource(R.drawable.p1);

                }else{ imageViewLight2.setImageResource(R.drawable.p2);}

            }

        });
        switchButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(compoundButton.isChecked()){
                    imageViewLight3.setImageResource(R.drawable.p1);

                }else{ imageViewLight3.setImageResource(R.drawable.p2);}

            }

        });
    }
}
