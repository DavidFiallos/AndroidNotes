package com.example.davidalberto.notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;
import android.widget.TextView;
import android.view.MenuItem;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private static final int ADD = Menu.FIRST;
    private static final int DELETE = Menu.FIRST + 1;
    public static final int EXIT = Menu.FIRST + 2;
    ListView lista;
    TextView textlista;
    AdaptadorBD DB;
    List<String> item = null;
    String getTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textlista = (TextView)findViewById(R.id.txt_lista);
        lista = (ListView)findViewById(R.id.lv_lista);
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(1, ADD, 0, R.string.menu_crear);
        menu.add(2, DELETE, 0, R.string.menu_borrar_todas);
        menu.add(1, EXIT, 0, R.string.menu_salir);
        super.onCreateOptionsMenu(menu);

        return true;
    }

    public boolean onOptionsItemsSelected(MenuItem item) {

        int id = item.getItemId();
        switch(id) {

            case ADD:
                actividad("add");

                return true;

            case DELETE:

                return true;

            case EXIT:

                finish();
                return true;

            default: return super.onOptionsItemSelected(item);
        }
    }

    public void actividad(String act){

        String type = "", content = "";
        if(act.equals("add")){

            type = "add";
            Intent intent = new Intent(MainActivity.this, AgregarNota.class);
            intent.putExtra("type", type);
            startActivity(intent);
        }
    }
}
