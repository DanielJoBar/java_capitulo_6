public class Ejercicio12 {
    public static void main(String[] args){
        int lineas =0;
        System.out.print("\033[32m");
        while(lineas<=3000){
        for(int i =1;i<=50;i++)
       System.out.print((char)(Math.random()*94+32)); 
        System.out.println();
        lineas++;
    }
    }
}
