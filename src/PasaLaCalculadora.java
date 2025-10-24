import java.util.Objects;
import java.util.Scanner;

public class PasaLaCalculadora {
    public static void main(String[] args) {

        int numMax;
        int numTotal = 0;
        int numeroInsertado;
        int numUltimo = 0;
        int numeroJugadores;
        Scanner sc = new Scanner(System.in);
         System.out.println("Normas\n " +
                "1.El primer jugador puede introducir cualquiera dentro del rango.\n"+
                "2.El siguiente número ha de ser distinto al anterior y estar en la misma fila o columna. "
                    );
        //peticion al usuario del número de jugadores

        System.out.println("Ingrese el numero de jugadores:");
        numeroJugadores = sc.nextInt();

        //creación de un array para almacenar los nombres del usuario

        String[] jugadores = new String[numeroJugadores];
        String[] colors = new String[numeroJugadores];


        //asignación de nombres dentro de un for para poder asignarle a cada ciclo un nombre y almacenarlo en un array

        for (int i = 0; i < numeroJugadores; i++) {

            System.out.println("Introduce un nombre jugador" + (i + 1));
            jugadores[i] = sc.next();
            System.out.println("Escoge un color, si quieres\n 1 amarillo\n 2 azul\n 3 purpura \n 4 cyan");
            colors [i]= selecColor(sc);

        }

        while (true) {


            numMax = obtenerNumeroObjetivo(sc);

            while (true) {

                for (int i = 0; i < numeroJugadores; i++) {

                    System.out.println(colors[i] + "Introduce un numero " + jugadores[i] + " : ");

                    numeroInsertado = sc.nextInt();

                    while (validarNumero(numeroInsertado, numUltimo) == 1) {

                        System.out.println("\u001B[31m" + "El numero es incorrecto, vuelva a intentarlo " + jugadores[i] + " : ");

                        numeroInsertado = sc.nextInt();

                    }

                    numTotal += numeroInsertado;
                    numUltimo = numeroInsertado;
                    System.out.println(numTotal);

                    if (numTotal >= numMax) {

                        System.out.println(colors[i]+"Perdedor  " + jugadores[i]);

                        break;
                    }
                }
                if (numTotal >= numMax) {
                    break;
                }
            }

            //peticion al usuario de la letra Y para poder jugar otra partida
            System.out.println("Si desea terminar la partida escriba `n´, en caso contrario pulse otra tecla.");
            Scanner cr = new Scanner(System.in);
            String continuar = cr.nextLine();

            if (Objects.equals(continuar, "no") | Objects.equals(continuar, "n")) {
                System.out.println("Saliendo del sistema");
                break;

            } else {
                System.out.println("Continuemos");


            }
        }

    }

    private static String selecColor(Scanner sc) {
        int color = sc.nextInt();
        switch (color) {
            case 1: {
                return ("\u001B[33m");//amarelo

            }
            case 2: {
                return ("\u001B[34m");

            }//azul
            case 3: {
                return ("\u001B[35m");//purpura


            }
            case 4:{
                return ("\u001B[36m");//cian

            }
            default:{
                System.out.println("Color por defecto");
                return ("\u001B[37m");

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
                System.out.println("\u001B[31m" + "Que sea correcto ");
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

