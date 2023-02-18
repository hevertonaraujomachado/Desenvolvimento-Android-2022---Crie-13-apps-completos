package dev.hevertonaraujomachado.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import dev.hevertonaraujomachado.myapplication.model.Cliente;

public class MainActivity extends AppCompatActivity {

    String TAG = "App_Minha_Ideia";

    Cliente objCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        objCliente = new Cliente("veve", "veve@veve.com", "899999992",32,true);

Log.i(TAG, "onCreate: objCliente Nome"+objCliente.getNome());
Log.i(TAG, "onCreate: objCliente email"+objCliente.getEmail());
Log.i(TAG, "onCreate: objCliente telefone"+objCliente.getTelefone());
Log.i(TAG, "onCreate: objCliente idade"+objCliente.getIdade());
Log.i(TAG, "onCreate: objCliente sexo"+objCliente.isSexo());


    }
}