public class Ejercicio11 {
    public static void main(String[] args){
        int suficiente=0,Bien=0,suspenso=0,notable=0,sobresaliente=0;
        int aleatorio = 0;
        for(int i=1;i<=20;i++){
            aleatorio=(int)(Math.random()*11);
            switch(aleatorio) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                System.out.printf(".%-2s Suspenso\n",i);
                suspenso++;
                break;
                case 5:
                System.out.printf(".%-2s Suficiente\n",i);
                suficiente++;
                break;
                case 6:
                System.out.printf(".%-2s Bien\n",i);
                Bien++;
                break;
                case 7:
                case 8:
                System.out.printf(".%-2s Notable\n",i);
                notable++;
                break;
                case 9:
                case 10:
                System.out.printf(".%-2s Sobresaliente\n",i);
                sobresaliente++;
                break;
            }
        }
        System.out.print("En total hubieron "+suspenso+" Suspenso/s \n"+suficiente+ " Suficiente/s\n"+Bien+" Bien\n"+notable+" Notable/s\n"+sobresaliente+" Sobresaliente/s");
    }
}
