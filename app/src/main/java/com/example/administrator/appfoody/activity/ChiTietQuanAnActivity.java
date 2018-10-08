package com.example.administrator.appfoody.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.appfoody.R;
import com.example.administrator.appfoody.model.QuanAnModel;

public class ChiTietQuanAnActivity extends AppCompatActivity {
    
    TextView txttieudetoolbar,txttenquanan,txtdiachi,txtthoigianhoatdong,txttrangthaihoatdong,txttongsohinhanh,txttongsobinhluan,txttongsocheckin,txttongsoluulai;
    ImageView imghinhanhquanan;
    QuanAnModel quanAnModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main_chitietquanan);
        Intent intent=getIntent();
        quanAnModel = (QuanAnModel) intent.getParcelableExtra("quanan");
        anhXa();
        ganDuLieu();
    }

    private void ganDuLieu() {
        txttenquanan.setText(quanAnModel.getTenquanan());
        txtdiachi.setText(quanAnModel.getChiNhanhQuanAnModelList().get(0).getDiachi());
        txtthoigianhoatdong.setText(quanAnModel.getGiomocua()+"-"+quanAnModel.getGiodongcua());
        txttongsohinhanh.setText(quanAnModel.getHinhanhquanan().size()+"");
        txttongsobinhluan.setText(quanAnModel.getBinhLuanModelList().size()+"");
        txttieudetoolbar.setText(quanAnModel.getTenquanan());
    }

    private void anhXa() {
        txttongsobinhluan=findViewById(R.id.txt_tongsobinhluan);
        txttenquanan=findViewById(R.id.txt_tenquanan);
        txtdiachi=findViewById(R.id.txt_diachiquanan);
        txtthoigianhoatdong=findViewById(R.id.txt_thoigianhoatdong);
        txttrangthaihoatdong=findViewById(R.id.txt_trangthaihoatdong);
        txttongsohinhanh=findViewById(R.id.txt_tongsohinhanh);
        txttongsocheckin=findViewById(R.id.txt_tongsocheckin);
        txttongsoluulai=findViewById(R.id.txt_tongsoluulai);
        imghinhanhquanan=findViewById(R.id.img_hinhquanan);
        txttieudetoolbar=findViewById(R.id.txt_tieudetoolbar);

    }
}
