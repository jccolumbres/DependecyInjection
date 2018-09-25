package testapp.jccolumbres.dependecyinjectionexample;

import dagger.Component;

@Component
public interface BattleComponent {
    War getWar();

}
