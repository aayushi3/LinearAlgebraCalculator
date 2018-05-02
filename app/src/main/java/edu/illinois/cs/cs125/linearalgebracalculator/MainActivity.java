package edu.illinois.cs.cs125.linearalgebracalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText one;
    EditText two;
    EditText three;
    EditText four;
    EditText five;
    EditText six;
    EditText seven;
    EditText eight;
    EditText nine;
    TextView uno;
    TextView dos;
    TextView tres;
    TextView cuatro;
    TextView cinco;
    TextView seis;
    TextView siete;
    TextView ocho;
    TextView nueve;
    TextView quote;
    TextView author;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (EditText) findViewById(R.id.one);
        two = (EditText) findViewById(R.id.two);
        three = (EditText) findViewById(R.id.three);
        four = (EditText) findViewById(R.id.four);
        five = (EditText) findViewById(R.id.five);
        six = (EditText) findViewById(R.id.six);
        seven = (EditText) findViewById(R.id.seven);
        eight = (EditText) findViewById(R.id.eight);
        nine = (EditText) findViewById(R.id.nine);
        uno = (TextView) findViewById(R.id.uno);
        dos = (TextView) findViewById(R.id.dos);
        tres = (TextView) findViewById(R.id.tres);
        cuatro = (TextView) findViewById(R.id.cuatro);
        cinco = (TextView) findViewById(R.id.cinco);
        seis = (TextView) findViewById(R.id.seis);
        siete = (TextView) findViewById(R.id.siete);
        ocho = (TextView) findViewById(R.id.ocho);
        nueve = (TextView) findViewById(R.id.nueve);
        quote = (TextView) findViewById(R.id.quote);
        author = (TextView) findViewById(R.id.author);

        Button adjVal = (Button) findViewById(R.id.adjVal);
        adjVal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(one.getText().toString());
                float b = Float.parseFloat(two.getText().toString());
                float c = Float.parseFloat(three.getText().toString());
                float d = Float.parseFloat(four.getText().toString());
                float e = Float.parseFloat(five.getText().toString());
                float f = Float.parseFloat(six.getText().toString());
                float g = Float.parseFloat(seven.getText().toString());
                float h = Float.parseFloat(eight.getText().toString());
                float i = Float.parseFloat(nine.getText().toString());
                float first = (e * i) - (h * f);
                float second = -1 * ((b * i) - (c * h));
                float third = (b * f) - (e * c);
                float fourth = -1 * ((d * i) - (f * g));
                float fifth = (a * i) - (c * g);
                float sixth = -1 * ((a * f) - (c * d));
                float seventh = (d * h) - (g * e);
                float eighth = -1 * ((a * h) - (g * b));
                float ninth = (a * e) - (b * d);
                uno.setText(Float.toString(first));
                dos.setText(Float.toString(second));
                tres.setText(Float.toString(third));
                cuatro.setText(Float.toString(fourth));
                cinco.setText(Float.toString(fifth));
                seis.setText(Float.toString(sixth));
                siete.setText(Float.toString(seventh));
                ocho.setText(Float.toString(eighth));
                nueve.setText(Float.toString(ninth));
                /*double random = Math.floor(Math.random() * Math.floor(2));
                if (random == 0) {
                    quote.setText("The grass is always greener on the other side");
                } else {
                    quote.setText("A Person is a person, no matter how small");
                }*/
                Forismatic.Quote litty = new Forismatic(Forismatic.ENGLISH).getQuote();
                String quoteText = litty.getQuoteText();
                String quoteAuthor = litty.getQuoteAuthor();
                quote.setText(quoteText);
                author.setText(quoteAuthor);
            }
        });
        Button inverseVal = (Button) findViewById(R.id.inverseVal);
        inverseVal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(one.getText().toString());
                float b = Float.parseFloat(two.getText().toString());
                float c = Float.parseFloat(three.getText().toString());
                float d = Float.parseFloat(four.getText().toString());
                float e = Float.parseFloat(five.getText().toString());
                float f = Float.parseFloat(six.getText().toString());
                float g = Float.parseFloat(seven.getText().toString());
                float h = Float.parseFloat(eight.getText().toString());
                float i = Float.parseFloat(nine.getText().toString());
                float determinant = (a * ((e * i) - (f * h))) - (b * ((d * i) - (f * g))) + (c * ((d * h) - (e * g)));
                if (determinant == 0) {
                    uno.setText(0);
                    dos.setText(0);
                    tres.setText(0);
                    cuatro.setText(0);
                    cinco.setText(0);
                    seis.setText(0);
                    siete.setText(0);
                    ocho.setText(0);
                    nueve.setText(0);
                } else {
                    float first = (e * i) - (h * f);
                    float second = -1 * ((b * i) - (c * h));
                    float third = (b * f) - (e * c);
                    float fourth = -1 * ((d * i) - (f * g));
                    float fifth = (a * i) - (c * g);
                    float sixth = -1 * ((a * f) - (c * d));
                    float seventh = (d * h) - (g * e);
                    float eighth = -1 * ((a * h) - (g * b));
                    float ninth = (a * e) - (b * d);
                    float hanna = (1 / determinant) * first;
                    float dul = (1 / determinant) * second;
                    float set = (1 / determinant) * third;
                    float net = (1 / determinant) * fourth;
                    float tasot = (1 / determinant) * fifth;
                    float yasot = (1 / determinant) * sixth;
                    float ilgop = (1 / determinant) * seventh;
                    float yadol = (1 / determinant) * eighth;
                    float ahop = (1 / determinant) * ninth;
                    int ek = (int) hanna;
                    int doo = (int) dul;
                    int teen = (int) set;
                    int charr = (int) net;
                    int panch = (int) tasot;
                    int che = (int) yasot;
                    int sat = (int) ilgop;
                    int aat = (int) yadol;
                    int now = (int) ahop;
                    uno.setText(Float.toString(ek));
                    dos.setText(Float.toString(doo));
                    tres.setText(Float.toString(teen));
                    cuatro.setText(Float.toString(charr));
                    cinco.setText(Float.toString(panch));
                    seis.setText(Float.toString(che));
                    siete.setText(Float.toString(sat));
                    ocho.setText(Float.toString(aat));
                    nueve.setText(Float.toString(now));
                }
                /*double random = Math.floor(Math.random() * Math.floor(2));
                if (random == 0) {
                    quote.setText("Create your own Sunshine");
                } else {
                    quote.setText("Don't let your struggle become your identity");
                }*/
                Forismatic.Quote litty = new Forismatic(Forismatic.ENGLISH).getQuote();
                String quoteText = litty.getQuoteText();
                String quoteAuthor = litty.getQuoteAuthor();
                quote.setText(quoteText);
                author.setText(quoteAuthor);
            }
        });
        Button transVal = (Button) findViewById(R.id.transVal);
        transVal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(one.getText().toString());
                float b = Float.parseFloat(two.getText().toString());
                float c = Float.parseFloat(three.getText().toString());
                float d = Float.parseFloat(four.getText().toString());
                float e = Float.parseFloat(five.getText().toString());
                float f = Float.parseFloat(six.getText().toString());
                float g = Float.parseFloat(seven.getText().toString());
                float h = Float.parseFloat(eight.getText().toString());
                float i = Float.parseFloat(nine.getText().toString());
                uno.setText(Float.toString(a));
                dos.setText(Float.toString(d));
                tres.setText(Float.toString(g));
                cuatro.setText(Float.toString(b));
                cinco.setText(Float.toString(e));
                seis.setText(Float.toString(h));
                siete.setText(Float.toString(c));
                ocho.setText(Float.toString(f));
                nueve.setText(Float.toString(i));
                /*double random = Math.floor(Math.random() * Math.floor(2));
                if (random == 0) {
                    quote.setText("Expect Nothing Appreciate Everything");
                } else {
                    quote.setText("Admit Nothing Deny Everything");
                }*/
                Forismatic.Quote litty = new Forismatic(Forismatic.ENGLISH).getQuote();
                String quoteText = litty.getQuoteText();
                String quoteAuthor = litty.getQuoteAuthor();
                quote.setText(quoteText);
                author.setText(quoteAuthor);
            }
        });
    }


}
