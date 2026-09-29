import java.util.Scanner; 

public class SaludoEstudiante { 
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in); 

        System.out.print("Ingrese su nombre: "); 

        String nombre = entrada.nextLine(); 

        System.out.print("Ingrese su edad: "); 

        int edad = entrada.nextInt(); 

        System.out.println("\nHola, " + nombre); 

        System.out.println("Usted tiene " + edad + " años."); 

        System.out.println("Bienvenido a programación en Java."); 
    } 

} 
