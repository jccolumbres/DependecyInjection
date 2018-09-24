package testapp.jccolumbres.dependecyinjectionexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BattleOfTheBastards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Starks starks = new Starks();
        Boltons boltons = new Boltons();

        War war = new War(starks,boltons);
        war.prepare();
        war.report();
    }
}
