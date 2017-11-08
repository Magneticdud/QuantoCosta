package it.dandandin.quantocosta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * Ma quanto costa?
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int quantita = 0;
    double unitPrice = 2.2;
    double extralaminazione = 1.2;

    public void increase(View view) {
        quantita++;
        calcuPrice();
    }

    public void decrease(View view) {
        quantita--;
        if (quantita<0)
        {
            quantita = 0;
        }
        calcuPrice();
    }

    /**
     * Calcola
     */
    public void submitOrder(View view) {
        calcuPrice();
    }

    /**
     * Mostra il prezzo.
     */
    private void calcuPrice() {
        CheckBox checkLamin = (CheckBox) findViewById(R.id.cb_laminazione);
        double prezzo = 0;
        if (checkLamin.isChecked()){
            prezzo = quantita * unitPrice * extralaminazione;
        }
        else
            prezzo = quantita * unitPrice;
        //scrivo il prezzo
        TextView priceTextView = (TextView) findViewById(R.id.pricetextView);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(prezzo));
        //mostro il layout del prezzo
        LinearLayout linearPrezzo = (LinearLayout) findViewById(R.id.linearprezzo);
        linearPrezzo.setVisibility(View.VISIBLE);
        TextView quantityTextView = (TextView) findViewById(R.id.quantitytextView);
        //necessario aggiungere "" a quantita per convertire il tutto a string
        quantityTextView.setText(quantita+"");
    }
}