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


        //primer turno
        while (true) {
            System.out.println("\u001B[34m" + "Introduce el primer numero jugador 1: ");
            numeroInsertado = sc.nextInt();

            if (numeroInsertado > 0 & numeroInsertado < 10) {
                numTotal += numeroInsertado;
                System.out.println(numTotal);
                numUltimo=numeroInsertado;
                break;
            }
        }

        //resto juego


        while (numMaximo >= numTotal) {

            //turno jugador 2

            System.out.println("\u001B[35m" + "Introduce un numero jugador 2: ");
            numeroInsertado = sc.nextInt();


            if (numeroInsertado > 0 & numeroInsertado < 10) {
                restricciones(numeroInsertado, numUltimo, numPenultimo, numTotal);

                System.out.println(numTotal);

                if (numTotal >= numMaximo) {
                    System.out.println("Perdedor jugador 2 ;)");
                    break;
                }

            } else {
                System.out.println("numero incorrecto, pierdes turno");
                System.out.println(numTotal);

            }


            // turno jugador 1

            System.out.println("\u001B[34m" + "Introduce un numero jugador 1: ");
            numeroInsertado = sc.nextInt();

            if (numeroInsertado > 0 & numeroInsertado < 10) {
                restricciones(numeroInsertado, numUltimo, numPenultimo, numTotal);

                System.out.println(numTotal);
                if (numTotal >= numMaximo) {
                    System.out.println("Perdedor jugador 1 ;)");
                    break;
                }

            } else {
                System.out.println("numero incorrecto, pierdes turno");
                System.out.println(numTotal);

            }


        }
    }

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
    public static void restricciones(int numeroInsertado, int numPenultimo, int numUltimo, int numTotal) {
        if (numeroInsertado != numUltimo & numeroInsertado!=numPenultimo ) {
            switch (numUltimo) {

                case 1: {
                    if (numeroInsertado == 2 || numeroInsertado == 3 || numeroInsertado == 4 || numeroInsertado == 7) {
                        System.out.println("El numero insertado cumple las normas");
                        numTotal += numeroInsertado;
                        numPenultimo = numUltimo;
                        numUltimo = numeroInsertado;

                    }
                    break;
                }
                case 2: {
                    if (numeroInsertado == 1 || numeroInsertado == 3 || numeroInsertado == 5 || numeroInsertado == 8) {
                        System.out.println("El numero insertado cumple las normas");
                        numTotal += numeroInsertado;
                        numPenultimo = numUltimo;
                        numUltimo = numeroInsertado;

                    }
                    break;
                }
                case 3: {
                    if (numeroInsertado == 1 || numeroInsertado == 2 || numeroInsertado == 6 || numeroInsertado == 9) {
                        System.out.println("El numero insertado cumple las normas");
                        numTotal += numeroInsertado;
                        numPenultimo = numUltimo;
                        numUltimo = numeroInsertado;

                    }
                    break;
                }
                case 4: {
                    if (numeroInsertado == 1 || numeroInsertado == 5 || numeroInsertado == 6 || numeroInsertado == 7) {
                        System.out.println("El numero insertado cumple las normas");
                        numTotal += numeroInsertado;
                        numPenultimo = numUltimo;
                        numUltimo = numeroInsertado;

                                            }
                    break;
                }
                case 5: {
                    if (numeroInsertado == 2 || numeroInsertado == 4 || numeroInsertado == 6 || numeroInsertado == 8) {
                        System.out.println("El numero insertado cumple las normas");
                        numTotal += numeroInsertado;
                        numPenultimo = numUltimo;
                        numUltimo = numeroInsertado;


                    }
                    break;
                }
                case 6: {
                    if (numeroInsertado == 3 || numeroInsertado == 4 || numeroInsertado == 5 || numeroInsertado == 9) {
                        System.out.println("El numero insertado cumple las normas");
                        numTotal += numeroInsertado;
                        numPenultimo = numUltimo;
                        numUltimo = numeroInsertado;

                    }
                    break;
                }
                case 7: {
                    if (numeroInsertado == 1 || numeroInsertado == 4 || numeroInsertado == 8 || numeroInsertado == 9) {
                        System.out.println("El numero insertado cumple las normas");
                        numTotal += numeroInsertado;
                        numPenultimo = numUltimo;
                        numUltimo = numeroInsertado;

                    }
                    break;
                }
                case 8: {
                    if (numeroInsertado == 2 || numeroInsertado == 5 || numeroInsertado == 7 || numeroInsertado == 9) {
                        System.out.println("El numero insertado cumple las normas");
                        numTotal += numeroInsertado;
                        numPenultimo = numUltimo;
                        numUltimo = numeroInsertado;
                    }
                    break;
                }
                case 9: {
                    if (numeroInsertado == 3 || numeroInsertado == 6 || numeroInsertado == 7 || numeroInsertado == 8) {
                        System.out.println("El numero insertado cumple las normas");
                        numTotal += numeroInsertado;
                        numPenultimo = numUltimo;
                        numUltimo = numeroInsertado;

                    }
                    break;
                }

            }
        } else {
            System.out.println("no cumples las normas");
        }
    }
}

