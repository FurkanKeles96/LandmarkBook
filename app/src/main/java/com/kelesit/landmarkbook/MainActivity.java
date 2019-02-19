package com.kelesit.landmarkbook;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayList<String> landmarkNames = new ArrayList<>();
        landmarkNames.add("Pisa");
        landmarkNames.add("Eiffel");
        landmarkNames.add("Kız Kulesi");
        landmarkNames.add("London Eye");

        Bitmap pisa = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pisa);
        Bitmap eiffel = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.eiffel);
        Bitmap kizKulesi = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kizkulesi);
        Bitmap londonEye = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.londoneye);

        ArrayList<Bitmap> landmarkImages = new ArrayList<>();  //Integer dizisi tutlarak da R.drawable kısmından görsel alınabilir.
        landmarkImages.add(pisa);
        landmarkImages.add(eiffel);
        landmarkImages.add(kizKulesi);
        landmarkImages.add(londonEye);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, landmarkNames);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



            }
        });
    }
}
