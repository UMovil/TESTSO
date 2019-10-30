package com.example.login;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
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

    //PREGUNTA 3
    private RadioButton rb_p3a, rb_p3b, rb_p3c, rb_p3d;
    private RadioGroup rbg3;
    public double nota_rp3 = 1.00;

    //PREGUNTA 4
    private RadioButton rb_p4a, rb_p4b, rb_p4c, rb_p4d;
    private RadioGroup rbg4;
    public double nota_rp4 = 1.00;

    //PREGUNTA 5
    private RadioButton rb_p5a, rb_p5b, rb_p5c, rb_p5d;
    private RadioGroup rbg5;
    public double nota_rp5 = 1.00;

    //NOTA ALMACENADA
    double nota_final;
    String stringdouble = Double.toString(nota_final);

    //OTRAS
    private ScrollView scrollView1;

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

        //PREGUNTA 3
        rb_p3a = (RadioButton)findViewById(R.id.p3a);
        rb_p3b = (RadioButton)findViewById(R.id.p3b);
        rb_p3c = (RadioButton)findViewById(R.id.p3c);
        rb_p3d = (RadioButton)findViewById(R.id.p3d);
        rbg3 = (RadioGroup)findViewById(R.id.p3);

        //PREGUNTA 4
        rb_p4a = (RadioButton)findViewById(R.id.p4a);
        rb_p4b = (RadioButton)findViewById(R.id.p4b);
        rb_p4c = (RadioButton)findViewById(R.id.p4c);
        rb_p4d = (RadioButton)findViewById(R.id.p4d);
        rbg4 = (RadioGroup)findViewById(R.id.p4);

        //PREGUNTA 5
        rb_p5a = (RadioButton)findViewById(R.id.p5a);
        rb_p5b = (RadioButton)findViewById(R.id.p5b);
        rb_p5c = (RadioButton)findViewById(R.id.p5c);
        rb_p5d = (RadioButton)findViewById(R.id.p5d);
        rbg5 = (RadioGroup)findViewById(R.id.p5);

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

    public void v_p3(View view){

        Button boton = (Button) findViewById(R.id.bt_vp3);

        if (rb_p3a.isChecked()){

            rb_p3a.setEnabled(false);rb_p3a.setClickable(false);rb_p3a.setTextColor(Color.parseColor("#ff3333"));
            nota_rp3 = nota_rp3 - 0.25;
//            Toast.makeText(getApplicationContext(), "La respuesta escogida no es la correcta, intenta escogiendo otra respuesta.", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp3, Toast.LENGTH_SHORT).show();
            rbg3.clearCheck();

        }else if (rb_p3b.isChecked()){

            rb_p3b.setEnabled(false);rb_p3b.setClickable(false);rb_p3b.setTextColor(Color.parseColor("#ff3333"));
            nota_rp3 = nota_rp3 - 0.25;
//            Toast.makeText(getApplicationContext(), "La respuesta escogida no es la correcta, intenta escogiendo otra respuesta.", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp3, Toast.LENGTH_SHORT).show();
            rbg3.clearCheck();

        }else if (rb_p3c.isChecked()){

            rb_p3c.setEnabled(false);rb_p3c.setClickable(false);rb_p3c.setTextColor(Color.parseColor("#ff3333"));
            nota_rp3 = nota_rp3 - 0.25;
//            Toast.makeText(getApplicationContext(), "La respuesta escogida no es la correcta, intenta escogiendo otra respuesta.", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp3, Toast.LENGTH_SHORT).show();
            rbg3.clearCheck();

        }else if (rb_p3d.isChecked()) {

            rb_p3a.setEnabled(false); rb_p3a.setClickable(false);
            rb_p3b.setEnabled(false); rb_p3b.setClickable(false);
            rb_p3c.setEnabled(false); rb_p3c.setClickable(false);
            rb_p3d.setClickable(false);
            rb_p3d.setTextColor(Color.parseColor("#33FF49"));
            boton.setEnabled(false);
//            Toast.makeText(getApplicationContext(), "Excelente , haz acertado la respuesta correcta. ", Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp3, Toast.LENGTH_SHORT).show();
        }
    }

    public void v_p4(View view){

        Button boton = (Button) findViewById(R.id.bt_vp4);

        if (rb_p4a.isChecked()){

            rb_p4a.setEnabled(false);rb_p4a.setClickable(false);rb_p4a.setTextColor(Color.parseColor("#ff3333"));
            nota_rp4 = nota_rp4 - 0.25;
//            Toast.makeText(getApplicationContext(), "La respuesta escogida no es la correcta, intenta escogiendo otra respuesta.", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp4, Toast.LENGTH_SHORT).show();
            rbg4.clearCheck();

        }else if (rb_p4d.isChecked()){

            rb_p4d.setEnabled(false);rb_p4d.setClickable(false);rb_p4d.setTextColor(Color.parseColor("#ff3333"));
            nota_rp4 = nota_rp4 - 0.25;
//            Toast.makeText(getApplicationContext(), "La respuesta escogida no es la correcta, intenta escogiendo otra respuesta.", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp4, Toast.LENGTH_SHORT).show();
            rbg4.clearCheck();

        }else if (rb_p4c.isChecked()){

            rb_p4c.setEnabled(false);rb_p4c.setClickable(false);rb_p4c.setTextColor(Color.parseColor("#ff3333"));
            nota_rp4 = nota_rp4 - 0.25;
//            Toast.makeText(getApplicationContext(), "La respuesta escogida no es la correcta, intenta escogiendo otra respuesta.", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp4, Toast.LENGTH_SHORT).show();
            rbg4.clearCheck();

        }else if (rb_p4b.isChecked()) {

            rb_p4a.setEnabled(false); rb_p4a.setClickable(false);
            rb_p4d.setEnabled(false); rb_p4d.setClickable(false);
            rb_p4c.setEnabled(false); rb_p4c.setClickable(false);
            rb_p4b.setClickable(false);
            rb_p4b.setTextColor(Color.parseColor("#33FF49"));
            boton.setEnabled(false);
//            Toast.makeText(getApplicationContext(), "Excelente , haz acertado la respuesta correcta. ", Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp4, Toast.LENGTH_SHORT).show();
        }
    }

    public void v_p5(View view){

        Button boton = (Button) findViewById(R.id.bt_vp5);

        if (rb_p5a.isChecked()){

            rb_p5a.setEnabled(false);rb_p5a.setClickable(false);rb_p5a.setTextColor(Color.parseColor("#ff3333"));
            nota_rp5 = nota_rp5 - 0.25;
//            Toast.makeText(getApplicationContext(), "La respuesta escogida no es la correcta, intenta escogiendo otra respuesta.", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp5, Toast.LENGTH_SHORT).show();
            rbg5.clearCheck();

        }else if (rb_p5b.isChecked()){

            rb_p5b.setEnabled(false);rb_p5b.setClickable(false);rb_p5b.setTextColor(Color.parseColor("#ff3333"));
            nota_rp5 = nota_rp5 - 0.25;
//            Toast.makeText(getApplicationContext(), "La respuesta escogida no es la correcta, intenta escogiendo otra respuesta.", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp5, Toast.LENGTH_SHORT).show();
            rbg5.clearCheck();

        }else if (rb_p5d.isChecked()){

            rb_p5d.setEnabled(false);rb_p5d.setClickable(false);rb_p5d.setTextColor(Color.parseColor("#ff3333"));
            nota_rp5 = nota_rp5 - 0.25;
//            Toast.makeText(getApplicationContext(), "La respuesta escogida no es la correcta, intenta escogiendo otra respuesta.", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp5, Toast.LENGTH_SHORT).show();
            rbg5.clearCheck();

        }else if (rb_p5c.isChecked()) {

            rb_p5a.setEnabled(false); rb_p5a.setClickable(false);
            rb_p5b.setEnabled(false); rb_p5b.setClickable(false);
            rb_p5d.setEnabled(false); rb_p5d.setClickable(false);
            rb_p5c.setClickable(false);
            rb_p5c.setTextColor(Color.parseColor("#33FF49"));
            boton.setEnabled(false);
//            Toast.makeText(getApplicationContext(), "Excelente , haz acertado la respuesta correcta. ", Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(), "La nota guardada es " + nota_rp5, Toast.LENGTH_SHORT).show();
        }
    }

    public void btotal (View view){

        Button boton = (Button) findViewById(R.id.total);
        Button boton1 = (Button) findViewById(R.id.bt_vp1);
        Button boton2 = (Button) findViewById(R.id.bt_vp2);
        Button boton3 = (Button) findViewById(R.id.bt_vp3);
        Button boton4 = (Button) findViewById(R.id.bt_vp4);
        Button boton5 = (Button) findViewById(R.id.bt_vp5);
        ScrollView scrollView1 = (ScrollView) findViewById(R.id.scrol1);

        if (boton1.isEnabled()) {
            Toast.makeText(getApplicationContext(), "Aún no has terminado la pregunta 1", Toast.LENGTH_SHORT).show();
            scrollView1.fullScroll(ScrollView.FOCUS_UP);
        }else if (boton2.isEnabled()){
            Toast.makeText(getApplicationContext(), "Aún no has terminado la pregunta 2", Toast.LENGTH_SHORT).show();
            scrollView1.scrollTo(0,900);
        }else if (boton3.isEnabled()){
            Toast.makeText(getApplicationContext(), "Aún no has terminado la pregunta 3", Toast.LENGTH_SHORT).show();
            scrollView1.scrollTo(0,1800);
        }else if (boton4.isEnabled()){
            Toast.makeText(getApplicationContext(), "Aún no has terminado la pregunta 4", Toast.LENGTH_SHORT).show();
            scrollView1.scrollTo(0,2700);
        }else if (boton5.isEnabled()){
            Toast.makeText(getApplicationContext(), "Aún no has terminado la pregunta 5", Toast.LENGTH_SHORT).show();
            scrollView1.scrollTo(0,3600);
        }else {
            nota_final = nota_rp5 + nota_rp4 + nota_rp3 + nota_rp2 + nota_rp1;
            Toast.makeText(getApplicationContext(), "La nota final del examen es " + nota_final, Toast.LENGTH_SHORT).show();
        }
    }
}

