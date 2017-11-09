package com.example.dariomolina.life;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by dariomolina on 11/7/17.
 */

public class STEAM extends AppCompatActivity {

    private TextView urbanLink, madeCode, madeCodeBody;
    private TextView hourCode, hourCodeBody;
    private LinearLayout layout;
    private String[] descriptions;
    private String[] urls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.steam_layout);

        layout = (LinearLayout) findViewById(R.id.layout);

        //titles = new TextView[12];

        descriptions = new String[]{"Urban Arts Collaborative (UAC) founders teach art classes to LIFE students and also have been instrumental supporters " +
                "in the LIFE Community Garden first planted May 21, 2016. When students have art in their curriculum, studies show it has a positive impact on their learning all other academic subjects too! The positive benefits of students and gardening have also been shown.  Research with participation in\n" +
                " school-based gardens has shown positive impact on students such as improved social skills and increase in well-being.", "Google’s fun and easy site called ‘Made W/ Code’ for helping girls learn coding!  Check it out by clicking on the link below!\n" +
                "\n" +
                "For students today, coding is becoming an essential skill just like reading, writing and math." +
                "  ‘Made W/ Code’ is an effort to get more girls involved in computer programming, whether it’s designing a LED dress," +
                " an outrageously accessorized selfie, helping Riley from Inside Out solve some of life’s little problems or solving a problem" +
                " in their own neighborhood it’s all fun and easy and they are learning to code!  LIFE is proud to offer this experience to 4th – 8th" +
                " grade girls.","LIFE students learn the basic concepts of Computer Science with drag and drop programming. This is a game-like, self-directed" +
                " tutorial starring video lectures by Bill Gates, Mark Zuckerberg, using Angry Birds, Plants vs. Zombies, Minecraft, Star Wars and Anna & Elsa " +
                "from Frozen to teach students code. They learn repeat-loops, conditionals, and basic algorithms all while having fun!  They were part of this grass " +
                "roots ‘social media’ movement that at last count had over 100 million students in more than 180 countries.  Repeat loop every December!","In the spring, Our STEM advisor presents a six-week long series of classes for LIFE 4th – 7th grade students to try their hand at Scratch Programming.  With Scratch, you can program your own interactive stories, games, and animations — and share your creations with others in the online community.\n" +
                "\n" +
                "Scratch helps young people learn to think creatively, reason systematically, and work collaboratively — essential skills for life in the 21st century.\n" +
                "\n" +
                "Scratch is a project of the Lifelong Kindergarten Group at the MIT Media Lab and is provided free of charge.","This opportunity is dependent upon parents & volunteers as coaches.\n" +
                "\n" +
                "FLL introduces students to real-world engineering challenges by building LEGO-based robots to complete tasks on a thematic playing surface. FLL teams, guided by their imaginations and adult coaches, discover exciting career possibilities and, through the process, learn to make positive contributions to society.\n" +
                "\n" +
                "Elementary and middle-school students get to:\n" +
                "\n" +
                "<li>Design, build, test and program robots using LEGO MINDSTORMS® technology</li>\n" +
                "<li>Apply real-world math and science concepts</li>\n" +
                "<li>Research challenges facing today’s scientists</li>\n" +
                "<li>Learn critical thinking, team-building and presentation skills</li>\n" +
                "<li>Participate in tournaments and celebrations</li>\n" +
                "The Challenges have been things such as “Nature’s Fury” where students had to create a robot" +
                " to navigate an environment destroyed by storm to deliver supplies, or “World Class – Learning Unleashed”" +
                " where students had to redesign how we would gather knowledge and skills in the 21st century and have their" +
                " robots navigate a series of obstacles and execute assigned tasks.","Lyceum stimulates individual creativity " +
                "and intellectual promise through classes that help students see what is fascinating about a subject without " +
                "being graded. Topics vary throughout the year from Robot Computer Programming to the Solar System to Art to " +
                "Languages and Culture programs. There is a fee, but scholarships are available for LIFE students to cover that cost.  " +
                "It is tradition at LIFE for at least two students to attend the week long Space Adventure Camp held each summer."};



        urls = new String[6];

        urls[0] = "<a 'href=\"https://www.facebook.com/groups/urbanartscollaborative/\"'>Urban Arts Collaborative “Nature is Art – Art is Healing”</a>";
        urls[1] = "<a 'href=\"https://www.madewithcode.com\"'>Made w/ Code</a>";
        urls[2] = "<a 'href=\"https://hourofcode.com/co\"'>Hour of Code</a>";
        urls[3] = "<a 'href=\"https://scratch.mit.edu\"'>Scratch Programming</a>";
        urls[4] = "FIRST LEGO League (FLL)";
        urls[5] = "Lyceum of Monterey County";



        for(int i = 0; i < urls.length; i++)
        {
            //int id = getResources().getIdentifier(ids[i], "id", getPackageName());
            TextView title = new TextView(this);

            title.setText(removeUnderline(urls[i]));
            title.setLinkTextColor(Color.parseColor("#2d5c88"));
            title.setTextSize(20);
            title.setPadding(23,20,23,10);
            title.setMovementMethod(LinkMovementMethod.getInstance());
            layout.addView(title);

            TextView description = new TextView(this);
            description.setText(Html.fromHtml(descriptions[i]));
            description.setPadding(23,20,23,20);
            layout.addView(description);

            switch (i)
            {
                case 0:
                {
                    String uri = "@drawable/planting";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());
                    ImageView image = new ImageView(this);

                    Drawable res = getResources().getDrawable(imageResource);
                    image.setImageDrawable(res);
                    layout.addView(image);
                    break;
                }

                case 1:
                {
                    String uri = "@drawable/made_code";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());
                    ImageView image = new ImageView(this);

                    Drawable res = getResources().getDrawable(imageResource);
                    image.setImageDrawable(res);
                    layout.addView(image);
                    break;
                }

                case 4:
                {
                    String uri = "@drawable/league";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());
                    ImageView image = new ImageView(this);

                    Drawable res = getResources().getDrawable(imageResource);
                    image.setImageDrawable(res);
                    layout.addView(image);
                    break;
                }

            }
        }

        Button enroll = new Button(this);
        enroll.setText("Enroll");
        enroll.setMinWidth(0);
        enroll.setTextSize(11);

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

        enroll.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent enroll = new Intent(getApplicationContext(), Enroll.class);
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

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT);
        params.gravity= Gravity.CENTER;
        params.topMargin= 70;



        LinearLayout layout2 = new LinearLayout(this);
        layout2.setOrientation(LinearLayout.HORIZONTAL);
        layout2.setLayoutParams(params);
        layout.addView(layout2);
        layout2.addView(home);
        layout2.addView(enroll);
        layout2.addView(supporters);
        layout2.addView(involved);

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
