package com.yzk.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView1;
    TextView textView2;
    Button button1;
    String username;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.login);
        textView = findViewById(R.id.message);
        textView1 = findViewById(R.id.username);
        textView2 = findViewById(R.id.password);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = textView1.getText().toString();
                password = textView2.getText().toString();
                if (username.equals("admin") && password.equals("admin")) {
                    Toast.makeText(MainActivity.this, "用户名密码正确，登录成功", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "用户名或密码错误，登录失败", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }


}