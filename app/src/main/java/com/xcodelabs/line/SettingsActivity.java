package com.xcodelabs.line;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SettingsActivity extends AppCompatActivity {
    private Button saveBtn;
    private EditText userNameET, userBioET;
    private ImageView profileImageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        saveBtn = findViewById(R.id.save_settings_btn);
        userNameET = findViewById(R.id.username_settings);
        userBioET = findViewById(R.id.bio_settings);
        profileImageview = findViewById(R.id.settings_profile_image);
    }
}