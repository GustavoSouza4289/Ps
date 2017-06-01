package br.com.gustavolinsdesouza.ps_simulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class CadastroActivity extends AppCompatActivity {

    private LinearLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        background = (LinearLayout) findViewById(R.id.activity_cadastro);

    }

    public  void machina(View v){
        Intent i = new Intent(this, MachinaActivity.class);
        startActivity(i);
    }
    public  void sobre(View v){
        Intent i = new Intent(this, DadoActivity.class);
        startActivity(i);
    }

    public void Masculino(View V){

        boolean checked = ((RadioButton)V ).isChecked();

        switch (V.getId()){
            case R.id.rbFeminino:
                background.setBackgroundResource(R.drawable.dva);
                break;
            case R.id.rbMasculino:
                background.setBackgroundResource(R.drawable.lucio);
                break;

        }

    }
}
