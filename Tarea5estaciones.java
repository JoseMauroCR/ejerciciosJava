import java.util.Scanner;

public class Tarea5estaciones {
    public static void main(String[] args) {
        System.out.println("" +
                "| Número  | Estación  |\n" +
                "| :-----: | :-------- |\n" +
                "|    1    | Primavera   |\n" +
                "|    2    | Verano  |\n" +
                "|    3    | Otoño  |\n" +
                "|    4    | Invierno |\n");

      

        int n;
        String e;

        try (
                Scanner dato = new Scanner(System.in)) {

            System.out.print("Ingrese un numero desde 1 a 4: ");
            n = dato.nextInt();

            switch (n) {
                case 1:
                    e = "Verano";
                    break;
                case 2:
                    e = "toño";
                    break;
                case 3:
                    e = "Invierno";
                    break;
                case 4:
                    e = "Primavera";
                    break;
                default:
                    e = "No existe mas de 4 estaciones";
                    break;
            }

            // Mostrar Datos
            System.out.println(" ");
            System.out.println("Estación: " + e);
        }catch (Exception r) {
            System.out.println("Error");
        }
    }
}
