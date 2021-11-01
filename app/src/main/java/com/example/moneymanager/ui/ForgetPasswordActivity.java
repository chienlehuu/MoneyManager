package com.example.moneymanager.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.moneymanager.MainActivity;
import com.example.moneymanager.R;

import org.w3c.dom.Text;

public class ForgetPasswordActivity extends AppCompatActivity {
    private Button btn_send;
    private TextView tvBackLogin;
    private EditText edt_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        findIDs();
    }

    private void findIDs() {
        btn_send=findViewById(R.id.btn_send);
        tvBackLogin=findViewById(R.id.tvback_login);
        edt_account= findViewById(R.id.edt_forgetpass);

        tvBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),SuccessForgetPassActivity.class);
                startActivity(intent);

            }
        });



    }
}