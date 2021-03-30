package com.example.praktikumpam;

import android.app.Activity;
import android.widget.PopupMenu;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class home_act extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    private ListView list;

    private ListViewAdpter adapter;

    String[] listNama;
     public static ArrayList<ClassNama> classNamaArrayList = new ArrayList<ClassNama>();

     Bundle bundle = new Bundle();
     Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_act);

        listNama = new String[]{"Inayah", "Ilham", "Eris", "Fikri", "Maul", "Intan", "Vina", "Gita", "Vian", "Lutfi"};
        list = findViewById(R.id.listkontak);

        classNamaArrayList = new ArrayList<>();

        for  (int i = 0; i <listNama.length; i++)
        {
            ClassNama classNama = new ClassNama(listNama[i]);
            classNamaArrayList.add(classNama);
        }

        adapter = new ListViewAdpter(this);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nama = classNamaArrayList.get(position).getName();
                bundle.putString("a", nama.trim());

                PopupMenu pm = new PopupMenu(getApplicationContext(), view);
                pm.setOnMenuItemClickListener(home_act.this);
                pm.inflate(R.menu.popup_menu);
                pm.show();
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.mnview:
                intent = new Intent(getApplicationContext(),act_lihatdata.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.mnedit:
                Toast.makeText(getApplicationContext(), "This Is For Edit Contact",
                        Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }
}

