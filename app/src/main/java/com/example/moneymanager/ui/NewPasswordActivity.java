package com.example.moneymanager.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.moneymanager.MainActivity;
import com.example.moneymanager.R;

public class NewPasswordActivity extends AppCompatActivity {
    Button btn_sendnewpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password);
        findIds();

    }

    private void findIds() {
        btn_sendnewpass= findViewById(R.id.btn_sendnewpass);
        btn_sendnewpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), SucessNewPassActivity.class);
                startActivity(intent);
            }
        });
    }
}