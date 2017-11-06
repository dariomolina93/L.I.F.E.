package com.example.dariomolina.life;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.text.Html;
import android.widget.Button;

import org.w3c.dom.Text;

/**
 * Created by dariomolina on 11/4/17.
 */

public class Enroll extends AppCompatActivity implements View.OnClickListener{

    private TextView who;
    private TextView cost;
    private Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enroll_layout);

        who = (TextView) findViewById(R.id.who);
        cost = (TextView) findViewById(R.id.cost);

        who.setText(Html.fromHtml("<b>Who is elgible</b>: Students currently enrolled in first grade through middle school."));
        cost.setText(Html.fromHtml("<b>Cost:</b> Because of the generous support of L.I.F.E.’s financial partners, we are able to provide this resource free of charge for our students. However, we do require parent participation. Parents are asked to provide transportation to and from the center, attend several workshops, and occasionally bring healthy snacks."));

        button = (Button) findViewById(R.id.enroll);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == button.getId()) {
            Uri uri = Uri.parse("http://lifeisforeveryoneinc.org/enroll/"); // missing 'http://' will cause crashed

            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }
}
