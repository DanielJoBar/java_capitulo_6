import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, indique la capacidad de la cuba en litros:\n");
        int capacidad=sc.nextInt();
        int agua = (int)(Math.random()*capacidad+1);
        System.out.println();
        for(int i = 0;i<capacidad;i++){
            if(i==capacidad-1)
            System.out.print("******");
            else{
                for(int j=1;j<=6;j++){
                    if(j==1||j==6)
                        System.out.print("*");
                    else{
                        if(i<agua)
                        System.out.print(" ");
                        else
                        System.out.print("=");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
