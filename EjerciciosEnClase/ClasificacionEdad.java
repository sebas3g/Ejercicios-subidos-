import java.util.Scanner; 

public class SistemaDescuentosBancarios { 

    public static void main(String[] args) { 

        Scanner entrada = new Scanner(System.in); 

        int edad; 

        System.out.print("Ingrese la edad del cliente: "); 

        edad = entrada.nextInt(); 

        if (edad < 18) { 

            System.out.println("Cliente: Joven"); 

        } else if (edad <= 64) { 

            System.out.println("Cliente: Adulto"); 

        } else { 

            System.out.println("Cliente: Tercera Edad"); 

        } 

          } 

} 
