package edu.uta.tarea2;

/**
 * Pruebas sin librerías externas. Incluye cobertura de caminos y fronteras.
 */
public class PruebasCalculoNotas {

    private static int pruebasEjecutadas = 0;
    private static int pruebasCorrectas = 0;

    private static void comprobar(double nota, String esperado) {
        pruebasEjecutadas++;
        String obtenido = CalculoNotas.clasificarNota(nota);
        boolean correcto = esperado.equals(obtenido);

        if (correcto) {
            pruebasCorrectas++;
        }

        System.out.printf("Nota: %-8s | Esperado: %-14s | Obtenido: %-14s | %s%n",
                nota, esperado, obtenido, correcto ? "OK" : "FALLÓ");
    }

    public static void main(String[] args) {
        System.out.println("PRUEBAS DE COBERTURA DE CAMINOS");

        // Un caso por cada camino independiente.
        comprobar(-1, CalculoNotas.NOTA_INVALIDA); // Camino 1
        comprobar(9.5, CalculoNotas.EXCELENTE);    // Camino 2
        comprobar(8, CalculoNotas.APROBADO);       // Camino 3
        comprobar(6, CalculoNotas.SUPLETORIO);     // Camino 4
        comprobar(4, CalculoNotas.REPROBADO);      // Camino 5

        System.out.println("\nPRUEBAS ADICIONALES DE FRONTERA");
        comprobar(0, CalculoNotas.REPROBADO);
        comprobar(4.99, CalculoNotas.REPROBADO);
        comprobar(5, CalculoNotas.SUPLETORIO);
        comprobar(6.99, CalculoNotas.SUPLETORIO);
        comprobar(7, CalculoNotas.APROBADO);
        comprobar(8.99, CalculoNotas.APROBADO);
        comprobar(9, CalculoNotas.EXCELENTE);
        comprobar(10, CalculoNotas.EXCELENTE);
        comprobar(10.01, CalculoNotas.NOTA_INVALIDA);
        comprobar(Double.NaN, CalculoNotas.NOTA_INVALIDA);

        System.out.println("\nResumen: " + pruebasCorrectas + "/"
                + pruebasEjecutadas + " pruebas correctas.");

        if (pruebasCorrectas != pruebasEjecutadas) {
            throw new AssertionError("Existen pruebas fallidas.");
        }
    }
}
