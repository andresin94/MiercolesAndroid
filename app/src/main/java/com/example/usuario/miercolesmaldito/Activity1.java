package com.example.usuario.miercolesmaldito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public abstract class Activity1 extends AppCompatActivity implements View.OnClickListener {

    private Button volver;
    private Button cancelar;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        init();
    }

    private void init() {
        volver=findViewById(R.id.buttonVolver);
        cancelar=findViewById(R.id.buttonCancelar);
        text=findViewById(R.id.textView);
    }

    public Button getVolver () {
        return volver;
    }

    public Button getCancelar () {
        return cancelar;
    }

    public void setTexto (String texto) {
        text.setText(texto);
    }

    @Override
    public void onClick(View v) {

    }
}
