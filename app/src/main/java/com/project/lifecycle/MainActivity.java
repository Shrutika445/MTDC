package com.project.lifecycle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onStart() {
        super.onStart();

            {
                Toast.makeText(MainActivity.this,"onStart",Toast.LENGTH_SHORT).show();

            }

    }

    @Override
    protected void onStop() {
        super.onStop();

            {
                Toast.makeText(MainActivity.this,"onStop",Toast.LENGTH_SHORT).show();

            }

    }

    @Override
    protected void onResume() {
        super.onResume();
        {
            Toast.makeText(MainActivity.this,"onResume",Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btnspy);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this,"onCreate",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        


    }

    @Override
    protected void onPause() {
        super.onPause();
        {
            Toast.makeText(MainActivity.this,"onPause",Toast.LENGTH_SHORT).show();

        }
    }


}
