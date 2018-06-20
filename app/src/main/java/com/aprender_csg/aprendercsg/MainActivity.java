package com.aprender_csg.aprendercsg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView biologiaComunTextView = findViewById(R.id.biologia_comun_textview);
        biologiaComunTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent biologiaComunIntent=new Intent(MainActivity.this,BiologiaComunActivity.class);
                startActivity(biologiaComunIntent);
            }
        });
        TextView mateComunTextView = findViewById(R.id.mate_comun_textview);
        mateComunTextView.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                Intent mateComunIntent=new Intent(MainActivity.this,MateComunActivity.class);
                startActivity(mateComunIntent);
            }
        });
        TextView mateSuperiorTextView = findViewById(R.id.mate_superior_textview);
        mateSuperiorTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent mateSuperiorIntent=new Intent(MainActivity.this,MateSuperiorActivity.class);
                startActivity(mateSuperiorIntent);
            }
        });
        TextView biologiaSuperiorTextView = findViewById(R.id.biologia_superior_textview);
        biologiaSuperiorTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent biologiaSuperiorIntent=new Intent(MainActivity.this,BiologiaSuperiorActivity.class);
                startActivity(biologiaSuperiorIntent);
            }
        });
        TextView quimicaTextView = findViewById(R.id.quimica_textview);
        quimicaTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent quimicaIntent=new Intent(MainActivity.this,QuimicaActivity.class);
                startActivity(quimicaIntent);
            }
        });
        TextView fisicaTextView = findViewById(R.id.fisica_textview);
        fisicaTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent fisicaIntent=new Intent(MainActivity.this,FisicaActivity.class);
                startActivity(fisicaIntent);
            }
        });




    }

}
