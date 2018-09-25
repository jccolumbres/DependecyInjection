package testapp.jccolumbres.dependecyinjectionexample.wars;

import javax.inject.Inject;

import testapp.jccolumbres.dependecyinjectionexample.War;
import testapp.jccolumbres.dependecyinjectionexample.houses.Arryn;
import testapp.jccolumbres.dependecyinjectionexample.houses.Boltons;
import testapp.jccolumbres.dependecyinjectionexample.houses.Lannisters;
import testapp.jccolumbres.dependecyinjectionexample.houses.Starks;
import testapp.jccolumbres.dependecyinjectionexample.houses.Targaryen;

public class WarOfMenAndWhiteWalkers implements War{

    private Starks starks;
    private Boltons boltons;
    private Arryn arryn;

    //DI - getting dependencies from else where via constructor

    @Inject
    public WarOfMenAndWhiteWalkers(Starks starks, Boltons boltons, Arryn arryn) {
        this.starks = starks;
        this.boltons = boltons;
        this.arryn = arryn;
    }


    @Override
    public void report() {
        starks.reportForWar();
        boltons.reportForWar();
        arryn.reportForWar();
    }

    @Override
    public void prepare() {
        starks.prepareForWar();
        boltons.prepareForWar();
        arryn.prepareForWar();
    }
}
