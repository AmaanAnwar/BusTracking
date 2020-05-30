package com.np.bustracking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class adminNotice extends AppCompatActivity {
Button submit;
EditText notice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_notice);
        notice=findViewById(R.id.notice);
        String Notice=notice.getText().toString().trim();
        submit=findViewById(R.id.Submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Notice Submited",Toast.LENGTH_SHORT).show();
                notice.setText("");
            }
        });

    }
}
