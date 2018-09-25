package testapp.jccolumbres.dependecyinjectionexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dagger.Component;
import dagger.android.DaggerActivity;
import dagger.android.DaggerApplication_MembersInjector;



public class BattleOfTheBastards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Manual Dependency Injection
        Starks starks = new Starks();
        Boltons boltons = new Boltons();

        War war = new War(starks,boltons);
        war.prepare();
        war.report();
        */

        BattleComponent component = DaggerBattleComponent.create();
        War war = component.getWar();
        war.prepare();
        war.report();


    }
}
