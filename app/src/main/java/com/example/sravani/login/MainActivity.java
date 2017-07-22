package com.example.sravani.login;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText et_Username;
    private EditText et_Password;
    private Button bt_LogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Username = (EditText) findViewById(R.id.et_Username);
        et_Password = (EditText) findViewById(R.id.et_Password);
        bt_LogIn = (Button) findViewById(R.id.bt_LogIn);

        bt_LogIn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                String username = String.valueOf(et_Username.getText());
                String password = String.valueOf(et_Password.getText());

                //compares username and password
                
                if (username.equals("admin") && password.equals("admin")) {
                    Toast.makeText(MainActivity.this, "Username and password is correct",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Username and password is incorrect",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

