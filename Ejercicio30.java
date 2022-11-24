import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pecera(minimo4): \n");
        int altura = sc.nextInt();
        System.out.print("Introduzca el ancho de la pecera(minimo 4): \n");
        int ancho = sc.nextInt();
        int aleatorioAncho=(int)(Math.random()*ancho+1);
        int aleatorioAlto=(int)(Math.random()*altura+1);
        int aleatorioAncho2=(int)(Math.random()*ancho+1);
        int aleatorioAlto2=(int)(Math.random()*altura+1);
        int aleatorioAncho3=(int)(Math.random()*ancho+1);
        int aleatorioAlto3=(int)(Math.random()*altura+1);
        //Figura 1
        while(aleatorioAlto<=1||aleatorioAlto>=altura||aleatorioAlto==aleatorioAlto2||aleatorioAlto==aleatorioAlto3)
        aleatorioAlto=(int)(Math.random()*altura+1);
        while(aleatorioAncho<=1||aleatorioAncho>=ancho||aleatorioAncho==aleatorioAncho2||aleatorioAncho==aleatorioAncho3)
        aleatorioAncho=(int)(Math.random()*ancho+1);
        //Figura 2
        while(aleatorioAlto2<=1||aleatorioAlto2>=altura||aleatorioAlto2==aleatorioAlto3)
        aleatorioAlto2=(int)(Math.random()*altura+1);
        while(aleatorioAncho2<=1||aleatorioAncho2>=ancho||aleatorioAncho2==aleatorioAncho3)
        aleatorioAncho2=(int)(Math.random()*ancho+1);
        //Figura 3
        while(aleatorioAlto3<=1||aleatorioAlto3>=altura)
        aleatorioAlto3=(int)(Math.random()*altura+1);
        while(aleatorioAncho3<=1||aleatorioAncho3>=ancho)
        aleatorioAncho3=(int)(Math.random()*ancho+1);

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
                    else if(i==aleatorioAlto2&&j==aleatorioAncho2){
                        System.out.print("@");                        
                    }
                    else if(i==aleatorioAlto3&&j==aleatorioAncho3){
                        System.out.print("$");                        
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
