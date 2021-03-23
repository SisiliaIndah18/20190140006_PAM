package com.example.praktikumpam;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edemail, edpassword;
    String EmailKey, PwKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.LoginBtn);
        edemail = findViewById(R.id.IdEmail);
        edpassword = findViewById(R.id.IdPw);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EmailKey = "ndh1994@gmail.com";
                PwKey = "2001";

                if (EmailKey.equals(edemail.getText().toString()) && PwKey.equals(edpassword.getText().toString())){
                    Toast s = Toast.makeText(getApplicationContext(),
                            "Login Sukses Email Anda : " +EmailKey+ " dan Password Anda : "+PwKey+ "", Toast.LENGTH_LONG);
                    s.show();

                    Bundle b = new Bundle();
                    b.putString("a", EmailKey.trim());
                    b.putString("b", PwKey.trim());

                    Intent intentBaru = new Intent( MainActivity.this, page2.class);
                    intentBaru.putExtras(b);
                    startActivity(intentBaru);
                }

                else if (!EmailKey.equals(edemail.getText().toString()) && !PwKey.equals(edpassword.getText().toString())){
                    Toast s = Toast.makeText(getApplicationContext(),
                            "Email dan Password Salah !!", Toast.LENGTH_SHORT);
                    s.show();
                }
            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.baru)
        {
            Intent intent = new Intent(MainActivity.this, form_baru.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}