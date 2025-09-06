import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Cuantas Personas Desea Almacenar");
        int NPersonas= leer.nextInt();
        leer.nextLine();
        vector v= new vector(NPersonas);
        boolean salida= false;
        int opcion;
        //--- menu de opciones -----

        while(!salida){// mientras no sea falso se repite el menu
        System.out.println(" ---------------------------------------------------------------");
        System.out.println("| Bienvenido al Sistema de Gestion de Personas                  |");
        System.out.println("| 1. Agregar Persona                                            |");
        System.out.println("| 2. Mostrar Personas                                           |");
        System.out.println("| 3. Eliminar Personas                                          |");
        System.out.println("| 4. Buscar Personas                                            |");
        System.out.println("| 5. Mostrar Capacidad y Numero De Personas                     |");
        System.out.println("| 6. Salir                                                      |");
        System.out.println(" ---------------------------------------------------------------");
        //try cath para manejar excepciones y controlar los errores en tiempo de ejecucion//
        try{
        System.out.println("Escribe una de las opciones");
        opcion =leer.nextInt();
        leer.nextLine();

        switch (opcion) {
            case 1:{
            System.out.println("AGREGAR PERSONA");
            System.out.println("Nombre: ");
            String nombre= leer.nextLine();
            System.out.println("Apellido: ");
            String apellido= leer.nextLine();
            System.out.println("Edad: ");
            byte edad= leer.nextByte();
            System.out.println("Peso: ");
            float peso= leer.nextFloat();
            System.out.println("Altura: ");
            float altura= leer.nextFloat();
            leer.nextLine();
            Personas p= new Personas(nombre, apellido, edad, peso, altura);
            v.agregarPersona(p);
            break;
            }
            case 2:
            v.mostrarVector();
            break;
            case 3:{
            System.out.println("Ingrese Nombre a Eliminar: ");
            String n=leer.next();
            int pos= v.buscarPersona(n);
            if (pos != -1){
                v.eliminarPersona(pos);
                System.out.println(n + " Eliminado en la posicion " + pos);
            }else{
                System.out.println("No se Encontro Ninguna Persona con el Nombre: " +n);
            }
            break;
            }
            case 4:{
            System.out.println("Ingrese Nombre a Buscar: ");
            String BuscarNombre= leer.nextLine();
            int encontrado= v.buscarPersona(BuscarNombre);
            if (encontrado != -1) {
                System.out.println("Persona Encontrada en la Posicion " + encontrado);
            }
            break;
            }
            case 5:{
            System.out.println("La Capacidad de Personas Ingresada es de: " +v.getMax());
            System.out.println("Cantidad Actual de Personas: " + (v.getIndice() + 1));
            break;
            }
            case 6:
            System.out.println("SALIENDO DEL SISTEMA...");
            salida= true;
            break;
            default:
            System.out.println("OPCION INVALIDA");
            break;
        }
    } catch (Exception e){
        System.out.println("Ingrese un Numero Valido");
        leer.nextLine();
    }
}
leer.close();
    }
}

