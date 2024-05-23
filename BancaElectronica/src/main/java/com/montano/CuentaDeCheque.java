package com.montano;

public class CuentaDeCheque extends Cuenta {
    private double cosotManejoMensual;

    public CuentaDeCheque(int numero, String fechaApertura, double saldo, String fechaCancelacion, double cosotManejoMensual) {
        super(numero, fechaApertura, saldo, fechaCancelacion);
        this.cosotManejoMensual = cosotManejoMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeCheque{" +
                "cosotManejoMensual=" + cosotManejoMensual +
                '}';
    }
}
