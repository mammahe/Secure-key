package com.sairamkrishna.keystoresecure;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.sairamkrishna.keystoresecure.Secure;

public class MainActivity extends AppCompatActivity {
private TextView encryption;
    private TextView decryption;
    private TextView before_encryption;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        before_encryption=findViewById(R.id.before_encryption);
        encryption=findViewById(R.id.encryption);
        decryption=findViewById(R.id.decryption);
        String name = "sairamkrishnamammahe";
        before_encryption.setText(name);
        Secure.TOKEN_KEY ="fqJfdzGDvfwbedsKSUGty3VZ9taXxMVw";
        try {
            decryption.setText("decrypt  :"+Secure.decrypt(Secure.encrypt(name)));
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
           encryption.setText("encrypt   :"+Secure.encrypt(name));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
