package com.montano;

public interface IServicioCuentas {
    boolean agregarCuenta(Cuenta cuenta);
    boolean eliminarCuenta(int numero);
    void abonarCuenta (int numero, double abono);
    void retirar (int numero, double retiro);
    Cuenta[] obtenerCuentas();
}
