import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        try (Scanner name = new Scanner(System.in)) {
            String nombre = name.nextLine();

            System.out.println("Tu nombre es: " +nombre);
        }
    }
}
