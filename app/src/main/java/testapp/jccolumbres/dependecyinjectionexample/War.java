package testapp.jccolumbres.dependecyinjectionexample;

public class War {

    private Starks starks;
    private Boltons boltons;


    //DI - getting dependencies from else where via constructor
    public War( Starks starks, Boltons boltons) {
        this.starks = starks;
        this.boltons = boltons;
    }

    public void prepare(){
        starks.prepareForWar();
        boltons.prepareForWar();
    }
    public void report(){
        starks.reportForWar();
        boltons.reportForWar();
    }

}
