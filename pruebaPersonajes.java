import java.util.Scanner;

public class PruebaPersonajes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la Prueba de Personajes de Acción\n");

        System.out.print("Ingrese la cantidad de personajes que desea crear: ");
        int cantidadPersonajes = scanner.nextInt();

        PersonajeDeAccion[] personajes = new PersonajeDeAccion[cantidadPersonajes];

        for (int i = 0; i < cantidadPersonajes; i++) {
            System.out.println("\nCreación del Personaje #" + (i + 1));
            System.out.print("Ingrese el nombre del personaje: ");
            String nombre = scanner.next();
            System.out.print("Ingrese la altura del personaje: ");
            double altura = scanner.nextDouble();
            System.out.print("Ingrese el peso del personaje: ");
            double peso = scanner.nextDouble();
            System.out.print("Ingrese el color de piel del personaje: ");
            String colorPiel = scanner.next();
            System.out.print("Ingrese el porcentaje de poder del personaje: ");
            double porcentajePoder = scanner.nextDouble();

            personajes[i] = new PersonajeDeAccion(nombre, altura, peso, colorPiel, porcentajePoder);
        }

        System.out.println("\nResumen de personajes creados:");
        for (PersonajeDeAccion personaje : personajes) {
            System.out.println("Nombre: " + personaje.getNombre());
        }

        System.out.println("\nSimulación de comportamientos:");
        for (PersonajeDeAccion personaje : personajes) {
            System.out.println("\nComportamientos de " + personaje.getNombre() + ":");
            personaje.atacar();
            personaje.correr();
            personaje.saltar();
            personaje.esquivar();
            personaje.morir();
        }

        scanner.close();
    }
}
