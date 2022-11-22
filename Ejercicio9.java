public class Ejercicio9 {
    public static void main(String[] args) {
        int cont=0;
        boolean encontrado =false;
        long aleatorio =0;
        while(!encontrado){
            aleatorio = (long)(Math.random()*101);
            if(aleatorio%2==0){
                cont++;
                if(aleatorio==24){
                    encontrado=true;
                }
            }
        }
        System.out.print("Se han generado "+cont+" números hasta encontrar el 24");
    }
}
