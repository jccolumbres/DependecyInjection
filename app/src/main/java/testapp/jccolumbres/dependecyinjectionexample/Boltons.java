package testapp.jccolumbres.dependecyinjectionexample;

public class Boltons implements House {
    @Override
    public void prepareForWar() {
        System.out.println(this.getClass().getSimpleName()+ " prepared for war");
    }

    @Override
    public void reportForWar() {
        System.out.println(this.getClass().getSimpleName()+ " reporting");
    }
}
