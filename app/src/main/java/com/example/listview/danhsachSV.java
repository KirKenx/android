package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class danhsachSV extends AppCompatActivity {

    ListView lvTraiCay;
    ArrayList<SinhVien> arraySinhVien;
    SinhVienAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsach_s_v);
        lvTraiCay =(ListView)findViewById(R.id.listviewSinhVien);
        anhxa();
        adapter= new SinhVienAdapter(this,R.layout.dong_sinh_vien,arraySinhVien);
        lvTraiCay.setAdapter(adapter);
    }
    public void anhxa(){
        lvTraiCay=(ListView)findViewById(R.id.listviewSinhVien);
        arraySinhVien= new ArrayList<>();
        arraySinhVien.add(new SinhVien("Dau Tay",18,R.drawable.dautay));
        arraySinhVien.add(new SinhVien("Xoai",20,R.drawable.xoai));
    }
}
