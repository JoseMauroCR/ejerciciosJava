import java.util.Scanner;

public class tarea1hallaravalorayb {
    int Num1, Num2, Suma, Resta;
    public static void main(String[] args) {
     System.out.println("Ingrese un numero entero : ");
        try (Scanner dato = new Scanner(System.in)) {
            int Num1 = dato.nextInt();

            System.out.println("Ingrese un segundo numero entero : ");

            int Num2 = dato.nextInt();
            
int Suma = Num1 + Num2;

int Resta = Num1 - Num2;
System.out.println("La suma de ambos numeros es: " +Suma );
System.out.println("La resta de ambos numeros es: "+Resta);
        } 
            
        catch (Exception e) {
            System.out.println("No ingreso un dato valido");
        }

        
    }
    
}
