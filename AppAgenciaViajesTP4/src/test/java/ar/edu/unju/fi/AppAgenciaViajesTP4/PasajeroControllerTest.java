package ar.edu.unju.fi.AppAgenciaViajesTP4;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.controller.PasajeroController;
import ar.edu.unju.fi.model.Pasajero;
/**Pagina de Tests
 * @author AlvarezCarlosMatias 
 * @version 23/09/14
*/
public class PasajeroControllerTest {
    
    static PasajeroController target;  
	static Pasajero pasajeroA;
	static Pasajero pasajeroB;
	
	/**Parte de prueba que se realiza antes
	 */
    @BeforeEach
	void setUp() throws Exception {

		System.out.println("Configurando SetUp");
		target = new PasajeroController();
		pasajeroB = new Pasajero(42123456, "Herrera Alex", (float)388123456, "alex127@gmail.com", "Resistencia", "Salta", "29/09", "Economy", false, "Reservada");		
	}
	/**Parte de prueba que se realiza despues
	 * (Limpieza)
	 */
    @AfterEach
	void tearDown() throws Exception {

		System.out.println("Limpiando variables");
		target = null;
		pasajeroB = null;
    }
    @Test
	@DisplayName("Agregar Pasajero")
	void agregarPasajeroTest() {

		System.out.println("Iniciando prueba de AgregarPasajero");		
		target.agregarPasajero(pasajeroB);
    }
	@Test
	@DisplayName("Cancelar Estado de Reserva")
	void cancelarReservaTest() {

		System.out.println("Iniciando prueba de CancelarReserva");		
		target.cancelarReserva();
    }
	@Test
	@DisplayName("Pagar Estado de Reserva")
	void pagarReservaTest() {

		System.out.println("Iniciando prueba de PagarReserva");		
		target.pagarReserva();
    }
	@Test
	@DisplayName("Listar Estado de Pasajeros")
	void listarEstadoTest() {

		System.out.println("Iniciando prueba de ListarPasajeros");		
		target.agregarPasajero(pasajeroB);
		List<Pasajero> lista = target.listarEstado("Reservada");
		//lista = target.listarEstado("Reservada");
	}
}
