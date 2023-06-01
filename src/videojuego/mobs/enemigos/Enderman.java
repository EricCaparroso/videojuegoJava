package videojuego.mobs.enemigosJuego;

import videojuego.mobs.MobHostil;

public class Enderman extends MobHostil {
    public Enderman(int salud, int fuerza) {
        super(salud = 14, fuerza = 6);
    }

    @Override
    public void moverse() {
        System.out.println("Se teletransporta detrás");

    }
}
