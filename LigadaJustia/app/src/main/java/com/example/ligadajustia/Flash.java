package com.example.ligadajustia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Flash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
    }

    public void VerMais(View view){
        Uri uri = Uri.parse("https://justiceiros.fandom.com/pt-br/wiki/Flash");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
}
