package com.test.database;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText username;
    private EditText password;
    private EditText name;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        name = findViewById(R.id.name);
        register = findViewById(R.id.register);
        register.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Entity entity = new Entity();
        entity.setUsername(username.getText().toString());
        entity.setPassword(password.getText().toString());
        entity.setName(name.getText().toString());
        entity.save();
        username.setText("");
        password.setText("");
        name.setText("");
    }
}
