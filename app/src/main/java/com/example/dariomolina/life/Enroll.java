package com.example.dariomolina.life;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.text.Html;
import android.widget.Button;

import org.w3c.dom.Text;

/**
 * Created by dariomolina on 11/4/17.
 */

public class Enroll extends AppCompatActivity{

    private TextView who;
    private TextView cost;
    private Button button;
    private LinearLayout layout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enroll_layout);

        who = (TextView) findViewById(R.id.who);
        cost = (TextView) findViewById(R.id.cost);

        who.setText(Html.fromHtml("<b>Who is elgible</b>: Students currently enrolled in first grade through middle school."));
        cost.setText(Html.fromHtml("<b>Cost:</b> Because of the generous support of L.I.F.E.’s financial partners, we are able to provide this resource free of charge for our students. However, we do require parent participation. Parents are asked to provide transportation to and from the center, attend several workshops, and occasionally bring healthy snacks."));

        button = (Button) findViewById(R.id.enroll);


        Button steam = new Button(this);
        steam.setText("STEAM");
        steam.setMinWidth(0);
        steam.setTextSize(11);

        Button supporters = new Button(this);
        supporters.setText("Sponsors");
        supporters.setMinWidth(0);
        supporters.setTextSize(11);

        Button home = new Button(this);
        home.setText("Home");
        home.setMinWidth(0);
        home.setTextSize(11);

        Button involved = new Button(this);
        involved.setText("Get Involved");
        involved.setMinWidth(0);
        involved.setTextSize(10);

        steam.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent enroll = new Intent(getApplicationContext(), STEAM.class);
                startActivity(enroll);
                return;
            }
        });



        supporters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent support = new Intent(getApplicationContext(),Supporters.class);
                startActivity(support);
                return;
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent steam = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(steam);
                return;

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://lifeisforeveryoneinc.org/enroll/"); // missing 'http://' will cause crashed

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT);
        params.gravity= Gravity.CENTER;
        params.topMargin = 70;

        layout = (LinearLayout) findViewById(R.id.layout);

        LinearLayout layout2 = new LinearLayout(this);
        layout2.setOrientation(LinearLayout.HORIZONTAL);
        layout2.setLayoutParams(params);
        layout.addView(layout2);
        layout2.addView(home);
        layout2.addView(steam);
        layout2.addView(supporters);
        layout2.addView(involved);
    }

}
