package testapp.jccolumbres.dependecyinjectionexample.battles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import testapp.jccolumbres.dependecyinjectionexample.BattleComponent;
import testapp.jccolumbres.dependecyinjectionexample.DaggerBattleComponent;
import testapp.jccolumbres.dependecyinjectionexample.R;
import testapp.jccolumbres.dependecyinjectionexample.War;
import testapp.jccolumbres.dependecyinjectionexample.wars.WarForTheIronThrone;
import testapp.jccolumbres.dependecyinjectionexample.wars.WarOfMenAndWhiteWalkers;


public class BattleOfTheBastards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Manual Dependency Injection
        Starks starks = new Starks();
        Boltons boltons = new Boltons();

        WarOfMenAndWhiteWalkers war = new WarOfMenAndWhiteWalkers(starks,boltons);
        war.prepare();
        war.report();
        */

        BattleComponent component = DaggerBattleComponent.create();
        WarOfMenAndWhiteWalkers war1 = component.getWar1();
        war1.prepare();
        war1.report();

        WarForTheIronThrone war2 = component.getWar2();
        war2.prepare();
        war2.report();


    }
}
