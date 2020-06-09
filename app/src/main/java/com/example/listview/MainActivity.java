package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editTen;
    Button btnTao,btnDanhSach;
    TextView textViewHT;
    public static final String MyFile= "com.example.listview.Names";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        SharedPreferences prefs=getSharedPreferences(MyFile,MODE_PRIVATE);
        String hovaten= prefs.getString("HovaTen",null);
        if (!(hovaten == null))  textViewHT.setText(hovaten);
        btnTao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=getSharedPreferences(MyFile,MODE_PRIVATE).edit();
                editor.putString("HovaTen",editTen.getText().toString());
                editor.commit();
                textViewHT.setText(editTen.getText().toString());
                Intent intent=new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btnDanhSach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,danhsachSV.class);
                startActivity(intent);
            }
        });
    }

    public void anhxa(){
        editTen=(EditText) findViewById(R.id.editTen);
        btnTao=( Button) findViewById(R.id.btnTao);
        btnDanhSach=(Button)findViewById(R.id.btnDanhSach);
        textViewHT= (TextView) findViewById(R.id.textViewHT);
    }
}
