package com.example.dariomolina.life;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by dariomolina on 11/5/17.
 */

public class Supporters extends AppCompatActivity    {

    private TextView intro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supporters_layout);

        intro = (TextView) findViewById(R.id.intro);

    }
}
