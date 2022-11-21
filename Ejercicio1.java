public class Ejercicio1 {
    public static void main(String[] args){
        int tiradas = 0;
        int suma = 0;
            for(int dado=1;dado<=3;dado++){
            tiradas = (int)(Math.round(Math.random()*6));
            if(tiradas==0)tiradas+=1;
            System.out.println("El dado "+dado+" salió: "+tiradas);
            suma = suma +tiradas;
        }
        System.out.print("La suma de las tiradas anterirores es de : "+suma);
    }
}
