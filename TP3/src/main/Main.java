package main;

import java.util.ArrayList;
import java.util.List;

import model.Administrativo;
import model.Empleado;
import model.Profesional;

public class Main { //class Empleado
    public static void main(String[] args) {

        Empleado profesional = new Profesional();
        //como seteo adicional y categoria? :(

        Empleado administrativo = new Administrativo();

        List<Empleado> lista = new ArrayList();

		lista.add(profesional);
		lista.add(administrativo);

        for(Empleado empleado: lista) {
			System.out.println(empleado.getNombre() + " Salario: "+ empleado.getSueldoNeto());
		}
    }
}
