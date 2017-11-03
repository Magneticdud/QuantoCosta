package it.dandandin.quantocosta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
    }

    /**
     * Mostra la quantità
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantitytextView);
        quantityTextView.setText("" + number);
    }
}