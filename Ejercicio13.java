public class Ejercicio13 {
    public static void main(String[] args){
        int dado1=0;
        int dado2=1;
        int tiradas =1;
        while(dado1!=dado2){
            System.out.printf("\nTirada %-5s :\n\n",tiradas);
            dado1=(int)(Math.random()*5+1);
            System.out.print("Dado 1 = "+dado1+"\t");
            dado2=(int)(Math.random()*5+1);
            System.out.print("Dado 2 = "+dado2+"\n");
            tiradas++;
        }
    } 
    
}
