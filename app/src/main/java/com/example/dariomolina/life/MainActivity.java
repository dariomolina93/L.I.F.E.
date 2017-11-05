package com.example.dariomolina.life;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button enroll;
    private Button steam;
    private Button supporters;
    private Button involved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enroll = (Button) findViewById(R.id.enroll);

        enroll.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent enroll = new Intent(getApplicationContext(), Enroll.class);
                startActivity(enroll);
                return;
            }
        });
        steam = (Button) findViewById(R.id.steam);
        supporters = (Button) findViewById(R.id.supporters);
        involved = (Button) findViewById(R.id.involved);
    }
}
