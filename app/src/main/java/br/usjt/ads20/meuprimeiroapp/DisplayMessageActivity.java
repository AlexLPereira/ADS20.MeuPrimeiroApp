package br.usjt.ads20.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.widget.TextView.*;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        //Apenas um comentario.

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40.0f);
        textView.setText(message);

        ViewGroup layout = findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }
}