package testapp.jccolumbres.dependecyinjectionexample;

import android.util.Log;

import javax.inject.Inject;

public class Arryn implements House {
    @Inject
    public Arryn(){

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
