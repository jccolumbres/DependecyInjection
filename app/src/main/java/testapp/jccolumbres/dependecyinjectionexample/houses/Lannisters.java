package testapp.jccolumbres.dependecyinjectionexample.houses;

import android.util.Log;

import javax.inject.Inject;

import testapp.jccolumbres.dependecyinjectionexample.House;

public class Lannisters implements House {
    @Inject
    public Lannisters(){

    }
    @Override
    public void prepareForWar() {
        Log.d("Battle" , this.getClass().getSimpleName() + " prepared For War");
    }

    @Override
    public void reportForWar() {
        Log.d("Battle" , this.getClass().getSimpleName()+ " reporting");
    }
}
