package com.np.bustracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AdminMainActivity extends AppCompatActivity {
TextView busdet,busstat,notice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main);
        busdet=findViewById(R.id.edtbusdet);
        busstat=findViewById(R.id.editbusstatus);
        notice=findViewById(R.id.notice);
        busdet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),AdminBusesList.class);
                startActivity(intent);
            }
        });
        busstat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),adminBusStatus.class);
                startActivity(intent);

            }
        });
        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),adminNotice.class);
                startActivity(intent);
            }
        });
    }
}
