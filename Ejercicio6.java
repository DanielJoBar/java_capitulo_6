import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        int oportunidades =5;
        int numeroIntroduzido=0;
        boolean acertado = false;
        int numeroAleatorio =(int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        while(oportunidades>0){
            System.out.print("\n Introduzca un número entre 0 y 100: ");
            numeroIntroduzido =sc.nextInt();
            if(numeroIntroduzido==numeroAleatorio){
                System.out.print("\n¡Felicidades, has acertado el número !");
                acertado = true;
            }
            else if(numeroIntroduzido>numeroAleatorio){System.out.print("\n El número aleatorio es menor al introducido \n");
            oportunidades--;
        }
            else{
                System.out.print("\n El número aleatorio es mayor al introducido \n");
            oportunidades--;
            }
        }
        if(!acertado)System.out.print("\n El número aleatorio era: "+numeroAleatorio);
        sc.close();
    }
}
