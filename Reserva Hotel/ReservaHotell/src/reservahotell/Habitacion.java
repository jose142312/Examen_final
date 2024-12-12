/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservahotell;

/**
 *
 * @author Jose
 */
public class Habitacion {
        private String num;
    private String estado;
    private String tipo;
    private double costo;

    public Habitacion(String numero, String estado, String tipo, double precio) {
        this.num = numero;
        this.estado = estado;
        this.tipo = tipo;
        this.costo = precio;
    }

    // Getters y Setters
    public String getNumero() {
        return num;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return costo;
    }

    public void setPrecio(double precio) {
        this.costo = costo;
    }

    
    public String informacion() {
        return "Habitación " + num + " | Estado: " + estado + " | Tipo: " + tipo + " | Precio: $" + costo;
    }
}
