public class Ejercicio10 {
    public static void main(String[]args){
        int caracter =(int)(Math.random()*6);
        int fila =(int)((Math.random()*39)+1);
        for(int i=1;i<=fila;i++){
            switch(caracter){
                case 0:
                System.out.print(". ");
                break;
                case 1:
                System.out.print("@ ");
                break;
                case 2:
                System.out.print("* ");
                break;
                case 3:
                System.out.print("- ");
                break;
                case 4:
                System.out.print("= ");
                break;
                case 5:
                System.out.print("| ");
                break;
            }
        }
    }
}
