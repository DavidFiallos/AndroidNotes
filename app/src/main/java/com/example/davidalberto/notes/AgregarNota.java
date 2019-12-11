package com.example.davidalberto.notes;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class AgregarNota extends AppCompatActivity {

    Button Add;
    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.agregar_nota);

        Add = (Button)findViewById(R.id.btn_agregar);

        Bundle bundle = this.getIntent().getExtras();
        type = bundle.getString("type");

        if(type.equals("add")){

            Add.setText("Agregar nota");

        }

    }

}
