package videojuego.mobs;

import videojuego.interfaces.Combate;

public abstract class MobHostil extends Mob implements Combate {
    public int fuerza;

    public MobHostil(int salud, int fuerza) {
        super(salud);
        this.fuerza = fuerza;
    }


    @Override
    public void moverse() {

    }

    @Override
    public int atacar() {
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque) {
        int danio = ataque;
        salud -= danio;
        System.out.println("El enemigo  recibio un daño de de: " + danio + " su salud restante es: " + salud);

    }


}
