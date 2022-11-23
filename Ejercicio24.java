import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo:\n");
        long numero = sc.nextLong();
        long aux1=numero;
        int cont=0;
        while (aux1>0){
            aux1/=10;
            cont++;
        }
        int aleatorio = (int)(Math.random()*cont+1);
        System.out.println((numero / (long)(Math.pow(10, cont - aleatorio))) % 10);
        sc.close();
    }
}
