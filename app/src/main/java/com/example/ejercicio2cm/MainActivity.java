package com.example.ejercicio2cm;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ejercicio2cm.Alumno;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String LOGTAG = "INFORMACIÓN";

    private Alumno Alumno;
    private EditText nombreAlu;
    private EditText apAlu;
    private EditText amAlu;
    private EditText geneAlu;
    private EditText noCuenta;
    private Button boton1;
    private Button boton2;
    private TextView miBien;

    String alumno;
    String apellidoP;
    String apellidoM;
    String generoAlu;
    String cuentaAlu;

    ArrayList <Alumno> arregloAlumnos = new ArrayList<Alumno>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miBien =(TextView)findViewById(R.id.textBien);

        boton1 = findViewById(R.id.button1);
        boton2 = findViewById(R.id.button2);
        nombreAlu = (EditText) findViewById(R.id.editNombre);
        apAlu = (EditText) findViewById(R.id.editAp);
        amAlu = (EditText) findViewById(R.id.editAm);
        geneAlu = (EditText) findViewById(R.id.editGenero);
        noCuenta = (EditText) findViewById(R.id.editCuenta);

        miBien.setText("Bienvenido a la App");



        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alumno = nombreAlu.getText().toString();
                apellidoP = apAlu.getText().toString();
                apellidoM = amAlu.getText().toString();
                generoAlu = geneAlu.getText().toString();
                cuentaAlu = noCuenta.getText().toString();

                Alumno newAlu = new Alumno(1,alumno,apellidoP ,apellidoM,generoAlu ,cuentaAlu, this);
                arregloAlumnos.add(newAlu);

                Toast.makeText(getApplicationContext(),"Alumno Registrado", Toast.LENGTH_SHORT).show();

            }

        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                Bundle ArregloAlu = new Bundle();
                ArregloAlu.putSerializable("ArreAlu",arregloAlumnos);
                intent.putExtras(ArregloAlu);
                startActivity(intent);


                        startActivity(intent);



            }
        });




        Log.d(LOGTAG, "dsdsdsds");



    }


}

