package com.np.bustracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class chooseLogin extends AppCompatActivity {
    TextView mydata, adminLogin, studentLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_login);
        mydata = findViewById(R.id.skip1);
        adminLogin = findViewById(R.id.adminlogin);
        studentLogin = findViewById(R.id.studentlogin);
        adminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AdminMainActivity.class);
                startActivity(intent);
            }
        });
        studentLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListOfBuses.class);
                startActivity(intent);
            }
        });
    }
}
