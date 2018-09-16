package com.example.wangnan7.qrcodedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.lib.QRCodeUtil.QRCodeUtil;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;
    private EditText pEdit;
    private EditText sEdit;
    private Button cButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = findViewById(R.id.iv);
        pEdit = findViewById(R.id.editP);
        sEdit = findViewById(R.id.editS);
        cButton = findViewById(R.id.commit);

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strPEdit = pEdit.getText().toString();
                String strSedit = sEdit.getText().toString();
                String string = "{\"p\":\""+strPEdit+"\",\"s\":\""+strSedit+"\"}";

                mImageView.setImageBitmap(QRCodeUtil.createQRCodeBitmap(string, 400));
            }
        });
    }
}
