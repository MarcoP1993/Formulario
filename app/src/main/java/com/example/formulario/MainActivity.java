package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton radio_nacional = null;
    private RadioButton radio_extranjero = null;
    private CheckBox checkTerminos = null;
    private TextView txt_error = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radio_nacional = (RadioButton) findViewById(R.id.radio_nacional);
        radio_extranjero = (RadioButton) findViewById(R.id.radio_extranjero);
        checkTerminos = (CheckBox) findViewById(R.id.check_terminos);
        txt_error = (TextView) findViewById(R.id.txt_error);
    }

    public void mostrarnacionalidad(View view) {
        boolean seleccionadoOk = ((RadioButton)view).isChecked(); //asi se ve si esta seleccionado una opcion.
        switch (view.getId())
        {
            case R.id.radio_nacional:
                if (seleccionadoOk){
                    Toast.makeText(this,"has seleccionado nacional",Toast.LENGTH_SHORT).show();

                }
                break;
            case R.id.radio_extranjero:
                if (seleccionadoOk){
                    Toast.makeText(this,"has seleccionado extranjero",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    public void mostrar(View view) {
        if (radio_nacional.isChecked()){
            Toast.makeText(this, "Has seleccionado nacional", Toast.LENGTH_SHORT).show();

        }else if (radio_extranjero.isChecked()){
            Toast.makeText(this, "Has seleccionado extranjero", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Selecciona una opcion NACIONAL/EXTRANJERO", Toast.LENGTH_SHORT).show();
        }

    }

    public void aceptar(View view) {
        boolean checkOk = checkTerminos.isChecked();
        if (checkOk){
            txt_error.setText("");
            Toast.makeText(this, "Acepto los terminos", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Debes aceptar los terminos", Toast.LENGTH_SHORT).show();
            txt_error.setText("Debes aceptar los terminos");

        }
    }
}