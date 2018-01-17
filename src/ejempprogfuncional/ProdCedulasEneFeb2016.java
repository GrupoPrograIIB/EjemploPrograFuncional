/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejempprogfuncional;

/**
 *
 * @author Paredes
 */
public class ProdCedulasEneFeb2016 {
    
    private String provincia;
    private int anio;
    private int mes;
    private String tipo;
    private int cantidad;

    public ProdCedulasEneFeb2016(String provincia, int anio, int mes, String tipo, int cantidad) {
        this.provincia = provincia;
        this.anio = anio;
        this.mes = mes;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return provincia + " | " + anio + " | " + mes + " | " + tipo + " | " + cantidad;
    }
    
}
