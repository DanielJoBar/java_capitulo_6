public class Ejercicio18 {
    public static void main(String[] args){
        int colores  = (int)(Math.random()*6+1);
        String color1="",color2="",color3="";
        int aux=0,aux2=0;
        int aux3=0;
    for(int i=1;i<=3;i++){
        switch(colores){
            case 1:
            if(i==1)
            color1="rojo";
            else if(i==2)
            color2="rojo";
            else
            color3="rojo";
            break;
            case 2:
            if(i==1)
            color1="azul";
            else if(i==2)
            color2="azul";
            else
            color3="azul";
            break;
            case 3:
            if(i==1)
            color1="verde";
            else if(i==2)
            color2="verde";
            else
            color3="verde";
            break;
            case 4:
            if(i==1)
            color1="amarillo";
            else if(i==2)
            color2="amarillo";
            else
            color3="amarillo";
            break;
            case 5:
            if(i==1)
            color1="violeta";
            else if(i==2)
            color2="violeta";
            else
            color3="violeta";
            break;
            case 6:
            if(i==1)
            color1="naranja";
            else if(i==2)
            color2="naranja";
            else
            color3="naranja";
            break;
        }
        if(i==1)
        aux=colores;
        else if(i==2)
        aux2=colores;
        else 
        aux3=colores;
        while(colores==aux||colores==aux2||colores==aux3)
        colores=(int)(Math.random()*6+1);
    }
    System.out.print(" La habitación 1 será de color "+color1+"\n La habitación 2 será de color "+color2+"\n La habitación 3 será de color "+color3);
    }
}
