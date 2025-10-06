
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner leer=new Scanner(System.in);
        
        boolean SalirMenuPrincipal= false;

        while(!SalirMenuPrincipal){
            System.out.println("===========================================================");
            System.out.printf("| %-56s |\n", "Bienvenido Al Sistema  De Gestion De Personas");
            System.out.println("===========================================================");
            System.out.printf("| %-56s |\n", "MENU PRINCIPAL");
            System.out.println("===========================================================");
            System.out.printf("| %-2s %-53s |\n", "1.", "Gestionar Con Vector");
            System.out.printf("| %-2s %-53s |\n", "2.", "Gestionar Con Matriz");
            System.out.printf("| %-2s %-53s |\n", "3.", "Gestionar Con Listas Simples");
            System.out.printf("| %-2s %-53s |\n", "4.", "Salir");
            System.out.println("===========================================================");
            System.out.print("Elige Una Opcion: ");
            int OpcionPrincipal= leer.nextInt();
            leer.nextLine();

            switch(OpcionPrincipal){
                case 1:   
                System.out.println("Cuantas Personas Desea Almacenar En El Vector: ");
                int NPersonas= leer.nextInt();
                leer.nextLine();
                vector v= new vector(NPersonas);
                boolean SalirVector= false;
                while(!SalirVector){
                    System.out.println("========================================");
                    System.out.printf("| %-38s |\n", "MENU VECTOR");
                    System.out.println("========================================");
                    System.out.printf("| %-2s %-35s |\n", "1.", "Agregar Personas");
                    System.out.printf("| %-2s %-35s |\n", "2.", "Mostrar Personas");
                    System.out.printf("| %-2s %-35s |\n", "3.", "Eliminar Personas");
                    System.out.printf("| %-2s %-35s |\n", "4.", "Buscar Personas");
                    System.out.printf("| %-2s %-35s |\n", "5.", "Mostrar Capacidad");
                    System.out.printf("| %-2s %-35s |\n", "6.", "Volver Al Menu Principal");
                    System.out.println("========================================");
                    System.out.print("Elige Una Opcion: ");
                    int OpcionVector= leer.nextInt();
                    leer.nextLine();

                    switch(OpcionVector){
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
                    case 4: {
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
                SalirVector= true;
                break;
                    default: 
                    System.out.println("Opcion Invalida");
            }
        }
        break;
        case 2:
        int filas, columnas;
        while(true){
            System.out.print("Ingrese Numero de Filas Para la Matriz (Solo Se Permite Matriz Cuadrada): ");
            filas= leer.nextInt();
            System.out.print("Ingrese Numero de Columnas Para la Matriz (Solo Se Permite Matriz Cuadrada): ");
            columnas= leer.nextInt();
            leer.nextLine();
            
            if (filas==columnas){
                break;
            }else{
                System.out.println("La Matriz Debe Ser Cuadrada");
            }
        }
        Matriz m= new Matriz(filas, columnas);
        boolean SalirMatriz= false;
        while(!SalirMatriz){
            System.out.println("====================================================");
            System.out.printf("| %-48s |\n", "MENU MATRIZ");
            System.out.println("====================================================");
            System.out.printf("| %-2s %-45s |\n", "1.", "Agregar Personas");
            System.out.printf("| %-2s %-45s |\n", "2.", "Mostrar Matriz");
            System.out.printf("| %-2s %-45s |\n", "3.", "Eliminar Persona Por Posicion");
            System.out.printf("| %-2s %-45s |\n", "4.", "Eliminar Persona Por Nombre");
            System.out.printf("| %-2s %-45s |\n", "5.", "Calcula Promedio Peso Matriz Principal");
            System.out.printf("| %-2s %-45s |\n", "6.", "Calcular Promedio Altura Matriz Secundaria");
            System.out.printf("| %-2s %-45s |\n", "7.", "Volver Al Menu Principal");
            System.out.println("====================================================");
            System.out.print("Elige Una Opcion: ");

            int OpcionMatriz= leer.nextInt();
            leer.nextLine();

            switch(OpcionMatriz){
                case 1: {
                    System.out.println("Agregar Persona a Matriz");
                    System.out.print("Nombre: ");
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
                    m.ingresarPersonaSecuencial2(p);
                    break;
                }
                case 2: 
                m.mostrarMatriz();
                break;
                case 3: {
                    System.out.print("Ingrese Fila: ");
                    int f= leer.nextInt();
                    System.out.print("Ingrese Columna: ");
                    int c= leer.nextInt();
                    leer.nextLine();
                    m.eliminarMatrizporPos(f, c);
                    break;
                }
                case 4: {
                    System.out.println("Ingrese el Nombre Que Desea Eliminar de la Matriz");
                    String nombre= leer.nextLine();
                    m.eliminarMatrizporNombre(nombre);
                    break;
                }
                case 5:
                m.promedioPesoMP();
                break;
                case 6:
                m.promedioEstaturaMS();
                break;
                case 7:
                SalirMatriz= true;
                break;
            default:
            System.out.println("Opcion Invalida");
            }
        }
        break;
        case 3:
        ListaSimple lista= new ListaSimple();
            boolean SalirLista= false;
            while(!SalirLista){
                System.out.println("==========================================");
                System.out.printf("| %-38s |\n", "MENU LISTA SIMPLE");
                System.out.println("==========================================");
                System.out.printf("| %-2s %-35s |\n", "1.", "Agregar Persona al Inicio");
                System.out.printf("| %-2s %-35s |\n", "2.", "Agregar Persona al Final");
                System.out.printf("| %-2s %-35s |\n", "3.", "Agregar Persona antes de X Posicion");
                System.out.printf("| %-2s %-35s |\n", "4.", "Agregar Persona antes de X Persona");
                System.out.printf("| %-2s %-35s |\n", "5.", "Mostrar Personas");
                System.out.printf("| %-2s %-35s |\n", "6.", "Contar Personas");
                System.out.printf("| %-2s %-35s |\n", "7.", "Eliminar Persona Por Posicion");
                System.out.printf("| %-2s %-35s |\n", "8.", "Eliminar Personas Por Nombre");
                System.out.printf("| %-2s %-35s |\n", "9.", "Volver al Menú Principal");
                System.out.println("==========================================");
                System.out.print("Elige Una Opcion: ");
                int opcionLista= leer.nextInt();
                leer.nextLine();
                switch (opcionLista) {
                    case 1:{
                        Personas p= crearPersonas(leer);
                        lista.agregarPersonaInicio(p);
                        break;
                    }
                    case 2:{
                        Personas p= crearPersonas(leer);
                        lista.agregarPersonaFinal(p);
                        break;
                    }
                    case 3:{
                        System.out.print("Ingrese la Posicion: ");
                        int pos= leer.nextInt();
                        leer.nextLine();
                        Personas p= crearPersonas(leer);
                        lista.agregarPersonaAntesDePos(p, pos);
                        break;
                    }
                    case 4:{
                        System.out.print("Ingrese la Persona siguiente a la que se insertara la persona 'X': ");
                        String nombreRef= leer.nextLine();
                        Personas nueva= crearPersonas(leer);
                        lista.agregarPersonaAntesDeNombre(nueva, nombreRef);
                        break;
                    }
                    case 5:
                        lista.mostrarLista();
                        break;
                    case 6:
                        System.out.println("Cantidad de Personas: " +lista.contarNodos());
                        break;
                    case 7:{
                        System.out.println("Ingrese la Posicion de la Persona a Eliminar: ");
                        int pos= leer.nextInt();
                        leer.nextLine();
                        lista.eliminarListaPersonaPorPos(pos);
                        break;
                    }
                    case 8:{
                        System.out.println("Ingrese el Nombre de la Persona a Eliminar: ");
                        String nombre= leer.nextLine();
                        lista.eliminarListaPersonaPorNombre(nombre);
                        break;
                    }
                    case 9:
                        SalirLista= true;
                        break;
                    default:
                        break;
                }
            }
        case 4:
        System.out.println("Saliendo Del Sistema...");
        SalirMenuPrincipal= true;
        break;

        default: 
        System.out.println("Opcion Invalida");
    }
}
leer.close();
    }
    private static Personas crearPersonas(Scanner leer){
        System.out.print("Nombre: ");
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

        return new Personas(nombre, apellido, edad, peso, altura);

    }
}