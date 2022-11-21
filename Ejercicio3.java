public class Ejercicio3 {
    public static void main(String[] args){
        int carta =(int)(Math.round(Math.random()*10));
        String valor ="";
        int numPalo =(int)(Math.round(Math.random()*4));
        String Palo="";
        switch(carta){
            case  1:
           valor="As";
           break;
           case 8: 
           valor="Sota";
           break;
           case 9:
           valor="Caballo";
           break;
           case 10:
           valor="Rey";
           break;
           default:
           valor = String.valueOf(carta); 
        }
        switch(numPalo){
            case 1:
            Palo ="Oros";
            break;
            case 2:
            Palo = "Bastos";
            break;
            case 3 : 
            Palo = "Espadas";
            break;
            case 4 :
            Palo = "Copas";
            break;
            default:
            Palo = "Oros";
        }
        System.out.print("Salió el "+valor+" de "+Palo);
    }
}
