import java.util.Scanner;

public class PasaLaCalculadora {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el numero maximo este debe ser superior a 10 e inferior a 99:");
        int numMaximo=sc.nextInt();
        int numTotal=0;
        while(numMaximo>=numTotal){
            System.out.println("Introduce un numero: ");
            int jugador1= sc.nextInt();
            if (jugador1<  0 & jugador1 !=numMaximo){
                jugador1 = (int) Math.round(Math.random()*89)+10;
                numTotal+=jugador1;
            }
            else if (jugador1> 0 & jugador1 !=numMaximo){
                numTotal+=jugador1;
            }
            else {

            }


            System.out.println("Introduce un numero: ");
            int jugador2= sc.nextInt();
            if (jugador2>  0){
                jugador2 = (int) Math.round(Math.random()*99);
                numTotal+=jugador2;
            }
            else {
                numTotal+=jugador2;
            }


        }
    }
}
