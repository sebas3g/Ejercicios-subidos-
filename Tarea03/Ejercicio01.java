package edu.uta.tarea3.antes;

/**
 * Versión inicial: cada nuevo tipo de cuenta obliga a modificar los switch.
 * Se conserva únicamente para comparar con la solución refactorizada.
 */
public class BancoConSwitch {

    public static double calcularComisionTransferencia(String tipoCuenta, double monto) {
        switch (tipoCuenta.toUpperCase()) {
            case "AHORRO":
                return 0;
            case "CORRIENTE":
                return monto * 0.005;
            case "EMPRESARIAL":
                return monto * 0.01;
            default:
                throw new IllegalArgumentException("Tipo de cuenta desconocido");
        }
    }

    public static double calcularInteresMensual(String tipoCuenta, double saldo) {
        switch (tipoCuenta.toUpperCase()) {
            case "AHORRO":
                return saldo * 0.002;
            case "CORRIENTE":
                return 0;
            case "EMPRESARIAL":
                return saldo * 0.001;
            default:
                throw new IllegalArgumentException("Tipo de cuenta desconocido");
        }
    }

    public static void main(String[] args) {
        String tipo = "AHORRO";
        double saldo = 1000;
        double montoTransferencia = 100;

        System.out.println("Versión con switch");
        System.out.println("Comisión: $"
                + calcularComisionTransferencia(tipo, montoTransferencia));
        System.out.println("Interés: $" + calcularInteresMensual(tipo, saldo));
    }
}
