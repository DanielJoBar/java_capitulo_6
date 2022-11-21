public class Ejercicio2 {
    public static void main(String[] args){
        int numero =(int)(Math.round(Math.random()*12));
        int palo = (int)(Math.random()*4);
        String total = "";
        if(palo==0||palo==1) total="picas";
        else if(palo==2)total="corazones";
        else if(palo==3)total="diamantes";
        else total ="tréboles";
        if(numero>1&&numero<11)System.out.print("Salió el "+numero+" de "+total);
        else if(numero==1)System.out.print("Salió el As de "+total);
        else if(numero==11)System.out.print("Salió la J de "+total);
        else if(numero==12)System.out.print("Salió la Q de "+total);
        else System.out.print("Salió la K de "+total);
    }
}
