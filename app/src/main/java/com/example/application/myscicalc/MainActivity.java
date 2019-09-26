package com.example.application.myscicalc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity
{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    double ip1=0,ip2=0;
    EditText et1;
    MediaPlayer mp;
    boolean add,div,mul,sub,decimal;
    Vibrator vibe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        vibe= (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);

    }

    public void onPress(View v)
    {
        if(v.getId()==R.id.button1)
        {
           vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.seven);
            mp.start();
            et1.setText(et1.getText()+"7");
        }
        if(v.getId()==R.id.button2)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.eight);
            mp.start();
            et1.setText(et1.getText()+"8");
        }
        if(v.getId()==R.id.button3)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.nine);
            mp.start();
            et1.setText(et1.getText()+"9");
        }
        if(v.getId()==R.id.button4)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.divide);
            mp.start();
            if(et1.getText().length()!=0)
            {
                ip1=Float.parseFloat(et1.getText()+"");
                div=true;
                decimal=false;
                et1.setText(null);
            }
        }
        if(v.getId()==R.id.button5)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.four);
            mp.start();
            et1.setText(et1.getText()+"4");
        }
        if(v.getId()==R.id.button6)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.five);
            mp.start();
            et1.setText(et1.getText()+"5");
        }
        if(v.getId()==R.id.button7)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.six);
            mp.start();
            et1.setText(et1.getText()+"6");
        }
        if(v.getId()==R.id.button8)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.multiply);
            mp.start();
            ip1=Float.parseFloat(et1.getText()+"");
            mul=true;
            decimal=false;
            et1.setText(null);
        }
        if(v.getId()==R.id.button9)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.one);
            mp.start();
            et1.setText(et1.getText()+"1");
        }
        if(v.getId()==R.id.button10)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.two);
            mp.start();
            et1.setText(et1.getText()+"2");
        }
        if(v.getId()==R.id.button11)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.three);
            mp.start();
            et1.setText(et1.getText()+"3");
        }
        if(v.getId()==R.id.button12)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.subtract);
            mp.start();
            ip1=Float.parseFloat(et1.getText()+"");
            sub=true;
            decimal=false;
            et1.setText(null);
        }
        if(v.getId()==R.id.button13)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.zero);
            mp.start();
            et1.setText(et1.getText()+"0");
        }
        if(v.getId()==R.id.button14)
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
        if(v.getId()==R.id.button15)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.equalsto);
            mp.start();
            if(add||mul||div||sub)
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
                if(ip2!=0)
                {
                    et1.setText(ip1 / ip2 + "");
                    div = false;
                }
                else
                {
                    et1.setText("infinity");
                    div=false;
                }
            }
        }
        if(v.getId()==R.id.button16)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.add);
            mp.start();
            ip1=Float.parseFloat(et1.getText()+"");
            add=true;
            decimal=false;
            et1.setText(null);
        }
        if(v.getId()==R.id.button17)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.clear);
            mp.start();
            et1.setText("");
            ip1=0.0;
            ip2=0.0;
        }
        if(v.getId()==R.id.button18)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.sci);
            mp.start();
            Intent intent=new Intent(this,DemoSciCalc.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.button19)
        {
            vibe.vibrate(80);
            mp=MediaPlayer.create(getApplicationContext(),R.raw.plusminus);
            mp.start();
            et1.setText("-"+et1.getText());
        }
    }
}
