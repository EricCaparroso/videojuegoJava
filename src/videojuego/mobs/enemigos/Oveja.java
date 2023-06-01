package videojuego.mobs.enemigosJuego;

import videojuego.mobs.MobPacifico;

public class Oveja extends MobPacifico {
    public Oveja(int salud) {
        super(salud = 5);
    }

    @Override
    public void moverse() {
        System.out.println("Se mueve por el campo");

    }
}
