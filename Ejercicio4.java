public class Ejercicio4 {
    public static void main(String[] args){
        int numero=0;
        for(int numeros=1;numeros<=20;numeros++){
            numero=(int)(Math.round(Math.random()*10));
            if(numeros<20)System.out.print(numero+" , ");
            else System.out.print(numero);
        }
    }
}
