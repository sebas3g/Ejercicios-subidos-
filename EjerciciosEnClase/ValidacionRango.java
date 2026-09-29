package evaluacioncfeteriau; 

import java.util.Scanner; 

public class EvaluacionCfeteriaU { 

    public static void main(String[] args) { 

        Scanner entrada = new Scanner(System.in); 

        System.out.println("Ingrese el numero:"); 

        int num = entrada.nextInt(); 

        if (num > 0 && num < 100) { 

            System.out.println("Correcto"); 

        } else { 

            System.out.println("Error, el numero no cumple el rango"); 

        } 

        entrada.close(); 

    } 

} 
