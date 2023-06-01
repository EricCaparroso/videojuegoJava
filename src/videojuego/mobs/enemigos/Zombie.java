package videojuego.mobs.enemigosJuego;

import videojuego.mobs.MobHostil;

public class Zombie extends MobHostil {
    public Zombie(int salud, int fuerza) {
        super(salud = 10, fuerza = 4);
    }

    @Override
    public void moverse() {
        System.out.println("Se mueve hacia el personaje");

    }
}
