import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la anchura de la tableta: ");
        int ancho =sc.nextInt();
        System.out.print("Introduzca la altura de la tableta: ");
        int altura =sc.nextInt();
        int aleatorio = (int)(Math.random()*ancho+1);
        int aleatorio2 = (int)(Math.random()*altura+1);
        for(int i =1;i<=altura;i++){
            for(int j =1;j<=ancho;j++){
                System.out.print("*");
                if(j==aleatorio&&i==aleatorio2){
                    j++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
