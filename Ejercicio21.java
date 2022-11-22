public class Ejercicio21 {
    public static void main(String[] args){
        String moneda = "";
        String tipo ="";
        String aleatorio="";
        for(int i=1;i<=5;i++){
            tipo = String.valueOf((int)(Math.random()*8+1));
            switch(tipo){
                case "1":
                    moneda="1 céntimo";
                break;
                case "2":
                    moneda="2 céntimos";
                break;
                case "3":
                    moneda="5 céntimos";
                break;
                case "4":
                    moneda="10 céntimos";
                break;
                case "5":
                    moneda="20 céntimos";
                break;
                case "6":
                    moneda="50 céntimos";
                break;
                case "7":
                    moneda="1 euro";
                break;
                case "8":
                    moneda="2 euros";
                break;
            }  
            aleatorio=""+(int)(Math.random()*2+1);
            switch(aleatorio){
                case "1":
                tipo = "cara";
                break;
                case "2":
                tipo = "cruz";
                break;
            }
            System.out.print(moneda+" - "+tipo+"\n");
        }
        
    }
}
