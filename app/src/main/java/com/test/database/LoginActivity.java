package com.test.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText username;
    private EditText password;
    private Button login;
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        name=findViewById(R.id.name);
        login=findViewById(R.id.login);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        List<Entity> entityList=new ArrayList<>();
        entityList=Entity.listAll(Entity.class);
        for (Entity entity : entityList)
        {
            if (
                    username.getText().toString().equals(entity.getUsername())
                    &&
                    password.getText().toString().equals(entity.getPassword()))
            {
                name.setText(entity.getName());
                return;
            }
        }
    }
}
