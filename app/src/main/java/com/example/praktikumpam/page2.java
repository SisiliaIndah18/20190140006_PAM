package com.example.praktikumpam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
    TextView txEmail, txPassword;
    String nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        txEmail = (TextView) findViewById(R.id.tvuser);
        txPassword = findViewById(R.id.tvpw);
        Bundle b2 = this.getIntent().getExtras();
        String email = b2.getString("a");
        String pass = b2.getString("b");

        txEmail.setText(email);
        txPassword.setText(pass);

    }
}