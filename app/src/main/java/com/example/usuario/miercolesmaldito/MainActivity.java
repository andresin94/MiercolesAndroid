package com.example.usuario.miercolesmaldito;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int REQUEST_CODE_A =10;
    public static final int REQUEST_CODE_B =20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.buttonA).setOnClickListener(this);
        findViewById(R.id.buttonB).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        int requestCode = 0;
        switch (v.getId()) {
            case R.id.buttonA:
                intent = new Intent (this, A_activity.class);
                requestCode=MainActivity.REQUEST_CODE_A;
                break;

            case R.id.buttonB:
                intent= new Intent (this, B_Activity.class);
                requestCode=MainActivity.REQUEST_CODE_B;
                break;
        }
        startActivityForResult(intent,requestCode);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String mensaje=" ";
        switch (requestCode) {
            case MainActivity.REQUEST_CODE_A:
                switch (resultCode) {
                    case Activity.RESULT_OK:
                        mensaje=data.getStringExtra("respuesta");
                        break;

                    case Activity.RESULT_CANCELED:
                        mensaje=data.getStringExtra("respuesta");
                        break;
                }
                break;


            case MainActivity.REQUEST_CODE_B:
                switch (resultCode) {
                    case Activity.RESULT_OK:
                        mensaje=data.getStringExtra("respuesta");
                        break;

                    case Activity.RESULT_CANCELED:
                        mensaje=data.getStringExtra("respuesta");
                        break;
                }
                break;
        }
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }
}
