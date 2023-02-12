package com.example.practicle5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    CheckBox pizza,sandwich,pasta,burger;
    Button Odernow;
    ArrayList<String> list=new ArrayList<String>();
    TextView show;

    int Total=0;
    int pizzaPrice=250;
    int sandwichPrice=200;
    int pastaPrice=500;
    int burgerPrice=650;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pizza=findViewById(R.id.checkBox1);
        sandwich=findViewById(R.id.checkBox2);
        pasta=findViewById(R.id.checkBox3);
        burger=findViewById(R.id.checkBox4);
        Odernow=findViewById(R.id.button);
        show=findViewById(R.id.txt2);

      pizza.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              boolean temp = ((CheckBox)v).isChecked();
              if (temp){
                  list.add("pizza --- "+pizzaPrice);
                    Total=Total+pizzaPrice;}
              else{
                  list.remove("pizza --- "+pizzaPrice);
                  Total=Total-pizzaPrice;}
          }
      });
        sandwich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean temp = ((CheckBox)v).isChecked();
                if (temp){
                    list.add("sandwich --- "+sandwichPrice);
                    Total=Total+sandwichPrice;}
                else{
                    list.remove("sandwich --- "+sandwichPrice);
                    Total=Total-sandwichPrice;}

            }
        });
        pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean temp = ((CheckBox)v).isChecked();
                if (temp){
                    list.add("pasta --- "+pastaPrice);
                    Total=Total+pastaPrice;}
                else{
                    list.remove("pasta --- "+pastaPrice);
                    Total=Total-pastaPrice;}
            }
        });
        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean temp = ((CheckBox)v).isChecked();
                if (temp){
                    list.add("burger --- "+burgerPrice);
                    Total=Total+burgerPrice;}
                else{
                    list.remove("burger --- "+burgerPrice);
                    Total=Total-burgerPrice;}
            }
        });

        Odernow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String itemsString = TextUtils.join("\n", list);
                    show.setText(itemsString+"\n"+"Total = "+Total+"/=");



            }
        });

    }
}


