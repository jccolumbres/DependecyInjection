package testapp.jccolumbres.dependecyinjectionexample;

public class Starks implements House {
    @Override
    public void prepareForWar() {
        System.out.println(this.getClass().getSimpleName()+ " prepared for war");
    }

    @Override
    public void reportForWar() {
        System.out.println(this.getClass().getSimpleName()+ " prepared for war");
    }
}
