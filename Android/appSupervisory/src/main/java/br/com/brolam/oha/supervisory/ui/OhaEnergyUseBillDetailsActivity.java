package br.com.brolam.oha.supervisory.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.brolam.oha.supervisory.R;

/**
 * Atividade para exibir os detalhes da conta de energia.
 * @author Breno Marques
 * @version 1.00
 * @since Release 01.01.00
 */
public class OhaEnergyUseBillDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy_use_bill_details);
    }

    public static void show(Context context){
        Intent intent = new Intent(context, OhaEnergyUseBillDetailsActivity.class);
        context.startActivity(intent);
    }
}
