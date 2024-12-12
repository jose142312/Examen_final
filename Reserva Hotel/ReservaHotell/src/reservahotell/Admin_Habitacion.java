/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservahotell;

/**
 *
 * @author Jose
 */
public class Admin_Habitacion {
    private Habitacion[][] habitaciones;

    public Admin_Habitacion() {
        // Inicializa el hotel con 2 pisos y 4 habitaciones por piso
        habitaciones = new Habitacion[][]{
            {
                new Habitacion("101", "libre", "simple", 30),
                new Habitacion("102", "ocupada", "doble", 50),
                new Habitacion("103", "sucia", "simple", 40),
                new Habitacion("104", "libre", "doble", 60)
            },
            {
                new Habitacion("201", "libre", "simple", 35),
                new Habitacion("202", "ocupada", "doble", 55),
                new Habitacion("203", "sucia", "simple", 45),
                new Habitacion("204", "libre", "doble", 65)
            }
        };
    } 
     public void visualizarHabitaciones() {
        System.out.println("\n--- Estado de las Habitaciones ---");
        for (int i = 0; i < habitaciones.length; i++) {
            System.out.println("Piso " + (i + 1) + ":");
            for (Habitacion habitacion : habitaciones[i]) {
                System.out.println(habitacion.informacion());
            }
        }
    }
}
