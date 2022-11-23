import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba la longitud de la serpiente: \n");
        int longitud = sc.nextInt();
        System.out.println("            @"); 
        int aleatorio =(int)(Math.random()*2+12);
        for(int i =1 ; i<=longitud;i++){
            for(int espacios =1 ;espacios<=aleatorio;espacios++){
                System.out.print(" ");
            }
            System.out.print("*");
            aleatorio =(int)(Math.random()*2+12);
            System.out.println();
        }
        sc.close();
    }
}
