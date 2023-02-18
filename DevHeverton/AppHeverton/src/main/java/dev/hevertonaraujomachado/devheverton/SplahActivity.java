package dev.hevertonaraujomachado.devheverton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplahActivity extends AppCompatActivity {

    String TAG = "APP_DEV_HEVERTON";

    int tempoDeEspera = 1000 * 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah);

        Log.d(TAG, "onCreate: Tela Splah Carregando...");
        trocarTela();


    }
    private void trocarTela() {

        Log.d(TAG, "trocarTela: Mudando de tela...");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Log.d(TAG, "trocarTela: Esperando um tempo...");

                Intent trocarDeTela = new Intent(SplahActivity.this, MainActivity.class);
                startActivity(trocarDeTela);
                finish();


            }
        },tempoDeEspera);




    }

}
