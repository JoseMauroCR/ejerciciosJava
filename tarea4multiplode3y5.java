import java.util.Scanner;
public class tarea4multiplode3y5 {

    public static void main(String[] args) {
        try (Scanner dato = new Scanner(System.in)) {
            System.out.println("Ingrese un numero entero");
int n = dato.nextInt();

if (n % 3 == 0 && n % 5 == 0 ) {
    System.out.println( n + " Si es multiplo de 3 y 5");
    
}else{
    System.out.println(n+" No es multiplo de 3 y 5");
}

}catch (Exception e) {
    System.out.println("No ingreso un dato valido");    
       }
    }


}
