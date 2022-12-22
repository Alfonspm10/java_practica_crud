package proyecto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
        Scanner lector = new Scanner(System.in);

        boolean programaActivo = true;

        do{
        System.out.println("¿Que operación quieres hacer?");
        System.out.println("1 - Insertar trabajador");
        System.out.println("2 - Eliminar trabajador");
        System.out.println("3 - Modificar trabajador");
        System.out.println("4 - Consultar trabajador");
        System.out.println("5 - Terminar");

        int opcion = lector.nextInt();

        if(opcion == 1){
            System.out.println("Introduce el nombre del trabajador: ");
            String nombre = lector.next();
            System.out.println("Introduce el nombre del trabajador: ");
            int edad = lector.nextInt();

            Trabajador a = new Trabajador();
            a.setNombre(nombre);
            a.setEdad(edad);
            trabajadores.add(a);

        } else if (opcion==2) {
            System.out.println("Introduce el nombre del trabajador que quieres eliminar: ");
            String nombre = lector.next();

            Iterator<Trabajador> it = trabajadores.iterator();

            while(it.hasNext()) {
                Trabajador a = it.next();
                if(a.getNombre().equals(nombre)){
                    it.remove();
                }
            }
        } else if (opcion==3) {
            System.out.println("Introduce el nombre del trabajador que quieres modificar: ");
            String nombre = lector.next();

            System.out.println("Introduce el nuevo nombre del trabajador: ");
            String nombre2 = lector.next();
            System.out.println("Introduce la nueva edad del trabajador: ");
            int edad2 = lector.nextInt();

            Iterator<Trabajador> it = trabajadores.iterator();

            while(it.hasNext()) {
                Trabajador a = it.next();
                if(a.getNombre().equals(nombre)){
                    a.setNombre(nombre2);
                    a.setEdad((edad2));
                }
            }

        } else if (opcion==4) {
            for(Trabajador a: trabajadores) {
                System.out.println("Nombre: " + a.getNombre() + ", Edad: " + a.getEdad());
            }

        } else if (opcion==5) {
            programaActivo = false;

        } else {
            System.out.println("No has elegido una opcion valida");
        }
        }while (programaActivo);


    }
}
