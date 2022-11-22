public class Ejercicio8 {
    public static void main(String[] args){
int aleatorio =0;
int columnas=0;
for(int i =1;i<=15;i++){
    System.out.print(i+".\t");
    if(i<15){
        columnas=0;}
    else{columnas=2;}
    while (columnas<3){
    aleatorio=(int)(Math.random()*7);
    switch(aleatorio){
        case 1:
        case 2:
        case 3:
        System.out.print("|1  |\t");
        columnas++;
        break;
        case 4:
        case 5:
        System.out.print("| X |\t");
        columnas++;
        break;
        case 6:
        System.out.print("|  2|\t");
        columnas++;
    }
    }
    System.out.println();
}   
}
}
