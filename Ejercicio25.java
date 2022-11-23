public class Ejercicio25 {
    public static void main(String[] args){
    int aleatorio=0;
    boolean primo = false;
    for(int i=0;i<=100;i++){
        primo=true;
        aleatorio=(int)(Math.random()*191+10);
        for(int j=2;j<=aleatorio/2;j++){
            if(aleatorio%j==0){
                primo=false;
            }
        }
        if(aleatorio%5==0){
            System.out.printf("[%d] ",aleatorio);
        }
        else if(primo){
            System.out.printf("#%d# ",aleatorio);
        }
        else{
            System.out.print(aleatorio+" ");
        }
    }
}
}