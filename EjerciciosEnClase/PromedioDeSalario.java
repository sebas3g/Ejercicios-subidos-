 public static void main(String[] args) { 

  

        Scanner scanner = new Scanner(System.in); 

  

        double sumaSalarios = 0; 

        double salario; 

        int contadorEmpleados = 0; 

  

        System.out.println("================================="); 

        System.out.println("      PROMEDIO DE SALARIOS"); 

        System.out.println("================================="); 

  

        System.out.print("Ingrese el salario del empleado: "); 

        salario = scanner.nextDouble(); 

  

        while (salario >= 0) { 

  

            sumaSalarios += salario; 

            contadorEmpleados++; 

  

            System.out.print("Ingrese otro salario " 

                    + "(negativo para terminar): "); 

            salario = scanner.nextDouble(); 

        } 

  

        System.out.println(); 

        System.out.println("================================="); 

        System.out.println("           RESULTADOS"); 

        System.out.println("================================="); 

  

        if (contadorEmpleados > 0) { 

  

            double promedio = sumaSalarios / contadorEmpleados; 

  

            System.out.println("Total de empleados : " + contadorEmpleados); 

            System.out.println("Suma de salarios   : $" + sumaSalarios); 

            System.out.println("Promedio de salarios: $" + promedio); 

  

        } else { 

  

            System.out.println("No se ingresaron salarios válidos."); 

        } 

  

        System.out.println("================================="); 

  

    } 

} 
