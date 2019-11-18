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
                mostrarError(false);
            }
            else {
                textoresultado.setText("Has seleccionado calcular tu peso ideal");
                mostrarError(false);
            }
        }
    }

    // Hacer o no visible el error de seleccion
    public void mostrarError(boolean visibilidad){
        TextView tv1 = (TextView) findViewById(R.id.textView4);
        if (!visibilidad){
            tv1.setVisibility(View.GONE);
        }else {
            tv1.setVisibility(View.VISIBLE);
            tv1.setText("Error, debe seleccionar una opcion primero");
        }
    }
    public void accederCaclculadora(View view){
        Intent intent_iva = new Intent(this, CalculadoraIVA.class);
        Intent intent_peso = new Intent(this, Pesoideal.class);
        if (this.seleccion == 0){
            mostrarError(true);
        }else {
            if (this.seleccion == 1){ startActivity(intent_iva); }
            else if (this.seleccion == 2){ startActivity(intent_peso); }
        }
    }





}
