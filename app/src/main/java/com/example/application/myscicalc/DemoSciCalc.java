package com.example.application.myscicalc;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DemoSciCalc extends Activity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;
    double ip1=0,ip2=0;
    EditText et1;
    Vibrator vibe;
    MediaPlayer mp;
    boolean add,div,mul,sub,decimal,rem,pow,fact,sqrt,sin,cos,tan,ln,log,sqr,cube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_sci_calc);

        et1=findViewById(R.id.editText1);

        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);

        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);

        b9=findViewById(R.id.button9);
        b10=findViewById(R.id.button10);
        b11=findViewById(R.id.button11);
        b12=findViewById(R.id.button12);

        b13=findViewById(R.id.button13);
        b14=findViewById(R.id.button14);
        b15=findViewById(R.id.button15);
        b16=findViewById(R.id.button16);

        b17=findViewById(R.id.button17);
        b18=findViewById(R.id.button18);
        b19=findViewById(R.id.button19);
        b20=findViewById(R.id.button20);

        b21=findViewById(R.id.button21);
        b22=findViewById(R.id.button22);
        b23=findViewById(R.id.button23);
        b24=findViewById(R.id.button24);

        b25=findViewById(R.id.button25);
        b26=findViewById(R.id.button26);
        b27=findViewById(R.id.button27);
        b28=findViewById(R.id.button28);

        b29=findViewById(R.id.button29);
        b30=findViewById(R.id.button30);

        vibe= (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.seven);
                mp.start();
                et1.setText(et1.getText()+"7");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                et1.setText(et1.getText()+"8");
                mp=MediaPlayer.create(getApplicationContext(),R.raw.eight);
                mp.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                et1.setText(et1.getText()+"9");
                mp=MediaPlayer.create(getApplicationContext(),R.raw.nine);
                mp.start();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.divide);
                mp.start();
                ip1=Float.parseFloat(et1.getText()+"");
                div=true;
                decimal=false;
                et1.setText(null);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.percent);
                mp.start();
                ip1=Float.parseFloat( et1.getText()+"");
                rem=true;
                decimal=false;
                et1.setText(null);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.sin);
                mp.start();
                sin=true;
                decimal=false;
                et1.setText(null);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.four);
                mp.start();
                et1.setText(et1.getText()+"4");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.five);
                mp.start();
                et1.setText(et1.getText()+"5");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.six);
                mp.start();
                et1.setText(et1.getText()+"6");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.multiply);
                mp.start();
                ip1=Float.parseFloat(et1.getText()+"");
                mul=true;
                decimal=false;
                et1.setText(null);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.sqrroot);
                mp.start();
                ip1=Float.parseFloat(et1.getText()+"");
                sqrt=true;
                decimal=false;
                et1.setText(null);
            }
        });
        b12.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.cosine);
                mp.start();
                cos=true;
                decimal=false;
                et1.setText(null);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.one);
                mp.start();
                et1.setText(et1.getText()+"1");
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.two);
                mp.start();
                et1.setText(et1.getText()+"2");
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.three);
                mp.start();
                et1.setText(et1.getText()+"3");
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.subtract);
                mp.start();
                ip1=Float.parseFloat(et1.getText()+"");
                sub=true;
                decimal=false;
                et1.setText(null);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.e);
                mp.start();
                et1.setText(et1.getText()+"2.71828");
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.tan);
                mp.start();
                tan=true;
                decimal=false;
                et1.setText(null);
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.zero);
                mp.start();
                et1.setText(et1.getText()+"0");
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.decimal);
                mp.start();
                if(decimal)
                {}
                else
                {
                    et1.setText(et1.getText() + ".");
                    decimal=true;
                }
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.equalsto);
                mp.start();
                if(add||mul||div||sub||rem||pow||ln||log||sin||cos||tan)
                {
                    ip2=Float.parseFloat(et1.getText()+"");
                }
                if(add)
                {
                    et1.setText(ip1 + ip2 + "");
                    add=false;
                }
                if(sub)
                {
                    et1.setText(ip1 - ip2 + "");
                    sub=false;
                }
                if(mul)
                {
                    et1.setText(ip1 * ip2 + "");
                    mul=false;
                }
                if(div)
                {
                    et1.setText(ip1 / ip2 + "");
                    div=false;
                }
                if(rem)
                {
                    et1.setText(ip1 % ip2 + "");
                    rem=false;
                }
                if(pow)
                {
                    et1.setText((float) Math.pow(ip1,ip2)+"");
                    pow=false;
                }
                if(fact)
                {
                    if(ip1>0)
                    {
                        double res = 1;
                        for (int i = 2; i <= ip1; i++) {
                            res = res * i;
                        }
                        et1.setText(res + "");
                        fact = false;
                    }
                    else
                    {
                        et1.setText("error");
                        fact=false;
                    }
                }
                if(sqrt)
                {
                    if(ip1>=0)
                    {
                        et1.setText((float) Math.sqrt(ip1) + "");
                        sqrt = false;
                    }
                    else
                    {
                        et1.setText("Error");
                        sqrt=false;
                    }
                }
                if(sin)
                {
                    et1.setText((float)Math.sin(Math.toRadians(ip2))+"");
                    sin=false;
                }
                if(cos)
                {
                    et1.setText((float)Math.cos(Math.toRadians(ip2))+"");
                    cos=false;
                }
                if(tan)
                {
                   if(ip2!=90) {
                       et1.setText((float) Math.tan(Math.toRadians(ip2)) + "");
                       tan = false;
                   }
                   else
                   {
                       et1.setText("error");
                       tan=false;
                   }
                }
                if(sqr)
                {
                    et1.setText((float)Math.pow(ip1,2)+"");
                    sqr=false;
                }
                if(ln)
                {
                    if(ip2>0) {
                        et1.setText((float) Math.log(ip2) + "");
                        ln = false;
                    }
                    else
                    {
                        et1.setText("Error");
                        ln=false;
                    }
                }
                if(log)
                {
                    if(ip2>0) {
                        et1.setText((float)Math.log10(ip2)+"");
                        log=false;
                    }
                    else
                    {
                        et1.setText("Error");
                        log=false;
                    }
                }
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.add);
                mp.start();
                ip1=Float.parseFloat(et1.getText()+"");
                add=true;
                decimal=false;
                et1.setText(null);
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.factorial);
                mp.start();
                ip1=Integer.parseInt(et1.getText()+"");
                et1.setText(et1.getText()+"!");
                fact=true;
                decimal=false;
                et1.setText(null);
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.pi);
                mp.start();
                et1.setText(et1.getText()+"3.14");
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.pow);
                mp.start();
                ip1=Float.parseFloat(et1.getText()+"");
                pow=true;
                decimal=false;
                et1.setText(null);
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.ln);
                mp.start();
                ln=true;
                decimal=false;
                et1.setText(null);
            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.log);
                mp.start();
                log=true;
                decimal=false;
                et1.setText(null);
            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.sqr);
                mp.start();
                ip1=Float.parseFloat(et1.getText()+"");
                sqr=true;
                decimal=false;
                et1.setText(null);
            }
        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.plusminus);
                mp.start();
                et1.setText("-"+et1.getText());
            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                vibe.vibrate(80);
                mp=MediaPlayer.create(getApplicationContext(),R.raw.clear);
                mp.start();
                et1.setText("");
                ip1=0.0;
                ip2=0.0;
            }
        });
    }
}
