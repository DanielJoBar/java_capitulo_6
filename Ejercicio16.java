public class Ejercicio16 {
    public static void main(String[] args){
        int caracter =(int)(Math.random()*5);
        String tirada1 ="",tirada2="",tirada3="";
        for(int i=1;i<=3;i++){
            switch(caracter){
                case 0:
                System.out.print("corazón ");
                    if(i==1)
                        tirada1="corazón";
                    else if(i==2)
                        tirada2="corazón";
                    else
                        tirada3="corazón";
                break;
                case 1:
                System.out.print("diamante ");
                    if(i==1)
                        tirada1="diamante";
                    else if(i==2)
                        tirada2="diamante";
                    else
                        tirada3="diamante";
                break;
                case 2:
                System.out.print("herradura ");
                    if(i==1)
                        tirada1="herradura";
                     else if(i==2)
                        tirada2="herradura";
                    else
                        tirada3="herradura";
                break;
                case 3:
                System.out.print("camapana ");
                    if(i==1)
                        tirada1="campana";
                    else if(i==2)
                        tirada2="campana";
                    else
                        tirada3="campana";
                break;
                case 4:
                System.out.print("limón ");
                    if(i==1)
                        tirada1="limón";
                    else if(i==2)
                        tirada2="limón";
                    else
                        tirada3="limón";
                break;
            }
            caracter =(int)(Math.random()*5);
        }
        System.out.println();
        if(tirada1==tirada2&&tirada2==tirada3)
        System.out.print("Enhorabuena, ha ganado 10 monedas");
        else if(tirada1!=tirada2&&tirada1!=tirada3&&tirada2!=tirada3)
        System.out.print("Lo siento, ha perdido");
        else
        System.out.print("Bien, ha recuperado su moneda");
        
    }
}
