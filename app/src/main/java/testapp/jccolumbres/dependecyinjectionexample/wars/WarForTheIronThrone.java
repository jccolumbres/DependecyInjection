package testapp.jccolumbres.dependecyinjectionexample.wars;

import javax.inject.Inject;

import testapp.jccolumbres.dependecyinjectionexample.War;
import testapp.jccolumbres.dependecyinjectionexample.houses.Lannisters;
import testapp.jccolumbres.dependecyinjectionexample.houses.Starks;
import testapp.jccolumbres.dependecyinjectionexample.houses.Targaryen;

public class WarForTheIronThrone implements War {

    private Starks starks;
    private Lannisters lannisters;
    private Targaryen targaryen;

    @Inject
    public WarForTheIronThrone(Starks starks,Lannisters lannisters, Targaryen targaryen){
        this.starks = starks;
        this.lannisters = lannisters;
        this.targaryen = targaryen;

    }

    @Override
    public void report() {
        starks.reportForWar();
        lannisters.reportForWar();
        targaryen.reportForWar();
    }

    @Override
    public void prepare() {
        starks.prepareForWar();
        lannisters.prepareForWar();
        targaryen.prepareForWar();
    }
}
