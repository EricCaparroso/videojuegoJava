package videojuego.player;

import videojuego.interfaces.Combate;

public class Personaje implements Combate {

    private int salud;
    private int defensa;
    private int fuerza;


    public Personaje(int defensa, int fuerza) {
        this.salud = 12;
        this.defensa = defensa;
        this.fuerza = fuerza;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getSalud() {
        return salud;
    }

    @Override
    public int atacar() {
        return fuerza;
    }


    @Override
    public void recibirAtaque(int ataque) {
        int danio = ataque - defensa;
        salud -= danio;
        System.out.println(" Tu personaje ha recibido " + danio + " puntos de daño, su salud restante es: " + salud);

    }
}
//hago este comentario para que git cambie
