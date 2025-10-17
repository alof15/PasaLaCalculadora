import java.util.Objects;
import java.util.Scanner;

public class PasaLaCalculadora {
    public static void main(String[] args) {
        //objetivo
        int numMaximo;
        int numTotal = 0;
        int numeroInsertado = 0;
        int numUltimo = 0;
        int numeroJugadores ;
        String jugador1="";
        String jugador2="";
        String jugador3="";

        Scanner sc = new Scanner(System.in);
        //
        System.out.println("ingrese el numero de jugadores:");
        numeroJugadores= sc.nextInt();
        if(numeroJugadores==2){
            System.out.println("ingrese su nombre jugador 1");
            jugador1=sc.next();
            System.out.println("ingrese su nombre jugador 2");
            jugador2=sc.next();
        }
        if (numeroJugadores==3){
            System.out.println("ingrese su nombre jugador 1");
            jugador1=sc.next();
            System.out.println("ingrese su nombre jugador 2");
            jugador2=sc.next();
            System.out.println("ingrese su nombre jugador 3");
            jugador3=sc.next();
        }
        String[]jugadores={jugador1, jugador2, jugador3};
        while (true) {
            numMaximo = numeroObjetivo(sc);
           // numTotal = primerTurno(numeroInsertado, numTotal, sc, jugador1);
           // numUltimo = numTotal;

            while (true) {

                for (int i = 0; i < numeroJugadores; i++) {
                    System.out.println("\u001B[35m" + "Introduce un numero " + jugadores[i] +": ");
                    numeroInsertado = sc.nextInt();
                    while (validacion(numeroInsertado,numUltimo) == 1) {
                        System.out.println("numero incorrecto, vuelva a insertar un numero "+ jugadores[i]);
                        numeroInsertado = sc.nextInt();
                    }

                        numTotal += numeroInsertado;
                        numUltimo = numeroInsertado;
                    System.out.println(numTotal);

                    if (numTotal >= numMaximo) {
                        System.out.println("Perdedor jugador " +  jugadores[i]);
                        break;
                    }
                }
                if (numTotal >= numMaximo) {
                    break;
                }
            }


            //jugar otra partida
            System.out.println("Si desea continuar escriba `Y´ si no pulse cualquier tecla.");
            Scanner cr = new Scanner(System.in);
            String continuar = cr.nextLine();

            if (!Objects.equals(continuar, "Y")) {
                System.out.println("Saliendo del sistema");
                break;

            } else {
                System.out.println("Continuemos");
            }
        }

    }

    /**
     * El primer turno no valida como el resto por eso está separado.
     *
     * @param numeroInsertado
     * @param numUltimo
     * @param sc
     * @return
     */
    public static int primerTurno(int numeroInsertado, int numUltimo, Scanner sc, String jugador1) {

        System.out.println("\u001B[34m" + "Introduce el primer numero "+ jugador1 + " :");
        numeroInsertado = sc.nextInt();

        if (numeroInsertado > 0 & numeroInsertado < 10) {
            numUltimo = numeroInsertado;
        }
        return numUltimo;
    }

    /**
     * pedimos al usuario el numero objetivo
     *
     * @param sc
     * @return numMaximo
     */
    //peticion al usuario del numero objetivo
    private static int numeroObjetivo(Scanner sc) {
        int numMaximo;
        while (true) {

            System.out.println("\u001B[32m" + "Introduce el numero maximo este debe ser superior a 10 e inferior a 99:");
            numMaximo = sc.nextInt();

            if (numMaximo == -1) {
                numMaximo = (int) Math.round(Math.random() * 89) + 10;
                break;
            } else if (numMaximo > 10 & numMaximo < 99) {
                numMaximo = numMaximo;
                break;
            } else {
                System.out.println("\u001B[31m" + "Que sea correcto ;}");
            }

        }
        return numMaximo;
    }


    //restricciones

    /**
     * El numero insertado no puede ser igual al anterior
     * El numero insertado tiene que estar en la misma fila o columna que el numero anterior
     *
     * @param numeroInsertado

     * @param numUltimo
     * @return 0 si numeroInsertado es valido
     * @return 1 si numeroInsertado no es valido
     */
    public static int validacion(int numeroInsertado, int numUltimo) {

        if (numeroInsertado != numUltimo) {
            switch (numUltimo) {

                case 1: {
                    if (numeroInsertado == 2 | numeroInsertado == 3 | numeroInsertado == 4 | numeroInsertado == 7) {
                        System.out.println("El numero insertado cumple las normas");
                        return 0;
                    }
                    break;

                }
                case 2: {
                    if (numeroInsertado == 1 | numeroInsertado == 3 | numeroInsertado == 5 | numeroInsertado == 8) {
                        System.out.println("El numero insertado cumple las normas");
                        return 0;
                    }
                    break;
                }
                case 3: {
                    if (numeroInsertado == 1 | numeroInsertado == 2 | numeroInsertado == 6 | numeroInsertado == 9) {
                        System.out.println("El numero insertado cumple las normas");
                        return 0;
                    }
                    break;
                }
                case 4: {
                    if (numeroInsertado == 1 | numeroInsertado == 5 | numeroInsertado == 6 | numeroInsertado == 7) {
                        System.out.println("El numero insertado cumple las normas");
                        return 0;
                    }
                    break;
                }
                case 5: {
                    if (numeroInsertado == 2 | numeroInsertado == 4 | numeroInsertado == 6 | numeroInsertado == 8) {
                        System.out.println("El numero insertado cumple las normas");
                        return 0;
                    }
                    break;
                }
                case 6: {
                    if (numeroInsertado == 3 | numeroInsertado == 4 | numeroInsertado == 5 | numeroInsertado == 9) {
                        System.out.println("El numero insertado cumple las normas");
                        return 0;
                    }
                    break;
                }
                case 7: {
                    if (numeroInsertado == 1 | numeroInsertado == 4 | numeroInsertado == 8 | numeroInsertado == 9) {
                        System.out.println("El numero insertado cumple las normas");
                        return 0;
                    }
                    break;
                }
                case 8: {
                    if (numeroInsertado == 2 | numeroInsertado == 5 | numeroInsertado == 7 | numeroInsertado == 9) {
                        System.out.println("El numero insertado cumple las normas");
                        return 0;
                    }
                    break;
                }
                case 9: {
                    if (numeroInsertado == 3 | numeroInsertado == 6 | numeroInsertado == 7 | numeroInsertado == 8) {
                        System.out.println("El numero insertado cumple las normas");
                        return 0;
                    }
                    break;
                }
                case 0: {
                    if (numeroInsertado > 0 & numeroInsertado < 10) {
                        System.out.println("El numero insertado cumple las normas");
                        return 0;
                    }
                    break;
                }

            }
        }

        return 1;


    }
}

