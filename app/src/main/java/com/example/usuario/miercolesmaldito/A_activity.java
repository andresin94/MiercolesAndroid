package com.example.usuario.miercolesmaldito;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class A_activity extends Activity1 implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getVolver().setOnClickListener(this);
        getCancelar().setOnClickListener(this);
        setTexto("Estoy en la Actividad A");

    }

    @Override
    public void onClick(View v) {

        Intent intent = null;

        switch (v.getId()) {
            case R.id.buttonVolver:
                intent = new Intent();
                intent.putExtra("respuesta", "Boton Volver Actividad A");
                setResult(Activity.RESULT_OK, intent);
                break;

            case R.id.buttonCancelar:
                intent = new Intent();
                intent.putExtra("respuesta", "Boton Cancelar Actividad A");
                setResult(Activity.RESULT_OK, intent);
                break;
        }

        finish();

    }
}
