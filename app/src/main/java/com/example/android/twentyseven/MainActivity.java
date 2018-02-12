package com.example.android.twentyseven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         TextView txtAnimal = (TextView) findViewById(R.id.txtAnimal);
         TextView txtCat = (TextView) findViewById(R.id.txtCat);
         TextView txtLion = (TextView) findViewById(R.id.txtLion);
         TextView txtPlymorphism = (TextView) findViewById(R.id.txtPolymorphism);

         Animal Panda = new Animal("Moko","White",200,500);

         txtAnimal.setText(Panda.toString());



         Lion myLion = new Lion("Maw","Yellow",300,1000,
                 true,500);

         txtLion.setText(myLion.toString());


//Polymorphism
         Animal poly = myLion;
         txtPlymorphism.setText(poly.toString());


//Polymorphism

        Animal poly2 = Panda;
        txtCat.setText(poly2.toString());
    }
}


