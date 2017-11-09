package com.example.dariomolina.life;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * Created by dariomolina on 11/5/17.
 */

public class Supporters extends AppCompatActivity implements View.OnClickListener {

    private TextView intro;
    private LinearLayout layout;
    private String[] supporters;
    private String[] volunteers;

    private Button home;
    private Button enroll;
    private Button steam;
    private Button involved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supporters_layout);

        layout = (LinearLayout) findViewById(R.id.layout);

        intro = (TextView) findViewById(R.id.intro);

        intro.setText("L.I.F.E., Inc. is a non-profit 501 (c) (3) corporation.\n" +
                "\n" +
                "Major funding comes from Foundations in Salinas and Monterey," +
                " Agricultural Companies, various churches and their thrift stores, and individuals.");

        addFinancialSupporters();
        addVolunteers();

        LinearLayout layout2 = new LinearLayout(this);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT);
        params.gravity=Gravity.CENTER;
        layout2.setLayoutParams(params);
        layout2.setOrientation(LinearLayout.HORIZONTAL);

        layout.addView(layout2);



        home = new Button(this);
        home.setOnClickListener(this);
        home.setText("Home");
        home.setTextSize(11);


        enroll = new Button(this);
        enroll.setOnClickListener(this);
        enroll.setText("Enroll");
        enroll.setTextSize(11);

        steam = new Button(this );
        steam.setOnClickListener(this);
        steam.setText("STEAM");
        steam.setTextSize(11);

        involved = new Button(this);
        involved.setOnClickListener(this);
        involved.setText("Get Involved");
        involved.setTextSize(10);


        layout2.addView(home);
        layout2.addView(enroll);
        layout2.addView(steam);
        layout2.addView(involved);

    }

    @Override
    public void onClick(View view) {

        if(view.equals(home))
        {
            Intent home = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(home);
            return;
        }
        else if(view.equals(enroll))
        {
            Intent enroll = new Intent(getApplicationContext(), Enroll.class);
            startActivity(enroll);
            return;
        }

    }

    private void addVolunteers()
    {
        volunteers = new String[6];
        TextView vol = new TextView(this);
        LinearLayout.LayoutParams meters = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        //meters.topMargin = 45;
        meters.bottomMargin = 35;
        meters.gravity = Gravity.CENTER;

        vol.setText("Volunteers:");
        vol.setTextSize(22);
        vol.setLayoutParams(meters);

        layout.addView(vol);

        volunteers[0] =  "<li><a 'href=\"http://www.dlshs.org/\"'>De La Salle High School</a><a> Volunteers, Concord, CA</a></li>";
        volunteers[1] =  "<li><a 'href=\"http://www.notredamesalinas.org/\"'>Notre Dame </a> and <a href=\"http://www.palmaschool.org/\"> Palma</a>  High School Volunteers, Salinas, CA</li>";
        volunteers[2] =  "<li><a 'href=\"http://www.salinas.k12.ca.us/sites/AHS/Index.htm\"'>Alisal High School</a> Students and Alumni, Salinas, CA</li>";
        volunteers[3] =  "<li><a 'href=\"http://www.carondelet.net/\"'>Carondelet High School </a> Volunteers, Concord, CA</li>";
        volunteers[4] =  "<li>Adult tutors from Salinas, Monterey, and Carmel";
        volunteers[5] =  "<li>Salinas High Rotary Interact Club Volunteers, Salinas, CA</li>";


        for(int i = 0; i < volunteers.length; i++)
        {
            Log.d("BEFORE temp", "before temp");
            TextView temp = new TextView(this);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            if(i == 0)
                params.topMargin = 15;

            params.gravity = Gravity.CENTER;

            temp.setWidth(750);
            temp.setHeight(200);

            temp.setLayoutParams(params);

            temp.setText(removeUnderline(volunteers[i]));

            //temp.setTextColor(Color.parseColor("#2d5c88"));
            temp.setLinkTextColor(Color.parseColor("#2d5c88"));
            temp.setMovementMethod(LinkMovementMethod.getInstance());
            layout.addView(temp);

        }
    }

    private void addFinancialSupporters()
    {

        supporters = new String[17];

        supporters[0] = "<li><a 'href=\"http://www.cfmco.org/\"'>Community Foundation For Monterey</a></li>";
        supporters[1] = "<li><a 'href=\"http://www.montereypeninsulafoundation.org/\"'>Monterey Peninsula Foundation</a></li>";
        supporters[2] = "<li><a 'href=\"http://www.hardenfoundation.org/\"'>The Harden Foundation, Salinas, CA</a></li>";
        supporters[3] = "<li><a 'href=\"http://www.packard.org/\"'>David and Lucile Packard Foundation</a></li>";
        supporters[4] = "<li><a> Yellow Brick Road Benefit Shop, Carmel, CA</a></li>";
        supporters[5] = "<li><a 'href=\"http://butterflychurch.org/Welcome.html\"'>Pacific Grove First United Methodist Church:</a><a>Church Mouse Outreach Grant Program</a></li>";
        supporters[6] = "<li><a 'href=\"http://www.srvumc.org/\"'>San Ramon Valley United</a>";
        supporters[7] = "<li><a>United Methodist Women of </a><a 'href=\"http://www.montereymethodist.org/\"'>Monterey United Methodist Church</a></li>";
        supporters[8] = "<li><a 'href=\"http://www.salinasfirst.org/\"'>United Methodist Women of First United Methodist Church Salinas</a></li>";
        supporters[9] = "<li><a 'href=\"http://www.northminster.org/\"'>Northminster Presbyterian Church</a></li>";
        supporters[10] = "<li><a 'href=\"http://sallychurchfoundation.org/\"'>Sally Hughes Church Foundation</a></li>";
        supporters[11] = "<li><a 'href=\"http://www.pebblebeach.com/about/pebble-beach-company-foundation\"'>Pebble Beach Company Foundation</a></li>";
        supporters[12] = "<li><a 'href=\"http://www.nbrfoundation.org/home.html\"'>Nancy Buck Ransom Foundation</a></li>";
        supporters[13] = "<li><a 'href=\"http://fpcmonterey.org/\"'>First Presbyterian Church of Monterey</a></li>";
        supporters[14] = "<li><a 'href=\"http://trinityumcsunnyvale.org/\"'>Sunnyvale Trinity United Methodist Church</a></li>";
        supporters[15] = "<li><a 'href=\"http://www.dlshs.org/\"'>De La Salle High School, Concord, CA</a></li>";
        supporters[16] = "<li><a 'href=\"http://mbosc.net/\"'>Monterey Bay Officers' Spouses Club</a></li>";


        //StringUtil.removeUnderlines((Spannable)txtUrlGoogle.getText());

        for(int i = 0; i < supporters.length; i++)
        {
            Log.d("BEFORE temp", "before temp");
            TextView temp = new TextView(this);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            //params.topMargin = 5;
            params.gravity = Gravity.CENTER;

            if(i == 0)
                params.topMargin = 65;

            temp.setWidth(750);
            temp.setHeight(200);

            temp.setText(removeUnderline(supporters[i]));
            //temp.setTextColor(Color.parseColor("#2d5c88"));
            temp.setLinkTextColor(Color.parseColor("#2d5c88"));
            temp.setMovementMethod(LinkMovementMethod.getInstance());

            temp.setLayoutParams(params);
            layout.addView(temp);

        }
    }

    private Spannable removeUnderline(String link)
    {
        Spannable s = (Spannable) Html.fromHtml(link);
        for (URLSpan u: s.getSpans(0, s.length(), URLSpan.class)) {
            s.setSpan(new UnderlineSpan() {
                public void updateDrawState(TextPaint tp) {
                    tp.setUnderlineText(false);
                }
            }, s.getSpanStart(u), s.getSpanEnd(u), 0);
        }
        return s;
    }

}
