
package ipc.tarea3_201700837;
import java.util.Scanner;

public class IPCTarea3_201700837 {  

    public static void main(String[] args) { //Aquí solo llame al metodo principal
        menuprincipal();                     //ya que en los otros metodos queria llamar
       }                                     //a main y no podia. Por eso cree el metodo "menuprincipal"
    
    
    public static void menuprincipal(){ //Menú Principal
        int Opcion=0;
        do{
           System.out.println("    [IPC1]Tarea3_20170083    \n \n" 
                    + " 1. Usuarios \n"
                    + " 2. Contador de dígitos\n "
                    + "3. Tres números de mayor a menor\n "
                    + "4. Calcular promedio\n "
                    + "5. Salir\n");
           
           Scanner S = new Scanner(System.in);
           Opcion = S.nextInt();
           
        switch(Opcion){
            case 1: Usuarios();
            break;
            case 2: Contador();
            break;
            case 3: MayorMenor();
            break;
            case 4: Promedio();
            break;
            case 5: System.out.println("Gracias por ver mi tarea :3");
            System.exit(0);
            break;
            default: System.out.println("Por favor elije una opción del 1 al 5 \n");
        } } while (Opcion != 5); //Duda: como le hago para sacar un error si escribe una letra
    }
    public static void Usuarios () { //Menú de usuarios
        String arreglo[]=new String[5];
        int Opcion=0;
         do{
            System.out.println(" 1. Ingresar Usuarios \n"
                    + " 2. Mostrar Usuarios ascendente \n "
                    + "3. Mostrar Usuarios descendente\n "
                    + "4. Menú principal \n ");
            
           Scanner S = new Scanner(System.in);
           Opcion = S.nextInt();  
          

        switch(Opcion){
            case 1: //ingrese Usuarios
             System.out.println("Ingrese primer usuario:");
             arreglo[0]=S.next();
             System.out.println("Ingrese segundo usuario:");
             arreglo[1]=S.next();
             if(arreglo[0].equals(arreglo[1])){
                 System.out.println("El usuario ya existe. Debe ingresar otro usuario: ");
                 arreglo[1]=S.next();
             }
            /* while (arreglo[0].equals(arreglo[1])){
              //   System.out.println("El usuario ya existe. Debe ingresar otro usuario: ");
                // arreglo[1]=S.next();
            */
             System.out.println("Ingrese tercer usuario:");
             arreglo[2]=S.next();
             while (arreglo[0].equals(arreglo[1])||arreglo[1].equals(arreglo[2])){ 
                 System.out.println("El usuario ya existe. Debe ingresar otro usuario: ");
                 arreglo[2]=S.next();
            } 
             System.out.println("Ingrese cuarto usuario:");
             arreglo[3]=S.next();
             while (arreglo[0].equals(arreglo[1])||arreglo[1].equals(arreglo[2])||arreglo[2].equals(arreglo[3])){ 
                 System.out.println("El usuario ya existe. Debe ingresar otro usuario: ");
                 arreglo[3]=S.next();
            }
             System.out.println("Ingrese quinto usuario:");
             arreglo[4]=S.next();
             while (arreglo[0].equals(arreglo[1])||arreglo[1].equals(arreglo[2])||arreglo[2].equals(arreglo[3])||arreglo[3].equals(arreglo[4])){ 
                 System.out.println("El usuario ya existe. Debe ingresar otro usuario");
                 arreglo[4]=S.next(); 
             }
            break;
            case 2: 
                //mostrar el listado de usuarios en el orden contrario al que fueron ingresados.
               System.out.println("Lista usuarios en el orden contrario al que fueron ingresados \n");
                            int orden=4;
                            while(orden>=0){
                                System.out.println("Usuario No. "+ orden + "   "+arreglo[orden] );
                                orden--;
                            }

            break;
            case 3:
                 System.out.println("Lista de usuarios en el orden que fueron ingresados \n");
                            for(int l=0;l<=4;l++){
                                System.out.println("Usuario No. "+ l + "   "+arreglo[l] );
                            }
            break;
            case 4: menuprincipal();
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
           
           Scanner S = new Scanner(System.in);
           Opcion = S.nextInt();
           
            switch(Opcion){
            case 1: System.out.println("HOLA");
            break;
            case 2: System.out.println("HOLsssA");
            break;
            case 3: menuprincipal();
            break;
            default: System.out.println("Por favor elije una opción del 1 al 3 \n");
        }
           
        }while (Opcion !=3);
    }
    public static void MayorMenor(){
      int Opcion=0, A, B,C;
      do{
          System.out.println("1. Ingresar números \n"
                    + "2. Mostrar ordenados \n"
                    + "3. Menú principal");
          
          Scanner S=new Scanner (System.in);
          Opcion=S.nextInt();
          
          switch(Opcion){
              case 1: 
                  System.out.println("Ingrese el primer número");
                  A=S.nextInt();
                  System.out.println("Ingrese el segundo número");
                  B=S.nextInt();
                  System.out.println("Ingrese el tercer número");
                  C=S.nextInt();        
                  
                  if(A>B&&B>C){
                      System.out.println("El orden de los numeros es: \n"+ A +"\n"+B+"\n"+C);
                  }
                  break;
         
              case 2:
                  System.out.println("");
              break;
              case 3: menuprincipal();
              break;
              default: System.out.println("Por favor elije una opción del 1 al 3");
          }
      } while (Opcion !=3);
    }
    public static void Promedio(){
 
        }
    }


