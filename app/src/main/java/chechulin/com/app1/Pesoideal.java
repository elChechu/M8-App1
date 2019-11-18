package chechulin.com.app1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Pesoideal extends Activity {

    private double minbul = 16;
    private double min = 18.5;
    private double max = 24.9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.peso_ideal);
    }

    public void CalcularPesoIdeal(View vista){

        EditText edad = (EditText) findViewById(R.id.editText);
        EditText altura = (EditText) findViewById(R.id.editText2);
        TextView result = (TextView) findViewById(R.id.textView9);

        double peso = Double.valueOf(String.valueOf(edad.getText()));
        double alt = Double.valueOf(String.valueOf(altura.getText()));

        String resultado = "Nada";

        double aux = alt / 100;
        double constant = peso / Math.pow(aux, 2);

        if (constant < max && constant > min){
            if (constant < 26.5 && constant > 25.5){
                resultado = "Estás divin@ ;)";
            }else {
                resultado = "Estás en tu peso ideal ;)";
            }
        }else{
            if (constant <= 18.5){
                if (constant >= minbul && constant <= 17){
                    resultado = "Demasiado delgado ";
                }if (constant >= minbul && constant <= 18.5){
                    resultado = "Estás extremadamente delgado...";
                }else{
                    resultado = "En los huesos";
                }
            }else if (constant >= 25){
                if (constant >= 25 && constant < 30){
                    resultado = "Tienes cierto sobrepeso";
                }
                if (constant >= 30){
                    resultado = "Sufres obesidad";
                }
            }
        }
        result.setText(resultado);
        result.setVisibility(View.VISIBLE);
    }

}
