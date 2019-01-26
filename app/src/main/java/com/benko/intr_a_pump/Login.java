package com.benko.intr_a_pump;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText physician_id_field;
    private EditText password_field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        physician_id_field = (EditText) findViewById(R.id.physician_id);
        password_field = (EditText) findViewById(R.id.physician_password);
    }

    public void onLoginClick(View view) {
        String physicianId = physician_id_field.getText().toString();
        String password = password_field.getText().toString();
        if(physicianId.equals("001425") && password.equals("test")) {
            Physician physician = new Physician(physicianId, password);
            Intent intent = new Intent(this, home.class);
            startActivity(intent);
        } else {
            Toast toasty = Toast.makeText(getApplicationContext(), R.string.error_message, Toast.LENGTH_SHORT);
            toasty.show();
        }

    }
}
