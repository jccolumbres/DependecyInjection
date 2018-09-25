package testapp.jccolumbres.dependecyinjectionexample;

import dagger.Component;
import testapp.jccolumbres.dependecyinjectionexample.wars.WarForTheIronThrone;
import testapp.jccolumbres.dependecyinjectionexample.wars.WarOfMenAndWhiteWalkers;

@Component
public interface BattleComponent {
    WarOfMenAndWhiteWalkers getWar1();
    WarForTheIronThrone getWar2();
}
