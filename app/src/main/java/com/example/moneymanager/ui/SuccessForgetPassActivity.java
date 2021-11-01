package com.example.moneymanager.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.moneymanager.R;

public class SuccessForgetPassActivity extends AppCompatActivity {
    Button btn_newpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_forget_pass);
        findIds();
    }

    private void findIds() {
        btn_newpass= findViewById(R.id.btn_newpass);
        btn_newpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),NewPasswordActivity.class);
                startActivity(intent);

            }
        });
    }
}