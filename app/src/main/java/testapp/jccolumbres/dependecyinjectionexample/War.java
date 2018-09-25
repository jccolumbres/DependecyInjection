package testapp.jccolumbres.dependecyinjectionexample;

import javax.inject.Inject;

public class War {

    private Starks starks;
    private Boltons boltons;
    private Arryn arryn;

    //DI - getting dependencies from else where via constructor

    @Inject
    public War(Starks starks, Boltons boltons, Arryn arryn) {
        this.starks = starks;
        this.boltons = boltons;
        this.arryn = arryn;
    }

    public void prepare(){
        starks.prepareForWar();
        boltons.prepareForWar();
        arryn.prepareForWar();
    }
    public void report(){
        starks.reportForWar();
        boltons.reportForWar();
        arryn.reportForWar();
    }

}
