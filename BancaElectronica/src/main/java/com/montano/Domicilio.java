package com.montano;

public class Domicilio {
    private String calle;
    private int numero;
    private String colonia;
    private String estado;
    private int codigoPostal;

    public Domicilio(String calle, int numero, String colonia, String estado, int codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", colonia='" + colonia + '\'' +
                ", estado='" + estado + '\'' +
                ", codigoPostal=" + codigoPostal +
                '}';
    }
}
