import java.util.Scanner;
public class tarea6numeroaletras {
    public static void main(String[] args) {
     

      

        int n;
        String r;

        try (
                Scanner dato = new Scanner(System.in)) {

            System.out.print("Ingrese un numero desde 0 a 9: ");
            n = dato.nextInt();

            switch (n) {
                case 1:
                    r = "Uno";
                    break;
                case 2:
                    r = "Dos";
                    break;
                case 3:
                    r = "Tres";
                    break;
                case 4:
                    r = "Cuatro";
                    break;
                    case 5:
                    r = "Cinco";
                    break;
                case 6:
                    r = "Seis";
                    break;
                case 7:
                    r = "TSiete";
                    break;
                case 8:
                    r = "Ocho";
                    break;
                    case 9:
                    r = "Nueve";
                    break;
                default:
                    r= "No insertaste un numero valido";
                    break;
            }

            // Mostrar Datos
            System.out.println(" ");
            System.out.println("Su seleccion fue: " + r);
        }catch (Exception e) {
            System.out.println("Error");
        }
    }
}


