import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pecera: \n");
        int altura = sc.nextInt();
        System.out.print("Introduzca el ancho de la pecera: \n");
        int ancho = sc.nextInt();
        int aleatorioAncho=(int)(Math.random()*ancho+1);
        int aleatorioAlto=(int)(Math.random()*altura+1);
        while((aleatorioAlto<=1||aleatorioAlto>=altura))
        aleatorioAlto=(int)(Math.random()*altura+1);
        while((aleatorioAncho<=1||aleatorioAncho>=ancho))
        aleatorioAncho=(int)(Math.random()*ancho+1);
        for(int i=1;i<=altura;i++){
            if(i==1||i==altura){
                for(int j =1;j<=ancho;j++)
                System.out.print("*");
                System.out.println();
            }
           else{
            for(int j =1;j<=ancho;j++){
                if(j!=1&&j!=ancho){
                    if(i==aleatorioAlto&&j==aleatorioAncho){
                        System.out.print("&");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
           } 
        }

        sc.close();
    }
}
