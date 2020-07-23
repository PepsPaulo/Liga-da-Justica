package com.example.ligadajustia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Vizualizar(View view) {
        RadioButton rdbBtm = findViewById(R.id.rdbBtm);
        RadioButton rdbFls = findViewById(R.id.rdbFls);
        RadioButton rdbSpm = findViewById(R.id.rdbSpm);
        Intent intent;

        if(rdbBtm.isChecked())
            intent = new Intent(this, Batman.class);
        else if(rdbFls.isChecked())
            intent = new Intent(this, Flash.class);
        else if(rdbSpm.isChecked())
            intent = new Intent(this, Superman.class);
        else
            intent = new Intent(this, MulherMaravilha.class);

        startActivity(intent);
    }
}
