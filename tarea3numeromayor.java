import java.util.Scanner;;
public class tarea3numeromayor {
    public static void main(String[] args) {
        try (Scanner dato = new Scanner(System.in)){

System.out.println("Ingrese un numero entero: ");

int n1 = dato.nextInt();

System.out.println("Ingresa un segundo numero entero");
int n2 = dato.nextInt();


if (n1>n2) {
System.out.println("El numero:" +n1+ " Es mayor que el segundo numero");    
}else{
    System.out.println("Entonces el numero: " +n2+ " Es mayor al primer numero");
}
} catch (Exception e) {
     System.out.println("No ingreso un dato valido");    
        }
        
    }
}
