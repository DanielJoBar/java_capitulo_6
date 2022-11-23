import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Primavera\n2. Verano\n3. Otoño\n4. Invierno ");
        System.out.print("Seleccione la estación del año(1-4): ");
        int aleatorio =0,aleatorio2=0;
        int estacion = sc.nextInt();
        int nublado =0;
        int soleado=0;
        switch(estacion){
            case 1:
             aleatorio =(int)(Math.random()*16+15);
             aleatorio2 =(int)(Math.random()*21+25);
             nublado=(int)(Math.random()*41);
             soleado=(int)(Math.random()*61);
            break;
            case 2:
             aleatorio =(int)(Math.random()*21+25);
             aleatorio2 =(int)(Math.random()*21+25);
             nublado=(int)(Math.random()*21);
             soleado=(int)(Math.random()*81);
            break;
            case 3 :
             aleatorio =(int)(Math.random()*11+20);
             aleatorio2 =(int)(Math.random()*21+25);
             nublado=(int)(Math.random()*61);
             soleado=(int)(Math.random()*41);
            break;
            case 4:
             aleatorio =(int)(Math.random()*26);
             aleatorio2 =(int)(Math.random()*21+25);
             nublado=(int)(Math.random()*81);
             soleado=(int)(Math.random()*21);
            break;
        }
        String tiempo ="";
        if(nublado>soleado)
        tiempo="nublado";
        else
        tiempo="soleado";
        int minima=0;
        int maxima=0;
        if(aleatorio>aleatorio2){
        minima=aleatorio2;
        maxima=aleatorio;
        }
        else{
            minima=aleatorio;
            maxima=aleatorio2;
        }
        System.out.println("Previsión del tiempo para mañana");
        System.out.print("--------------------------------\n");
        System.out.println("Temperatura mínima: "+minima);
        System.out.println("Temperatura máxima: "+maxima);
        System.out.print(tiempo);
        sc.close();
    }
}
