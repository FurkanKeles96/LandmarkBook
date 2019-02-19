package com.kelesit.landmarkbook;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView);

        Bitmap pisa = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pisa);
        Bitmap eiffel = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.eiffel);
        Bitmap kizKulesi = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kizkulesi);
        Bitmap londonEye = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.londoneye);

        ArrayList<Bitmap> landmarkImages = new ArrayList<>();  //Integer dizisi tutlarak da R.drawable kısmından görsel alınabilir.
        landmarkImages.add(pisa);
        landmarkImages.add(eiffel);
        landmarkImages.add(kizKulesi);
        landmarkImages.add(londonEye);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        textView.setText(name);

        int position = intent.getIntExtra("position",0);

        imageView.setImageBitmap(landmarkImages.get(position));

    }
}
