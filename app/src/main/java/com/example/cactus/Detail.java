package com.example.cactus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class Detail extends AppCompatActivity {

    TextView detailLang, detailTitle, detailDesc;
    ImageView detailImage;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        detailLang = findViewById(R.id.detailLang);
        detailImage = findViewById(R.id.detailImage);
        detailDesc = findViewById(R.id.detailDesc);
        detailTitle = findViewById(R.id.detailTitle);
        fab = findViewById(R.id.fab);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Detail.this, ChatHomeFragment.class);
                intent.putExtra("dataTitle", detailTitle.getText().toString());
                intent.putExtra("dataDesc", detailDesc.getText().toString());
                // Передайте другие необходимые данные
                startActivity(intent);
            }
        });



        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            detailLang.setText(bundle.getString("Description"));
            detailDesc.setText(bundle.getString("Language"));
            detailTitle.setText(bundle.getString("Title"));
            Glide.with(this).load(bundle.getString("Image")).into(detailImage);
        }
    }
}