package testapp.jccolumbres.dependecyinjectionexample;

import android.util.Log;

import javax.inject.Inject;

public class Boltons implements House {
    @Inject
    public Boltons(){

    }
    @Override
    public void prepareForWar() {
        Log.d("Message" , this.getClass().getSimpleName() + "preparedForWar");
    }

    @Override
    public void reportForWar() {
        Log.d("Message" , this.getClass().getSimpleName()+ " reporting");
    }
}
