import java.util.Scanner;

public class Tarea7seleccion {

    public static void main(String[] args) {
        try (Scanner dato = new Scanner(System.in)) {
            System.out.println("Ingrese un numero entero: ");
            int n1 = dato.nextInt();

            System.out.println("Ingrese un segundo numero entero: ");
            int n2 = dato.nextInt();

            int r = 0;

            System.out.println("'Presione uno de los siguientes simbolos para hacer una operación'" +
                    "| :Simbolo: | :Operacion |\n" +
                    "|    +    | Suma   |\n" +
                    "|    -    | Resta  |\n" +
                    "|    *   | Multiplicacion  |\n" +
                    "|    /    | Division |\n");

            char op = dato.next().charAt(0);

            switch (op) {
                case '+':
                    r = n1 + n2;

                    System.out.println("La suma es: " + r);
                    break;

                case '-':
                    r = n1 - n2;

                    System.out.println("La resta es: " + r);
                    break;

                case '*':
                    r = n1 * n2;

                    System.out.println("La multiplicación es: " + r);
                    break;

                case '/':
                    r = n1 / n2;

                    System.out.println("La division es: " + r);
                    break;

                default:
                    break;
            }

        }
    }
}
