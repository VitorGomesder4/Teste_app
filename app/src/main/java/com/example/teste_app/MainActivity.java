package com.example.teste_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button meuBotao;
    private EditText meuTexto;
    private TextView meuNovoTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        meuBotao = findViewById(R.id.botao);
        meuTexto = findViewById(R.id.texto);
        meuNovoTexto = findViewById(R.id.novoTexto);
        //Context ctx = getApplicationContext();

        meuBotao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Toast torrada = Toast.makeText(ctx, meuTexto.getText(), Toast.LENGTH_LONG);
                //torrada.show();

                meuNovoTexto.setText(meuTexto.getText());
            }
        });
    }
}