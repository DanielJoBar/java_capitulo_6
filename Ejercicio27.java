import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Turno del jugador(Introduzca piedra, papel o tijera): ");
        String jugador = System.console().readLine();
        while(jugador!="piedra"&&jugador!="tijeras"&&jugador!="papel"){
            System.out.print("ha introducido un valor no valido introduzcalo de nuevo por favor (Introduzca piedra, papel o tijera): ");
             jugador = System.console().readLine();
        }
        int aleatorio = (int)(Math.random()*3);
        String maquina = "";
        switch(aleatorio){
            case 0:
                maquina="piedra";
            break;
            case 1:
            maquina="papel";
            break;
            case 2:
            maquina="tijeras";
            break;
        }
        System.out.println("Turno del ordenador: "+maquina);
        if(maquina.equals(jugador)){
            System.out.print("Empate");
        }
        else if(jugador.equals("tijeras")&&maquina.equals("papel")||jugador.equals("piedra")&&maquina.equals("tijeras")||jugador.equals("papel")&&maquina.equals("piedra")){
            System.out.print("Gana el jugador");
        }
        else{
            System.out.print("Gana el ordenador");
        }
        sc.close();
    }
}
