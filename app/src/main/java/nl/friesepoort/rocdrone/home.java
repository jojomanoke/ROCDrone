package nl.friesepoort.rocdrone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class home extends AppCompatActivity {

//    @Override
//    public void onBackPressed() {
//        if (!shouldAllowBack()) {
//            doSomething();
//        } else {
//            super.onBackPressed();
//        }
//    }
//
//    private boolean shouldAllowBack() {
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //Uitlog knop
        TextView yourText = (TextView) findViewById(R.id.textView);

        yourText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home.this, MainActivity.class));
            }
        });

        //Vlucht plannen
        TextView yourText2 = (TextView) findViewById(R.id.textView2);

        yourText2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home.this, vluchtplannen.class));
            }
        });

        //Prive Documenten
        TextView yourText3 = (TextView) findViewById(R.id.textView3);

        yourText3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home.this, test.class));
            }
        });

        //Gallerij
        TextView yourText4 = (TextView) findViewById(R.id.textView4);

        yourText4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home.this, Gallerij.class));
            }
        });

        //Contact
        TextView yourText5 = (TextView) findViewById(R.id.textView5);

        yourText5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home.this, contact.class));
            }
        });

        //Documenten
        TextView yourText6 = (TextView) findViewById(R.id.textView6);

        yourText6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home.this, test.class));
            }
        });

        //Iconen referenties

        //uitloggen
        ImageView image = (ImageView) findViewById(R.id.imageView3);

        image.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home.this, MainActivity.class));
            }
        });

        //Vlucht plannen
        ImageView image2 = (ImageView) findViewById(R.id.imageView8);

        image2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home.this, vluchtplannen.class));
            }
        });

        //prive documenten
        ImageView image3 = (ImageView) findViewById(R.id.imageView11);

        image3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home.this, test.class));
            }
        });

        //gallerij
        ImageView image4 = (ImageView) findViewById(R.id.imageView13);

        image4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home.this, test.class));
            }
        });

        //contact
        ImageView image5 = (ImageView) findViewById(R.id.imageView21);

        image5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home.this, contact.class));
            }
        });

        //Documenten
        ImageView image6 = (ImageView) findViewById(R.id.imageView22);

        image6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home.this, test.class));
            }
        });

    }
}
