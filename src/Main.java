import videojuego.mobs.MobHostil;
import videojuego.player.Personaje;
import videojuego.mobs.enemigosJuego.Zombie;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Personaje player1 = new Personaje(0, 0);
        Scanner sc = new Scanner(System.in);


        System.out.println("Bienvenido");
        System.out.println("Que arma llevara el personaje");
        System.out.println("1: ninguna");
        System.out.println("2: Espada madera");
        System.out.println("3: Espada de hierro");
        System.out.println("4: Espada de diamante");
        int condicion = sc.nextInt();

        switch (condicion) {
            case 1:
                player1.setFuerza(1);
                break;
            case 2:
                player1.setFuerza(2);
                break;
            case 3:
                player1.setFuerza(3);
                break;
            case 4:
                player1.setFuerza(5);
            default:
                System.out.println("seleccione un número del 1 al 4");

        }


        System.out.println("Que armadura llevara el personaje");
        System.out.println("1: ninguna");
        System.out.println("2: De cuero");
        System.out.println("3: De hierro");
        System.out.println("4: De diamante");
        int condicion2 = sc.nextInt();

        switch (condicion2) {
            case 1:
                player1.setDefensa(0);
                break;
            case 2:
                player1.setDefensa(1);
                break;
            case 3:
                player1.setDefensa(2);
                break;
            case 4:
                player1.setDefensa(3);
            default:
                System.out.println("seleccione un número del 1 al 4");

        }
        System.out.println("El personaje tiene un ataque de: " + player1.getFuerza() + " y una defensa de: " + player1.getDefensa());

        MobHostil enemy = new Zombie(10, 4);

        int turnos = 1;
        Random random = new Random();

        System.out.println("¡Comienza el combate!");

        while (player1.getSalud() > 0 && enemy.getSalud() > 0) {
            System.out.println("Turno " + turnos + ":");


            int fuerzaPersonaje = player1.atacar();
            enemy.recibirAtaque(fuerzaPersonaje);
            if (enemy.getSalud() <= 0) {
                break;
            }


            int accionEnemigo = random.nextInt(2) + 1;
            if (accionEnemigo == 1) {
                int fuerzaEnemigo = enemy.atacar();
                player1.recibirAtaque(fuerzaEnemigo);
                if (player1.getSalud() <= 0) {
                    break;
                }
            } else {
                enemy.moverse();
            }

            turnos++;
        }


        System.out.println("¡El combate ha terminado!");

        if (player1.getSalud() > 0) {
            System.out.println("Tu personaje ha salido victorioso después de " + turnos + " turnos.");
        } else {
            System.out.println("El enemigo ha derrotado al personaje después de " + turnos + " turnos.");
        }
    }


}
