package com.example.soundsapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //MediaPlayer Array
    private MediaPlayer soundPlayer [] = new MediaPlayer[14];

    //Resources Array
    private int soundResources [] = {R.raw.ah_fala_bosta, R.raw.banheira_gugu, R.raw.bonini, R.raw.bonini_2, R.raw.cavalaria, R.raw.cavalo_passando, R.raw.estados_unidos, R.raw.fodao, R.raw.pao_na_chapa, R.raw.puto, R.raw.salva_de_la_cidra, R.raw.sosteles, R.raw.sostenes, R.raw.vai_ganhar_galvao};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize the MediaPlayer objects and assign them
        //Sounds from the soundResources Array
        for (int i = 0; i < soundPlayer.length; i++) {
            soundPlayer[i] = MediaPlayer.create(this, soundResources[i]);
        }//end for
    }

    public void buttonClicked(View view) {

        switch (view.getId()){
            case R.id.btn1:
                soundPlayer[0].start();
                break;

            case R.id.btn2:
                soundPlayer[1].start();
                break;

            case R.id.btn3:
                soundPlayer[2].start();
                break;

            default:
                break;

        }//end switch
    }//end button clicked
}
