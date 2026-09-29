package edu.uta.tarea3.refactorizado;

/**
 * CuentaBancaria usa composición: contiene una PoliticaCuenta.
 * La clase no necesita conocer los tipos concretos de cuenta.
 */
public class CuentaBancaria {

    private final String titular;
    private final PoliticaCuenta politica;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial, PoliticaCuenta politica) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El titular es obligatorio");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        if (politica == null) {
            throw new IllegalArgumentException("La política de cuenta es obligatoria");
        }

        this.titular = titular;
        this.saldo = saldoInicial;
        this.politica = politica;
    }

    public void depositar(double monto) {
        validarMontoPositivo(monto);
        saldo += monto;
    }

    /**
     * @return comisión cobrada por la transferencia.
     */
    public double transferir(CuentaBancaria destino, double monto) {
        if (destino == null) {
            throw new IllegalArgumentException("La cuenta destino es obligatoria");
        }
        validarMontoPositivo(monto);

        double comision = politica.calcularComisionTransferencia(monto);
        double totalDebitar = monto + comision;

        if (saldo < totalDebitar) {
            throw new IllegalStateException("Saldo insuficiente");
        }

        saldo -= totalDebitar;
        destino.depositar(monto);
        return comision;
    }

    public double aplicarInteresMensual() {
        double interes = politica.calcularInteresMensual(saldo);
        saldo += interes;
        return interes;
    }

    private void validarMontoPositivo(double monto) {
        if (!Double.isFinite(monto) || monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que cero");
        }
    }

    public String getTitular() {
        return titular;
    }

    public String getTipo() {
        return politica.obtenerTipo();
    }

    public double getSaldo() {
        return saldo;
    }
}
