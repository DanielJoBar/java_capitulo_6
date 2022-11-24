import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la longitud del sendero en metros: ");
        int metros = sc.nextInt();
        int aleatorio=0;
        int posicionSimbolo=0;
        int simbolo=0;
        int posicion =0;
        for(int i =0;i<metros;i++){
            posicion=(int)(Math.random()*3+9);
                for(int k=1;k<=posicion;k++){
                    System.out.print(" ");
                }
            aleatorio=(int)(Math.random()*2);
            switch(aleatorio){
                case 0:
                posicionSimbolo=-1;
                break;
                case 1:
                posicionSimbolo=(int)(Math.random()*4+1);
                break;
            }
            System.out.print("|");
                for(int j=1;j<=4;j++){
                    System.out.print(" ");
                    if(j==posicionSimbolo){
                        simbolo=(int)(Math.random()*2);
                        switch(simbolo){
                            case 0:
                            System.out.print("O");
                            break;
                            case 1:
                            System.out.print("*");
                            break;
                        }
                        j++;
                    }
                }
            System.out.print("|");
            System.out.println();
        }
        sc.close();
    }
}
