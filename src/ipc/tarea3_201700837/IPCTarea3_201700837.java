
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
        String arreglo[]=new String[5]; //un array para ingresar los usuarios de tamaño 5
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
             while (arreglo[2].equals(arreglo[0])||arreglo[2].equals(arreglo[1])){ 
                 System.out.println("El usuario ya existe. Debe ingresar otro usuario: ");
                 arreglo[2]=S.next();
            } 
             System.out.println("Ingrese cuarto usuario:");
             arreglo[3]=S.next();
             while (arreglo[3].equals(arreglo[0])||arreglo[3].equals(arreglo[2])||arreglo[3].equals(arreglo[1])){ 
                 System.out.println("El usuario ya existe. Debe ingresar otro usuario: ");
                 arreglo[3]=S.next();
            }
             System.out.println("Ingrese quinto usuario:");
             arreglo[4]=S.next();
             while (arreglo[4].equals(arreglo[0])||arreglo[4].equals(arreglo[1])||arreglo[4].equals(arreglo[2])||arreglo[4].equals(arreglo[3])){ 
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
                // No pude hacer que empiece desde el 1 :/
            break;
            case 4: menuprincipal(); 
            break;
            default: System.out.println("Por favor elije una opción del 1 al 4 \n");
        } } while (Opcion != 4);
    }
    public static void Contador(){ //Menú de contador de dígitos
        int Opcion=0,cont, N=0;
        
        do{
            System.out.println("1. Ingresar número \n"
                    + "2. Mostrar número de dígitos \n"
                    + "3. Menú principal");
           
           Scanner S = new Scanner(System.in);
           Opcion = S.nextInt();
           
            switch(Opcion){
            case 1: //Se pide el numero y se guarda en una variable
                System.out.println("Ingrese un número entre 0 y 100000:");
                N=S.nextInt();
                
                if(N>0 && N<=1000000){
                    System.out.println("Número registrado");
                }else{
                    System.out.println("El número no esta el rango de 0 y 1000000");
                    N=0;
                    N=S.nextInt();
                }
            break;
            case 2: //imprime la cantidad de digitos
                cont=0;
                while(N!=0){ //mientras que a n le quede cifras
                    N=N/10; //le quitamos el ultimo digito
                    cont++; //sumar 1 al contador de cifras
                }
                System.out.println("El número tiene " + cont + " cifras \n");
            break;
            case 3: menuprincipal();
            break;
            default: System.out.println("Por favor elije una opción del 1 al 3 \n");
        }
           
        }while (Opcion !=3);
    }
    public static void MayorMenor(){
      int Opcion=0;
      int A=0;
      int B=0;
      int C=0;
      
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
              break;
              case 2:
                  if(A>=B && A>=C && B>=C){
                      System.out.println("El orden de los números es \n: ");
                      System.out.println("El primero es: "+ A);
                      System.out.println("El segundo es: "+ B);
                      System.out.println("El tercero es: "+ C);
                  }else if(A>=B && A>=C && C>=B){
                      System.out.println("El orden de los números es \n: ");
                      System.out.println("El primero es: "+ A);
                      System.out.println("El segundo es: "+ C);
                      System.out.println("El tercero es: "+ B);   
                  }else if(B>=A && B>=C && A>=C){
                      System.out.println("El orden de los números es \n: ");
                      System.out.println("El primero es: "+ B);
                      System.out.println("El segundo es: "+ A);
                      System.out.println("El tercero es: "+ C);   
                  }else if(B>=A && B>=C && C>=A){
                      System.out.println("El orden de los números es \n: ");
                      System.out.println("El primero es: "+ B);
                      System.out.println("El segundo es: "+ C);
                      System.out.println("El tercero es: "+ A);   
                  }else if(C>=A && C>=B && A>=B){
                      System.out.println("El orden de los números es \n: ");
                      System.out.println("El primero es: "+ C);
                      System.out.println("El segundo es: "+ A);
                      System.out.println("El tercero es: "+ B);   
                  }else if(C>=A && C>=B && B>=A){
                      System.out.println("El orden de los números es \n: ");
                      System.out.println("El primero es: "+ C);
                      System.out.println("El segundo es: "+ B);
                      System.out.println("El tercero es: "+ A);   
                  }
             
              break;
              case 3: menuprincipal();
              break;
              default: System.out.println("Por favor elije una opción del 1 al 3");
          }
      } while (Opcion !=3);
    }
    public static void Promedio(){
        int Opcion=0;
        do{
           System.out.println(" 1. Ingresar ID de los estudiantes \n"
                    + " 2. Ingresar nota de cada estudiante \n "
                    + "3. Calcular el promedio \n "
                    + "4. Volver al menú principal \n");
           
           Scanner S = new Scanner(System.in);
           Opcion = S.nextInt();
           int [][] matriz = new int [6][6];
           
        switch(Opcion){
            case 1:
                System.out.println("Ingrese el ID del primer estudiante: ");
                matriz [0][0]=S.nextInt();
                System.out.println("Ingrese el ID del segundo estudiante: ");
                matriz [1][0]=S.nextInt();
                System.out.println("Ingrese el ID del tercer estudiante: ");
                matriz [2][0]=S.nextInt();
            break;
            case 2: Contador();
            break;
            case 3:
            break;
            case 4: menuprincipal();
            break;
            default: System.out.println("Por favor elije una opción del 1 al 4 \n");
        } } while (Opcion != 4); 
        }
    }


