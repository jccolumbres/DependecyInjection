package testapp.jccolumbres.dependecyinjectionexample;

import android.util.Log;

import javax.inject.Inject;

public class Boltons implements House {
    @Inject
    public Boltons(){

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
