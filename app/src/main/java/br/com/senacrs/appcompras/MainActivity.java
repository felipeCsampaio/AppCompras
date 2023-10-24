package br.com.senacrs.appcompras;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox chkArroz, chkLeite, chkCarne, chkFeijao;
    Button btnTotal;

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        chkArroz = (CheckBox)findViewById(R.id.chkArroz);
        chkLeite = (CheckBox) findViewById(R.id.chkLeite);
        chkCarne = (CheckBox) findViewById(R.id.chkCarne);
        chkFeijao = (CheckBox) findViewById(R.id.chkFeijao);

        Button btnTotal = (Button) findViewById(R.id.btnTotal);
        btnTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total = 0;
                if(chkArroz.isChecked()){total += 2.69;}
                if(chkLeite.isChecked()){total += 5.00;}
                if(chkCarne.isChecked()){total += 9.7;}
                if(chkFeijao.isChecked()){total += 2.30;}

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage(("Valor total de compra:"+ String.valueOf(total)));
                dialogo.setNeutralButton("OK",null);
                dialogo.show();
            }
        });
            }
}

