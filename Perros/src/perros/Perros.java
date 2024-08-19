
package perros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Perros {

    
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList<>();
        String respuesta;

        do {
            System.out.print("Ingrese una raza de perro: ");
            String raza = scanner.nextLine();
            razas.add(raza);

            System.out.print("¿Desea agregar otra raza? (S/N): ");
            respuesta = scanner.nextLine();

        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println("Las razas guardadas son: " + razas);

       
        System.out.print("Ingrese una raza de perro para eliminar: ");
        String razaAEliminar = scanner.nextLine();

        Iterator<String> iterator = razas.iterator();
        boolean encontrada = false;

        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase(razaAEliminar)) {
                iterator.remove();
                encontrada = true;
            }
        }

        if (encontrada) {
            System.out.println("Raza eliminada. Las razas restantes son: " + razas);
        } else {
            System.out.println("La raza no se encuentra en la lista.");
        }

        razas.sort(String::compareTo); // Ordenar la lista alfabéticamente
        System.out.println("Razas ordenadas: " + razas);
    }
}
