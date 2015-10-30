package br.senac.pi.soma;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //myCode________________
        findViewById(R.id.btnSomar).setOnClickListener(somar());

    }
    //MyCode
    private View.OnClickListener somar(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText edtPrimerioNumero = (EditText) findViewById(R.id.edtPrimerio_numero);
                EditText edtSegundoNumero = (EditText) findViewById(R.id.edtSegundo_numero);
                //Converter os dados informados pelo usuário no campo texto em double
                double primeiroNumero = Double.parseDouble(edtPrimerioNumero.getText().toString());
                double segundoNumero = Double.parseDouble(edtSegundoNumero.getText().toString());
                double total = primeiroNumero + segundoNumero;
                Toast.makeText(MainActivity.this, getString(R.string.total)+total, Toast.LENGTH_LONG).show();
            }
        };
    }
    //______________
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
