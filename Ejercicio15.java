public class Ejercicio15 {
    public static void main(String[] args){
          String nota = "";
          int multiplo = (int)(Math.random()*6+1);
          int aux =5;
          for(int i=1;i<=4*multiplo;i++){
            nota = ""+((int)(Math.random()*7+1));
            if(i==1||i%aux==0){
                System.out.print("|  ");
                aux+=4;
            }
            switch(nota){
                case "1":
                nota="do";
                System.out.print(nota+" ");
                break;
                case "2":
                nota="re";
                System.out.print(nota+" ");
                break;
                case "3":
                nota="mi";
                System.out.print(nota+" ");
                break;
                case "4":
                nota="fa";
                System.out.print(nota+" ");
                break;
                case "5":
                nota="sol";
                System.out.print(nota+" ");
                break;
                case "6":
                nota="la";
                System.out.print(nota+" ");
                break;
                case "7":
                nota="si";
                System.out.print(nota+" ");
                break;
            }
            if(i%aux==0||i==4||i==4*multiplo){
                System.out.print("  | ");
            }
             if(i==4*multiplo)
            System.out.print("|");
          }
    }
}
