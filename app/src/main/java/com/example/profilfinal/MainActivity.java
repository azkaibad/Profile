package com.example.profilfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnTelepon, btnEmail, btMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTelepon = findViewById(R.id.telepon);

        btnTelepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor="088988023427";
                Intent memanggil = new Intent(Intent.ACTION_DIAL);
                memanggil.setData(Uri.fromParts("tel", nomor, null));
                startActivity(memanggil);
            }
        });

        btnEmail = findViewById(R.id.email);

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("mailto:" + "azkaibad12@gmail.com"));
                startActivity(intent);
            }
        });

        btMaps = findViewById(R.id.maps);
        btMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:?q=-7.034428350446757, 110.70188721875789");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

    }
}