package videojuego.mobs;

import videojuego.interfaces.Danio;

public abstract class MobPacifico extends Mob implements Danio {
    public MobPacifico(int salud) {
        super(salud);
    }

    @Override
    public void recibirAtaque(int ataque) {
        salud -= ataque;


    }
}
