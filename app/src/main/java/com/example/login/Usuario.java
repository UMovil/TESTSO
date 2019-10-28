package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Usuario extends AppCompatActivity implements View.OnClickListener {

    TextView N, C, P;
    Button bs;
    int Id;
    daoUsuario dao;
    usuarios u;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        N = (TextView)findViewById(R.id.nom_us);
        /*
        C = (TextView)findViewById(R.id.C);
        P = (TextView)findViewById(R.id.pass);*/
        bs = (Button)findViewById(R.id.bs);

        bs.setOnClickListener(this);



         Bundle b =getIntent().getExtras();
        Id =b.getInt("Id");
        dao = new daoUsuario(this);
        u=dao.getusuariosById(Id);

       // N.setText(u.getCorreo());

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.bs:
                Intent i = new Intent(Usuario.this, MainActivity.class);
                startActivity(i);
                break;




        }

    }
}
