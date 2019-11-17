package chechulin.com.app1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int seleccion = 0; // none

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SeleccionIVA(View vista){
        seleccion = 1;
        System.out.println("El valor de seleccion ahora es_ " + seleccion);
        mostrarSeleccion(seleccion);
    }

    public void SeleccionPeso(View vista){
        seleccion = 2;
        System.out.println("El valor de seleccion ahora es_ " + seleccion);
        mostrarSeleccion(seleccion);
    }

    public void mostrarSeleccion(int seleccion){
        TextView textoresultado = (TextView) findViewById(R.id.textView3);
        if (seleccion == 0){
            textoresultado.setText("Porfavor selecciona una opción");
        }else {
            if (seleccion == 1){
                textoresultado.setText("Has seleccionado calcular el Iva");
            }
            else {
                textoresultado.setText("Has seleccionado calcular tu peso ideal");
            }
        }
    }

    // Hacer o no visible el error de seleccion
    public void mostrarError(){
        TextView tv1 = (TextView) findViewById(R.id.textView4);
        if(tv1.getVisibility() == View.VISIBLE){ //si es Visible lo pones Gone
            tv1.setVisibility(View.GONE);
        }else{ // si no es Visible, lo pones
            tv1.setVisibility(View.VISIBLE);
        }
    }
    public void accederCaclculadora(View view, int seleccion){

        Intent intent = new Intent(this, CalculadoraIVA.class);
        if (seleccion == 0){
            // generar error de seleccion
        }else {
            startActivity(intent);
        }
    }
}
