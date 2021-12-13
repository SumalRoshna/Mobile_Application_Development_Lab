package com.starlord.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.starlord.register.R;

public class MainActivity extends AppCompatActivity {

    EditText usr, pwd;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usr = (EditText) findViewById(R.id.username);
        pwd = (EditText) findViewById(R.id.password);
        b1 = (Button) findViewById(R.id.button);
    }


    public void verify(View view) {
        String a = usr.getText().toString();
        String b = pwd.getText().toString();

        if (a.equals("Sumna") && b.equals("Roshna")){
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }
}