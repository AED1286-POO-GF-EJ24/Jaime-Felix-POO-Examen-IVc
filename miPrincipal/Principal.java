package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        System.out.println("La Noticia de Hoy");
        System.out.println("=================");

        System.out.println();

        // Suscripcion Fisica
        System.out.println("Suscripcion Fisica:");
        System.out.print("Proporcione el nombre del suscriptor:");
        System.out.print("Proporcione la direccion del suscriptor:");

        // Crear SuscripcionFisica
        Suscripcion s1 = new SuscripcionFisica(nombre, direccion, 0.0);

        // Suscripcion En Linea

        // Crear SuscripcionEnLinea
        Suscripcion s2 = new SuscripcionEnLinea(nombre, direccion, 0.0);

        // Mostrar los datos de las suscripciones
        System.out.println();

        entrada.close();
    }
}