package chechulin.com.app1;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraIVA extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadoraiva);
        System.out.println("LOG  -- Estamos en el layout de calculadora IVA");

    }

    public void Calculo(View vista){
        EditText numero = (EditText) findViewById(R.id.editText3);
        TextView valor = (TextView) findViewById(R.id.textView2);
        float numero1 = Float.parseFloat(String.valueOf(numero.getText()));
        System.out.println("[!] Numero seleccionado: " + numero1);
        numero1 = numero1 * 21 / 100;
        String valor2 = Float.toString(numero1);
        valor.setText("El 21% de "+numero.getText()+" es : "+valor2);
        valor.setVisibility(View.VISIBLE);
    }

}
