package com.example.login;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextInputEditText correo, contraseña;
    Button btn_login;
    TextView crea_aqui;
    daoUsuario dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correo = (TextInputEditText) findViewById(R.id.correo);
        contraseña = (TextInputEditText) findViewById(R.id.password);
        btn_login = (Button) findViewById(R.id.login);
        crea_aqui = (TextView) findViewById(R.id.createHere);

        btn_login.setOnClickListener(this);
        crea_aqui.setOnClickListener(this);

        dao = new daoUsuario(this);



    }

    // METODO DEL ONCLIK--QUE USABAMOS

   /* public void goCreateAccount(View view) {

        Intent intent = new Intent(this, create_account.class);
        startActivity(intent);
    }*/

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.login:
                String c = correo.getText().toString();
                String p = contraseña.getText().toString();
                if (c.equals("") && p.equals("")) {
                    Toast.makeText(this, "Error: Campos vacios", Toast.LENGTH_LONG).show();

                } else if (dao.login(c, p) == 1) {
                    usuarios ux = dao.getusuarios(c, p);
                    Toast.makeText(this, "Datos correctos", Toast.LENGTH_LONG).show();
                    Intent i3 = new Intent(MainActivity.this, Usuario.class);
                    i3.putExtra("id ", ux.getId());
                    startActivity(i3);

                } else {
                    Toast.makeText(this, "Correo y/o contraseña incorrectos", Toast.LENGTH_LONG).show();

                }

                break;


            case R.id.createHere:

                Intent i = new Intent(MainActivity.this, create_account.class);
                startActivity(i);
                break;


        }

    }
}
