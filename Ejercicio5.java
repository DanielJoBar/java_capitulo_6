public class Ejercicio5 {
    public static void main(String[] args){
        int maximo = 0;
        int minimo = 200;
        int media = 0;
        int suma = 0;
        int numero;
        for(int i = 1; i<50;i++){
            numero =(int)(Math.random()*100+100);
            if(numero>maximo)maximo=numero;
            if(numero<minimo)minimo=numero;
            System.out.print(numero+"\t");
            suma = suma +numero;
            media++;
        }   
        System.out.print("\n");
        System.out.print("La media de los números es de : "+suma/media+"\n");
        System.out.print("El número máximo dado fue: "+maximo+"\n");
        System.out.print("El número mínimo dado fue: "+minimo+"\n");
    }
}
