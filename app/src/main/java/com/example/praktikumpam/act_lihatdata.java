package com.example.praktikumpam;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class act_lihatdata extends AppCompatActivity {

    TextView tvnama, tvnomor;
    String nama;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");
        setContentView(R.layout.act_lihatdata);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        switch (nama)
        {
            case "Inayah" :
                tvnama.setText("Inayah M");
                tvnomor.setText("0812223344");
                break;

            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("081333224455");
                break;

            case "Eris":
                tvnama.setText("Eris J");
                tvnomor.setText("08125533344");
                break;

            case "Fikri":
                tvnama.setText("m Fikri");
                tvnomor.setText("0812245334");
                break;

            case "Maul":
                tvnama.setText("Maul M");
                tvnomor.setText("08126633344");
                break;

            case "Intan":
                tvnama.setText("Intan S");
                tvnomor.setText("08122555344");
                break;

            case "Vina":
                tvnama.setText("Vina R");
                tvnomor.setText("08125556344");
                break;

            case "Gita" :
                tvnama.setText("Gita S");
                tvnomor.setText("08199233344");
                break;

            case "Lutfi" :
                tvnama.setText("Lutfi M");
                tvnomor.setText("08122233234");
                break;

            case "Vian" :
                tvnama.setText("Vian M");
                tvnomor.setText("08122969344");
                break;
        }
    }
}
