package edu.uta.tarea3.refactorizado;

public class PoliticaAhorro implements PoliticaCuenta {

    @Override
    public String obtenerTipo() {
        return "Ahorro";
    }

    @Override
    public double calcularComisionTransferencia(double monto) {
        return 0;
    }

    @Override
    public double calcularInteresMensual(double saldo) {
        return saldo * 0.002;
    }
}
