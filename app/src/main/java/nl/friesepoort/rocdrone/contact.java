package nl.friesepoort.rocdrone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        TextView emailHoexum = (TextView) findViewById(R.id.emailHoexum);
        emailHoexum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","ehoexum@rocfriesepoort.nl", null));
                emailIntent.putExtra(Intent.EXTRA_CC, new String[]{});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "");

                startActivity(Intent.createChooser(emailIntent , "Choose email client"));
            }
        });
        TextView emailKuypers = (TextView) findViewById(R.id.emailKuypers);
        emailKuypers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","rkuypers@rocfriesepoort.nl", null));
                emailIntent.putExtra(Intent.EXTRA_CC, new String[]{});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "");

                startActivity(Intent.createChooser(emailIntent , "Choose email client"));
            }
        });
        TextView emailAnnink = (TextView) findViewById(R.id.emailAnnink);
        emailAnnink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","bannink@rocfriesepoort.nl", null));
                emailIntent.putExtra(Intent.EXTRA_CC, new String[]{});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "");

                startActivity(Intent.createChooser(emailIntent , "Choose email client"));
            }
        });
        TextView emailKwakernaak = (TextView) findViewById(R.id.emailKwakernaak);
        emailKwakernaak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","dkwakernaak@rocfriesepoort.nl", null));
                emailIntent.putExtra(Intent.EXTRA_CC, new String[]{});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "");

                startActivity(Intent.createChooser(emailIntent , "Choose email client"));
            }
        });
        TextView emailBisschop = (TextView) findViewById(R.id.emailBisschop);
        emailBisschop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO ,Uri.fromParts(
                        "mailto","jbisschop@rocfriesepoort.nl", null));
                emailIntent.putExtra(Intent.EXTRA_CC, new String[]{});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "");

                startActivity(Intent.createChooser(emailIntent , "Choose email client"));
            }
        });
    }
}
