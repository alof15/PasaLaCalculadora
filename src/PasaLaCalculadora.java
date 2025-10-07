import java.util.Scanner;

public class PasaLaCalculadora {
    public static void main(String[] args) {
        //objetivo
        int numMaximo;
        int numTotal = 0;
        int numeroInsertado;
        int numUltimo;
        int numPenultimo;
        Scanner sc = new Scanner(System.in);

        numMaximo = numeroObjetivo(sc);
        //partida


        //primer turno
        while (true){
            System.out.println("\u001B[34m"+"Introduce el primer numero jugador 1: ");
            numeroInsertado = sc.nextInt();
            numUltimo=numeroInsertado;

            if (numeroInsertado > 0 & numeroInsertado < 10){
                numTotal+=numeroInsertado;
                System.out.println(numTotal);
                restricciones();
                break;
            }
        }

        //resto juego


        while (numMaximo >= numTotal) {

            //turno jugador 2

            System.out.println("\u001B[35m"+"Introduce un numero jugador 2: ");
             numeroInsertado = sc.nextInt();


            if (numeroInsertado>0&numeroInsertado<10){
                numTotal+=numeroInsertado;
                System.out.println(numTotal);

                if (numTotal>=numMaximo){
                    System.out.println("Perdedor jugador 2 ;)");
                    break;
                }

            } else {
                System.out.println("numero incorrecto, pierdes turno");
                System.out.println(numTotal);

            }
            numPenultimo=numUltimo;
            numUltimo=numPenultimo;

            // turno jugador 1

            System.out.println("\u001B[34m"+"Introduce un numero jugador 1: ");
            numeroInsertado = sc.nextInt();

            if (numeroInsertado>0&numeroInsertado<10){
                numTotal+=numeroInsertado;
                System.out.println(numTotal);
                if (numTotal>=numMaximo){
                    System.out.println("Perdedor jugador 1 ;)");
                    break;
                }

            } else {
                System.out.println("numero incorrecto, pierdes turno");
                System.out.println(numTotal);

            }
            numPenultimo=numUltimo;
            numUltimo=numPenultimo;

        }
    }

    private static int numeroObjetivo(Scanner sc) {
        int numMaximo;
        while (true) {

            System.out.println("\u001B[32m"+"Introduce el numero maximo este debe ser superior a 10 e inferior a 99:");
            numMaximo = sc.nextInt();

            if (numMaximo == -1) {
                numMaximo = (int) Math.round(Math.random() * 89) + 10;
                break;
            } else if (numMaximo>10 & numMaximo <99) {
                numMaximo=numMaximo;
                break;
            }else {
                System.out.println("\u001B[31m"+"Que sea correcto ;}");
            }

        }
        return numMaximo;
    }

    //restricciones
    private static void restricciones() {
        if (jugador2==jugador1){
            System.out.println();
        }
    }
}
