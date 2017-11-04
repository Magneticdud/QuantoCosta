package it.dandandin.quantocosta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    public void increase(View view) {
        quantita++;
        display(quantita);
    }

    public void decrease(View view) {
        quantita--;
        if (quantita<0)
        {
            quantita = 0;
        }
        display(quantita);
    }

    /**
     * Calcola
     */
    public void submitOrder(View view) {
        display(quantita);
        displayPrice(quantita * unitPrice);
        LinearLayout linearPrezzo = (LinearLayout) findViewById(R.id.linearprezzo);
        linearPrezzo.setVisibility(View.VISIBLE);
    }

    /**
     * Mostra la quantità
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantitytextView);
        quantityTextView.setText("" + number);
    }

    /**
     * Mostra il prezzo.
     */
    private void displayPrice(double number) {
        TextView priceTextView = (TextView) findViewById(R.id.pricetextView);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}