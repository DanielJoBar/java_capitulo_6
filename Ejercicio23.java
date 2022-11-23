public class Ejercicio23 {
    public static void main(String[] args){
        int aleatorio = (int)(Math.random()*6);
        for(int i = 1;i<=6;i++){
        switch(aleatorio){
            case 0 :
            System.out.print("7\t");
            break;
            case 1 :
            System.out.print("8\t");
            break;
            case 2 :
            System.out.print("J\t");
            break;
            case 3 :
            System.out.print("Q\t");
            break;
            case 4 :
            System.out.print("K\t");
            break;
            case 5 :
            System.out.print("As\t");
            break;
        }
    }
    }
}
