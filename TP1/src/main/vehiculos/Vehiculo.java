package main.vehiculos;
//Establecer getter y setters!!!
import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    //Elementos del vehiculo
    private String patente; //dominio

    private char marca;

    private char tipo;

    private short modelo;

    private char estado;

    private int kilometraje;

    private double precio;
    //formula segun año de fabricacion y estado?

    public void vehiculo() {}

    public void vehiculo(String patente, char marca, char tipo, short modelo, char estado, int kilometraje, double precio) {

        this.patente = patente;

        this.marca = marca;

        this.tipo = tipo;

        this.modelo = modelo;

        this.estado = 'D';

        this.kilometraje = kilometraje;

        this.precio = precio;
    }

    public boolean evaluarPatente(String patente) {

        return (patente.length() > 5 && patente.length() < 10) && !patente.contains(" ");
    }

    public boolean evaluarModelo(short modelo) {

        return (modelo > 2004 && modelo < 2024);
    }

    public boolean evaluarKilometraje(int kilometraje) {

        return (kilometraje > 0);
    }

    public void agregarVehiculo() {

    }
    //falta
    public void reservar(char estado) {

        estado = 'R';
    }

    public void prepararPrecioDeVenta() {

        this.precio = precio + (10/100 * precio);
    }
}
