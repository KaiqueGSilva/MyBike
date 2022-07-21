package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class CatalogoActivity extends AppCompatActivity {
    RecyclerView idRecCatalogo;
    List<Bike> listabikes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalogo_layout);

        idRecCatalogo = findViewById(R.id.idRecCatalogo);

        //Instanciar a classe adaptadora

        MyAdapterBike adapterBike = new MyAdapterBike();

        //Executando a montagem da lista

        idRecCatalogo.setAdapter(adapterBike);

        //Lista das bicicletas


    }
}