package org.example;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
         String cedula;
         LocalDate fecha=LocalDate.now();
        LocalDateTime fecha2=LocalDateTime.now();

        String nombreEmpleado;
        String contrasenaEmpleado;
        String nombreEmpleadoBD="steven";
        String contrasenaEmpleadoBD="admin123";

        Integer opcion;

        System.out.println("********* Pandebonos Nairo ********");
        System.out.println("************************");
        System.out.println("Apreciado empleado, inicie sesion por favor: ");

        boolean login = false;

        while(!login) {
            System.out.println("Digite su usuario: ");
            nombreEmpleado = leer.nextLine();
            System.out.println("Digite su contraseña: ");
            contrasenaEmpleado = leer.nextLine();

            if (nombreEmpleado.equals(nombreEmpleadoBD) && contrasenaEmpleado.equals(contrasenaEmpleadoBD)) {

                System.out.println("Cargando Sistema......");
                login=true;




            } else {

                System.out.println("Usuario incorrecto");

            }

        }

        System.out.println("\n..........pandeSoftware..........");

        System.out.println("1. Registrar compra");
        System.out.println("2. Calcular total");
        System.out.println("3. Modificar compra");
        System.out.println("4. Salir");

        do{

            System.out.println("Sleccione una opcion: ");
            opcion = leer.nextInt();

            Integer cantidadTradicional=0;
            Integer cantidadGuayaba=0;
            Integer cantidadArequipe=0;
            Integer cantidadQuesos=0;
            Integer cantidadBebidas=0;

            Integer productoSeleccionado;


            switch (opcion){

                case 1:

                    System.out.println("1. Pandebono Tradicional ($8000)");
                    System.out.println("2. Pandebono Guayaba ($9500)");
                    System.out.println("3. Pandebono Arequipe ($12000)");
                    System.out.println("4. Pandebono 7 quesos ($20000)");
                    System.out.println("5. bebida ($9500)");
                    System.out.println("6. Terminar Pedido");
                    System.out.println(".................................");

                    do{

                        System.out.println("Digite producto deseado: ");
                        productoSeleccionado = leer.nextInt();

                       switch (productoSeleccionado){

                           case 1:

                               System.out.println("Ingrese la cantidad que desea: ");
                                cantidadTradicional = leer.nextInt();

                               break;

                           case 2:
                               System.out.println("Ingrese la cantidad que desea: ");
                               cantidadGuayaba = leer.nextInt();

                               break;

                           case 3:
                               System.out.println("Ingrese la cantidad que desea: ");
                               cantidadArequipe = leer.nextInt();

                               break;

                           case 4:
                               System.out.println("Ingrese la cantidad que desea: ");
                               cantidadQuesos = leer.nextInt();

                               break;

                           case 5:
                               System.out.println("Ingrese la cantidad que desea: ");
                               cantidadBebidas = leer.nextInt();

                               break;

                           case 6:
                               System.out.println("Orden terminada ");

                               break;

                           default:
                               System.out.println("Producto no encontrado");
                               break;


                       }

                    }while(productoSeleccionado != 6);

                    break;

                    case 2:

                        int totalSinPropina=((cantidadTradicional*8000)+(cantidadGuayaba*9500)+
                                (cantidadArequipe*12000)+(cantidadQuesos*20000)+(cantidadBebidas*9500));


                        Double totalConPropina=((totalSinPropina)+(totalSinPropina*0.1));

                        break;

                case 3:




                    break;

                case 4:

                    System.out.println("Compra terminada");


                    break;

                default:

                    System.out.println("Opcion invalida");

                    break;




            }

        }while (opcion != 4);




    }
}