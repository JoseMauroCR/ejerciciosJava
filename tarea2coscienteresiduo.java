import java.util.Scanner;
public class tarea2coscienteresiduo {
int n1,n2,Residuo,Cociente;
    public static void main(String[] args) {
        
        try (Scanner dato = new Scanner(System.in)) {
            int n1 = dato.nextInt();

            System.out.println("Ingrese un segundo numero entero : ");

            int n2 = dato.nextInt();
            
int Cociente = n1/n2;

int Residuo = n1%n2;
System.out.println("El cociente de ambos numeros es: " +Cociente );
System.out.println("El Residuo es: "+Residuo);
        } 
        

         catch (Exception e) {
            System.out.println("No ingreso un dato valido");
        }

    }
    
}
