package com.example.moneymanager.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.moneymanager.MainActivity;
import com.example.moneymanager.R;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_logout;
    private NavigationView myNav;
    private DrawerLayout myDrawer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findIDs();
    }

    private void findIDs() {
        btn_logout= findViewById(R.id.btnLogout);
        btn_logout.setOnClickListener(this);
        myNav=findViewById(R.id.my_navi);
        myDrawer= findViewById(R.id.myDrawer);
    }

    @Override
    public void onClick(View view) {
        if(view==btn_logout){
            Intent intent= new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
}