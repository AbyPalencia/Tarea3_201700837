
package ipc.tarea3_201700837;
import java.util.Scanner;

public class IPCTarea3_201700837 {  
    public static void main(String[] args) { //Menú Principal
        int Opcion=0;
        do{
           System.out.println("    [IPC1]Tarea3_20170083    \n \n" 
                    + " 1. Usuarios \n"
                    + " 2. Contador de dìgitos\n "
                    + "3. Tres nùmeros de mayor a menor\n "
                    + "4. Calcular promedio\n "
                    + "5. Salir\n");
           
           Scanner S = new Scanner(System.in);
           Opcion = S.nextInt();
           
        switch(Opcion){
            case 1: Usuarios();
            break;
            case 2: System.out.println("HOLAsss");
            break;
            case 3: System.out.println("HOLAsssssssss");
            break;
            case 4: System.out.println("HOLAsssssssscsccsccscsc");
            break;
            case 5: System.out.println("Gracias por ver mi tarea :3");
            System.exit(0);
            break;
            default: System.out.println("Por favor elije una opción del 1 al 5 \n");
        } } while (Opcion != 5);
       }
    public static void Usuarios () { //Menú de usuarios
         int Opcion=0;
         do{
            System.out.println(" 1. Ingresar Usuarios \n"
                    + " 2. Mostrar Usuarios ascendnte \n "
                    + "3. Mostrar Usuarios descendente\n "
                    + "4. Menú principal \n ");
            
        switch(Opcion){
            case 1: System.out.println("HOLA");
            break;
            case 2: System.out.println("HOLsssA");
            break;
            case 3: System.out.println("HaaOLA");
            break;
            case 4: System.out.println("HOLasopA");
            break;
            default: System.out.println("Por favor elije una opción del 1 al 4 \n");
        } } while (Opcion != 4);
    }
    public static void Contador(){ //Menú de contador de dígitos
        int Opcion=0;
        do{
            System.out.println("1. Ingresar número \n"
                    + "2. Mostrar número de dígitos \n"
                    + "3. Menú principal");
        }while (Opcion !=3);
    }
}

