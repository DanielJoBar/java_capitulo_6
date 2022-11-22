public class Ejercicio19 {
    public static void main(String[] args){
        int aleatorio =(int)(Math.random()*101+100);
        int maximo=0,minimo=300;
        int media=0;
        for(int i =1;i<=50;i++){
            aleatorio =(int)(Math.random()*101+100);
            System.out.print(aleatorio+"\n");
            if(aleatorio%2==0&&aleatorio>maximo)
                maximo=aleatorio;
            else if(aleatorio%2!=0&&aleatorio<minimo)
                minimo=aleatorio;
            media=media+aleatorio;
        }
        media=media/50;
        System.out.printf("El máximo de los número pares fue: %2d \n",maximo);
        System.out.printf("El mínimo de los números impares fué: %2d \n",minimo);
        System.out.print("La media de todos los números en total fue: "+media);
    }
}
