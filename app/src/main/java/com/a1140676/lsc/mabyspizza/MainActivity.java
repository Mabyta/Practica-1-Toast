package com.a1140676.lsc.mabyspizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox pepperoni;
    private CheckBox jamón;
    private CheckBox chile;
    private String tam="mediano";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pepperoni = (CheckBox) findViewById(R.id.checkBox);
        jamón = (CheckBox) findViewById(R.id.checkBox2);
        chile = (CheckBox) findViewById(R.id.checkBox3);
    }


    public void cambiarAGrande(View view){
        tam="grande";
        Toast.makeText(getApplicationContext(),"Será una pizza de tamaño "+tam,Toast.LENGTH_SHORT).show();
    }

    public void cambiarAMediana(View view){
        tam="mediano";
        Toast.makeText(getApplicationContext(),"Será una pizza tamaño "+tam,Toast.LENGTH_SHORT).show();
    }

    public void cambiarAPersonal(View view){
        tam="personal";
        Toast.makeText(getApplicationContext(),"Será una pizza tamaño "+tam,Toast.LENGTH_SHORT).show();
    }

    public void cambiarAXl(View view){
        tam="xl";
        Toast.makeText(getApplicationContext(),"Será una pizza tamaño "+tam,Toast.LENGTH_SHORT).show();
    }

    public void cambiarAXxl(View view){
        tam="xxl";
        Toast.makeText(getApplicationContext(),"Será una pizza tamaño "+tam,Toast.LENGTH_SHORT).show();
    }

    public void consultar(View view){
        String tiene= "queso";
        if(pepperoni.isChecked()){
            tiene+=", pepperoni";
        }
        if(jamón.isChecked()){
            tiene+=", jamón";
        }
        if(chile.isChecked()){
            tiene+=", chile morrón";
        }
        Toast.makeText(getApplicationContext(),"la pizza que tienes hasta el momento " +
                "es de "+tiene+" y de tamaño "+tam,Toast.LENGTH_SHORT).show();
    }

    public void pedir(View view){
        Toast.makeText(getApplicationContext(),"Gracias por tu compra",Toast.LENGTH_SHORT).show();
        tam="mediano";
        pepperoni.setChecked(false);
        jamón.setChecked(false);
        chile.setChecked(false);
    }
}
