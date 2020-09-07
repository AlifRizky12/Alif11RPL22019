package com.example.alif11rpl022019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class ControllClass extends AppCompatActivity {

    private  SharedPreferences pref;
    private  SharedPreferences pref2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pref = getSharedPreferences("login", MODE_PRIVATE);
        pref2 = getSharedPreferences("dataLogin", MODE_PRIVATE);
        if (pref.getString("username", "").isEmpty() && pref.getString("password", "").isEmpty()) {
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            finish();
        } else {
            SharedPreferences pref = getSharedPreferences("login", MODE_PRIVATE);
            String getName = pref.getString("username", "");
            startActivity(new Intent(getApplicationContext(), MainMenuActivity.class));
            Toast.makeText(this, "Welcome " + getName, Toast.LENGTH_SHORT).show();
            finish();
        }

        if (pref2.getString("user", "").equalsIgnoreCase("alif")) {
            SharedPreferences pref2 = getSharedPreferences("dataLogin",MODE_PRIVATE);
            String getName2 = pref2.getString("user","");
            startActivity(new Intent(getApplicationContext(),MainMenuActivity.class));
            Toast.makeText(this, "Welcome "+getName2, Toast.LENGTH_SHORT).show();
            finish();
        }else{

        }
    }
}
