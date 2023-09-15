package com.example.appmercao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void LoadNota(View view) {

        double nota1, nota2, nota3, nota4, media;
        EditText Enota1, Enota2, Enota3, Enota4;
        TextView resultado;
        Enota1 = findViewById(R.id.EditTextIdNota1);
        Enota2 = findViewById(R.id.EditTextIdNota2);
        Enota3 = findViewById(R.id.EditTextIdNota3);
        Enota4 = findViewById(R.id.EditTextIdNota4);
        resultado = findViewById(R.id.TextViewIdResultado);
        nota1 = Double.parseDouble(Enota1.getText().toString());
        nota2 = Double.parseDouble(Enota2.getText().toString());
        nota3 = Double.parseDouble(Enota3.getText().toString());
        nota4 = Double.parseDouble(Enota4.getText().toString());
        media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        String retorno = this.Mencao(media);
        resultado.setText(retorno);

    } // fim LoadNota

    public String Mencao(double media) {

        if (media >= 90) {
            return "Aluno Aprovado com Nota:" + media + " e Menção SS!";

        } else if (media >= 70) {
            return "Aluno Aprovado com Nota:" + media + " e Menção MS!";

        } else if (media >= 50) {
            return "Aluno Aprovado com Nota:" + media + " e Menção MM!";

        } else
            return "Aluno Reprovado com Nota:" + media + " e Menção MN!";

    }
}