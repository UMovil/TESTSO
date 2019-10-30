package com.example.login;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class create_account extends AppCompatActivity implements View.OnClickListener {

    TextInputEditText tetcorreo, tetnombre, tetcontraseña;
    Button btn_unirte;
    Button btn_cancelar;
    daoUsuario dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        tetcorreo = findViewById(R.id.email);
        tetnombre = findViewById(R.id.nombre);

        tetcontraseña = findViewById(R.id.password);

        btn_unirte = findViewById(R.id.joinUs);
        btn_cancelar = findViewById(R.id.joinUs2);

        btn_unirte.setOnClickListener(this);
        btn_cancelar.setOnClickListener(this);

        dao= new daoUsuario(this );
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.joinUs:

                usuarios u = new usuarios();
                u.setNombre(tetnombre.getText().toString());
                u.setCorreo(tetcorreo.getText().toString());
                u.setContraseña(tetcontraseña.getText().toString());

                if (!u.isNull()){

                    Toast.makeText(this,"ERROR: Campos vacios",Toast.LENGTH_LONG).show();
                } else if (dao.insertUsuario(u)){

                    Toast.makeText(this,"Registro Exitoso",Toast.LENGTH_LONG).show();

                    Intent i2= new Intent(create_account.this,MainActivity.class);
                    startActivity(i2);
                    finish();

                } else {

                    Toast.makeText(this,"Usuario ya registrado",Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.joinUs2:

                Intent i= new Intent(create_account.this,MainActivity.class);
                startActivity(i);
                finish();
                break;
        }
    }
}
