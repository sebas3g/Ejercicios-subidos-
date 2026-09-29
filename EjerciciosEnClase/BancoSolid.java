package edu.uta.tarea3.refactorizado;

public class DemoBancoSOLID {

    private static void mostrarCuenta(CuentaBancaria cuenta) {
        System.out.printf("%-8s | %-11s | saldo: $%.2f%n",
                cuenta.getTitular(), cuenta.getTipo(), cuenta.getSaldo());
    }

    public static void main(String[] args) {
        CuentaBancaria cuentaAna = new CuentaBancaria(
                "Ana", 1000, new PoliticaAhorro());
        CuentaBancaria cuentaLuis = new CuentaBancaria(
                "Luis", 500, new PoliticaCorriente());
        CuentaBancaria cuentaEmpresa = new CuentaBancaria(
                "UTA", 5000, new PoliticaEmpresarial());

        // Este cuarto tipo demuestra OCP: CuentaBancaria no fue modificada.
        CuentaBancaria cuentaEstudiante = new CuentaBancaria(
                "Sofía", 200, new PoliticaEstudiantil());

        System.out.println("SALDOS INICIALES");
        mostrarCuenta(cuentaAna);
        mostrarCuenta(cuentaLuis);
        mostrarCuenta(cuentaEmpresa);
        mostrarCuenta(cuentaEstudiante);

        double comision = cuentaLuis.transferir(cuentaAna, 100);
        double interesAna = cuentaAna.aplicarInteresMensual();
        double interesEstudiante = cuentaEstudiante.aplicarInteresMensual();

        System.out.println("\nOPERACIONES");
        System.out.printf("Comisión cobrada a Luis: $%.2f%n", comision);
        System.out.printf("Interés abonado a Ana: $%.2f%n", interesAna);
        System.out.printf("Interés abonado a Sofía: $%.2f%n", interesEstudiante);

        System.out.println("\nSALDOS FINALES");
        mostrarCuenta(cuentaAna);
        mostrarCuenta(cuentaLuis);
        mostrarCuenta(cuentaEmpresa);
        mostrarCuenta(cuentaEstudiante);
    }
}
