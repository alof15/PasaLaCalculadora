import java.util.Objects;
import java.util.Scanner;

public class PasaLaCalculadora {
    public static void main(String[] args) {

        int numMax;
        int numTotal = 0;
        int numeroInsertado = 0;
        int numUltimo = 0;
        int numeroJugadores;
        String jugador1 = "";
        String jugador2 = "";
        String jugador3 = "";



        Scanner sc = new Scanner(System.in);
        //peticion al usuario del numero de jugadores
        System.out.println("ingrese el numero de jugadores, en caso de ser más de tres no podras poner nombres a los jugadores:");
        numeroJugadores = sc.nextInt();

        //asignacion de nombres
        if (numeroJugadores == 2) {
            System.out.println("ingrese su nombre jugador 1");
            jugador1 = sc.next();
            System.out.println("ingrese su nombre jugador 2");
            jugador2 = sc.next();
        }
        if (numeroJugadores == 3) {
            System.out.println("ingrese su nombre jugador 1");
            jugador1 = sc.next();
            System.out.println("ingrese su nombre jugador 2");
            jugador2 = sc.next();
            System.out.println("ingrese su nombre jugador 3");
            jugador3 = sc.next();
        }
        String[] jugadores = {jugador1, jugador2, jugador3};

        while (true) {
            numMax = obtenerNumeroObjetivo(sc);

            while (true) {

                for (int i = 0; i < numeroJugadores; i++) {
                    //2 y 3 jugadores van a poder poner su nombre mientras que mas de estos numeros no
                    if (numeroJugadores == 2 | numeroJugadores == 3) {
                        System.out.println("\u001B[35m" + "Introduce un numero " + jugadores[ i ] + " : ");
                    } else {
                        System.out.println("\u001B[35m" + "Introduce un numero jugador" + i + " : ");
                    }
                    numeroInsertado = sc.nextInt();

                    while (validarNumero(numeroInsertado, numUltimo) == 1) {

                        if (numeroJugadores == 2 | numeroJugadores == 3) {
                            System.out.println("\u001B[35m" + "numero incorrecto, vuelva a insertar un numero " + jugadores[i] + " : ");
                        } else {
                            System.out.println("\u001B[35m" + "numero incorrecto, vuelva a insertar un numero jugador" + i + " : ");
                        }


                        numeroInsertado = sc.nextInt();
                    }

                    numTotal += numeroInsertado;
                    numUltimo = numeroInsertado;
                    System.out.println(numTotal);

                    if (numTotal >= numMax) {
                        if (numeroJugadores == 2 | numeroJugadores == 3) {
                            System.out.println("Perdedor  " + jugadores[i]);
                        }else{
                            System.out.println("Perdedor jugador" + i);
                        }
                        break;
                    }
                }
                if (numTotal >= numMax) {
                    break;
                }
            }

            //peticion al usuario de la letra Y para poder jugar otra partida
            System.out.println("Si desea continuar escriba `Y´, en caso contrario pulse otra tecla.");
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
     * pedimos al usuario el numero objetivo
     *
     * @param sc
     * @return numMaximo numero objetivo a no superar
     */
    private static int obtenerNumeroObjetivo(Scanner sc) {
        int numMaximo;
        while (true) {

            System.out.println("\u001B[32m" + "Introduce el numero maximo este debe ser superior a 10 e inferior a 99:");
            numMaximo = sc.nextInt();
            //numero random
            if (numMaximo == -1) {
                numMaximo = (int) Math.round(Math.random() * 89) + 10;
                break;
                //comprobacion para el numero objetivo
            } else if (numMaximo > 10 & numMaximo < 99) {
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
    public static int validarNumero(int numeroInsertado, int numUltimo) {

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
                //solo se utiliza en el primer turno
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

