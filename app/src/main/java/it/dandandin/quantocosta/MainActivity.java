package it.dandandin.quantocosta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    /**
     * Scrive 1 giusto per vedere se funziona
     */
    public void submitOrder(View view) {
        display(1);
        displayPrice(2);
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
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.pricetextView);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}