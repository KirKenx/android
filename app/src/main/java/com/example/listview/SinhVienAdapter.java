package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SinhVienAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<SinhVien> sinhVienList;

    public SinhVienAdapter(Context context, int layout, List<SinhVien> sinhVienList) {
        this.context = context;
        this.layout = layout;
        this.sinhVienList = sinhVienList;
    }

    @Override
    public int getCount() {
        return sinhVienList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView= inflater.inflate(layout,null);
        TextView txtTen= ( TextView)convertView.findViewById(R.id.textviewTen);
        TextView txtTuoi =( TextView) convertView.findViewById(R.id.textviewaTuoi);
        ImageView  imgHinh= (ImageView) convertView.findViewById(R.id.imageviewHinhAnh);
        SinhVien sinhvien=sinhVienList.get(position);

        txtTen.setText(sinhvien.getTen());
        txtTuoi.setText(String.valueOf(sinhvien.getTuoi()));
        imgHinh.setImageResource(sinhvien.getHinh());
        return convertView;
    }
}
