import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el número que está pensando para adivinar:");
        int numero = sc.nextInt();
        int oportunidades = 5;
        boolean acertado = false;
        int aux1=100,aux2=0;
        String pregunta ="";
        int aleatorio =(int)((Math.random()*(aux1-aux2+1))+aux2);
        while(oportunidades>=0){
            if(aleatorio==numero){
                System.out.print("Tu número tiene que ser "+numero);
                acertado=true;
                oportunidades =-1;
            }
            else{
                oportunidades--;
                System.out.println("¿El número que estas pensando es menor o mayor a "+aleatorio+" ?");
                pregunta =System.console().readLine();
                    if(pregunta.equals("mayor")){
                    aux2=aleatorio+1;    
                }
                    else{
                        aux1=aleatorio-1;
                    }
                    aleatorio =(int)((Math.random()*(aux1-aux2))+aux2);
                
            }
        }
        if(!acertado)
        System.out.print("Usted gana , no he podido adivinarlo en 5 intentos");
        sc.close();
    }
}
