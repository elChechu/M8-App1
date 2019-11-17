package chechulin.com.app1;

import android.app.Activity;
import android.os.Bundle;

public class CalculadoraIVA extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadoraiva);
        System.out.println("Estamos en el layout de calculadora IVA");
    }
}
