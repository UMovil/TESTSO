package com.example.login;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Usuario extends AppCompatActivity {


    //PREGUNTA 1
    private RadioButton rb_p1a, rb_p1b, rb_p1c, rb_p1d;
    private RadioGroup rbg1;
    public double nota_rp1 = 1.00;

    //PREGUNTA 2
    private RadioButton rb_p2a, rb_p2b, rb_p2c, rb_p2d;
    private RadioGroup rbg2;
    public double nota_rp2 = 1.00;

    //NOTA ALMACENADA
    double nota_final;
    String stringdouble = Double.toString(nota_final);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        //PREGUNTA 1
        rb_p1a = (RadioButton)findViewById(R.id.p1a);
        rb_p1b = (RadioButton)findViewById(R.id.p1b);
        rb_p1c = (RadioButton)findViewById(R.id.p1c);
        rb_p1d = (RadioButton)findViewById(R.id.p1d);
        rbg1 = (RadioGroup)findViewById(R.id.p1);

        //PREGUNTA 2
        rb_p2a = (RadioButton)findViewById(R.id.p2a);
        rb_p2b = (RadioButton)findViewById(R.id.p2b);
        rb_p2c = (RadioButton)findViewById(R.id.p2c);
        rb_p2d = (RadioButton)findViewById(R.id.p2d);
        rbg2 = (RadioGroup)findViewById(R.id.p2);

    }
    public void v_p1(View view){

        Button boton = (Button) findViewById(R.id.bt_vp1);

        if (rb_p1a.isChecked()){

            rb_p1a.setEnabled(false);rb_p1a.setClickable(false);rb_p1a.setTextColor(Color.parseColor("#ff3333"));
            nota_rp1 = nota_rp1 - 0.25;
//            Toast.makeText(getApplicationContext(), "La respuesta escogida no es la correcta, intenta escogiendo otra respuesta.", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp1, Toast.LENGTH_SHORT).show();
            rbg1.clearCheck();

        }else if (rb_p1b.isChecked()){

            rb_p1b.setEnabled(false);rb_p1b.setClickable(false);rb_p1b.setTextColor(Color.parseColor("#ff3333"));
            nota_rp1 = nota_rp1 - 0.25;
//            Toast.makeText(getApplicationContext(), "La respuesta escogida no es la correcta, intenta escogiendo otra respuesta.", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp1, Toast.LENGTH_SHORT).show();
            rbg1.clearCheck();

        }else if (rb_p1c.isChecked()){

            rb_p1c.setEnabled(false);rb_p1c.setClickable(false);rb_p1c.setTextColor(Color.parseColor("#ff3333"));
            nota_rp1 = nota_rp1 - 0.25;
//            Toast.makeText(getApplicationContext(), "La respuesta escogida no es la correcta, intenta escogiendo otra respuesta.", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp1, Toast.LENGTH_SHORT).show();
            rbg1.clearCheck();

        }else if (rb_p1d.isChecked()) {

            rb_p1a.setEnabled(false); rb_p1a.setClickable(false);
            rb_p1b.setEnabled(false); rb_p1b.setClickable(false);
            rb_p1c.setEnabled(false); rb_p1c.setClickable(false);
            rb_p1d.setClickable(false);
            rb_p1d.setTextColor(Color.parseColor("#33FF49"));
            boton.setEnabled(false);
//            Toast.makeText(getApplicationContext(), "Excelente , haz acertado la respuesta correcta. ", Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp1, Toast.LENGTH_SHORT).show();
        }
    }
    public void v_p2(View view){

        Button boton = (Button) findViewById(R.id.bt_vp2);

        if (rb_p2a.isChecked()){

            rb_p2a.setEnabled(false);rb_p2a.setClickable(false);rb_p2a.setTextColor(Color.parseColor("#ff3333"));
            nota_rp2 = nota_rp2 - 0.25;
//            Toast.makeText(getApplicationContext(), "La respuesta escogida no es la correcta, intenta escogiendo otra respuesta.", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp2, Toast.LENGTH_SHORT).show();
            rbg2.clearCheck();

        }else if (rb_p2b.isChecked()){

            rb_p2b.setEnabled(false);rb_p2b.setClickable(false);rb_p2b.setTextColor(Color.parseColor("#ff3333"));
            nota_rp2 = nota_rp2 - 0.25;
//            Toast.makeText(getApplicationContext(), "La respuesta escogida no es la correcta, intenta escogiendo otra respuesta.", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp2, Toast.LENGTH_SHORT).show();
            rbg2.clearCheck();

        }else if (rb_p2c.isChecked()){

            rb_p2c.setEnabled(false);rb_p2c.setClickable(false);rb_p2c.setTextColor(Color.parseColor("#ff3333"));
            nota_rp2 = nota_rp2 - 0.25;
//            Toast.makeText(getApplicationContext(), "La respuesta escogida no es la correcta, intenta escogiendo otra respuesta.", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp2, Toast.LENGTH_SHORT).show();
            rbg2.clearCheck();

        }else if (rb_p2d.isChecked()) {

            rb_p2a.setEnabled(false); rb_p2a.setClickable(false);
            rb_p2b.setEnabled(false); rb_p2b.setClickable(false);
            rb_p2c.setEnabled(false); rb_p2c.setClickable(false);
            rb_p2d.setClickable(false);
            rb_p2d.setTextColor(Color.parseColor("#33FF49"));
            boton.setEnabled(false);
//            Toast.makeText(getApplicationContext(), "Excelente , haz acertado la respuesta correcta. ", Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp2, Toast.LENGTH_SHORT).show();
        }
    }
    public void btotal (View view){

        Button boton = (Button) findViewById(R.id.total);
        Button boton1 = (Button) findViewById(R.id.bt_vp1);
        Button boton2 = (Button) findViewById(R.id.bt_vp2);

        if (boton1.isEnabled()) {
            Toast.makeText(getApplicationContext(), "Aún no has terminado la pregunta 1", Toast.LENGTH_SHORT).show();
        }else if (boton2.isEnabled()){
            Toast.makeText(getApplicationContext(), "Aún no has terminado la pregunta 2", Toast.LENGTH_SHORT).show();
        }else {
            nota_final = nota_rp2 + nota_rp1;
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_final, Toast.LENGTH_SHORT).show();
        }

      }
}

