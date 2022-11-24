import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean etapa2 = false;
        System.out.print("Introduzca la cantidad de dinero que desea apostar: ");
        int dinero = sc.nextInt();
        int dado1 =(int)(Math.random()*6+1);
        int dado2 =(int)(Math.random()*6+1);
        int aux=0;
        System.out.println("\nEl dado 1 salió :"+dado1);
        System.out.println("\nEl dado 2 salió :"+dado2);
        if(dado1+dado2==11||dado1+dado2==7){
            dinero*=2;
            System.out.println("¡Ha ganado!");
            System.out.println("Usted ganó: "+dinero/2);
        }
        else if(dado1+dado2==2||dado1+dado2==3||dado1+dado2==12){
            dinero=0;
            System.out.println("Ha perdido...");
        }
        else{
            etapa2=true;
            System.out.print("La suma de sus dados no es ni 2 ,ni 3,ni 12,ni 11, ni 7\nAhora tendra que seguir tirando los dados hasta que salga el último número que sacó con los dados\n si sale la suma de los dados 7 Usted pierde\n");
            aux=dado1+dado2;
        }
        while(etapa2){
            dado1 =(int)(Math.random()*6+1);
            dado2 =(int)(Math.random()*6+1);
            System.out.println("\nEl dado 1 salió :"+dado1);
            System.out.println("\nEl dado 2 salió :"+dado2);
            if(dado1+dado2==aux){
                dinero*=2;
                System.out.println("¡Ha ganado!");
                System.out.println("Usted ganó: "+dinero/2);
                etapa2=false;
            }
            else if(dado1+dado2==7){
                dinero=0;
                System.out.println("Ha perdido...");
                etapa2=false;
            }
        }
        System.out.print("Acabó con :"+dinero+" euros");
        sc.close();
    }
}
