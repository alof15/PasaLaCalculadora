import java.util.Scanner;

public class PasaLaCalculadora {
    public static void main(String[] args) {
        //objetivo
        int numMaximo;
        int numTotal = 0;
        int numeroInsertado;
        int numUltimo;
        int numPenultimo = 0;
        Scanner sc = new Scanner(System.in);

        numMaximo = numeroObjetivo(sc);
        //partida
        /**
         *  System.out.println("Escoja numero de jugadores");
         *        while{
         *        if (numJugadore==2){
         *             (normas)
         *             (dosJugadores)
         *                     (quieres jugar otra partida)
         *         }
         *         if (numJugadores==3){
         *             (normas)
         *             (tresJugadores)
         *                     (quieres jugar otra partida)
         *         }
         *         else {
         *             System.out.println("numero jugadores inbalido");
         *             break;
         *         }
         *
         *         }
         */


        //primer turno
        while (true) {
            System.out.println("\u001B[34m" + "Introduce el primer numero jugador 1: ");
            numeroInsertado = sc.nextInt();

            if (numeroInsertado > 0 & numeroInsertado < 10) {
                numTotal += numeroInsertado;
                System.out.println("El total es: " + numTotal);
                numUltimo = numeroInsertado;

                break;
            }
        }

        //resto juego


        while (numMaximo >= numTotal) {

            //turno jugador 2

            System.out.println("\u001B[35m" + "Introduce un numero jugador 2: ");
            numeroInsertado = sc.nextInt();


            if (numeroInsertado > 0 & numeroInsertado < 10) {

                // validacion(numeroInsertado, numPenultimo, numUltimo);
                if (validacion(numeroInsertado, numPenultimo, numUltimo) == 0) {
                    numTotal += numeroInsertado;
                    numPenultimo = numUltimo;
                    numUltimo = numeroInsertado;
                    System.out.println("El total es: " + numTotal);
                }
                System.out.println("el numero anterior es " + numUltimo);

                if (numTotal >= numMaximo) {
                    System.out.println("Perdedor jugador 2 ;)");
                    break;
                }

            } else {
                System.out.println("numero incorrecto, pierdes turno");
                System.out.println("El total es: " + numTotal);
            }


            // turno jugador 1

            System.out.println("\u001B[34m" + "Introduce un numero jugador 1: ");
            numeroInsertado = sc.nextInt();

            if (numeroInsertado > 0 & numeroInsertado < 10) {

                // validacion(numeroInsertado, numPenultimo, numUltimo);
                if (validacion(numeroInsertado, numPenultimo, numUltimo) == 0) {
                    numTotal += numeroInsertado;
                    numPenultimo = numUltimo;
                    numUltimo = numeroInsertado;
                    System.out.println("El total es: " + numTotal);
                }

                System.out.println("el numero anterior es " + numUltimo);

                if (numTotal >= numMaximo) {
                    System.out.println("Perdedor jugador 1 ;)");
                    break;
                }

            } else {
                System.out.println("numero incorrecto, pierdes turno");
                System.out.println("El total es: " + numTotal);
            }


        }
    }

    /**
     * pedimos al usuario el numero objetivo
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
     * @param numeroInsertado
     * @param numPenultimo
     * @param numUltimo
     * @return 0 si numeroInsertado es valido
     * @return 1 si numeroInsertado no es valido
     */
    public static int validacion(int numeroInsertado, int numPenultimo, int numUltimo) {

        if (numeroInsertado != numUltimo & numeroInsertado != numPenultimo) {
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

            }
        }
        System.out.println("El numero insertado no cumple las normas, pierdes turno");
        return 1;


    }
}

