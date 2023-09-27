package com.ar.edu.unju.fi.AppCorralonTP5POO;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ar.edu.unju.fi.AppCorralonTP5POO.controller.ClienteController;
import com.ar.edu.unju.fi.AppCorralonTP5POO.model.Cliente;
import com.ar.edu.unju.fi.AppCorralonTP5POO.model.ClienteCuentaCorriente;
import com.ar.edu.unju.fi.AppCorralonTP5POO.model.ClienteHabitual;
import com.ar.edu.unju.fi.AppCorralonTP5POO.model.SistemaCompra;

/**@LogManager se usan en .getLogger a partir de version 2.0 en log4j*/
@DisplayName("Cliente Controller") 
class ClienteControllerTest {

    final static Logger logger = LogManager.getLogger(ClienteControllerTest.class);

    static ClienteController target;  
	static Cliente clienteA;
    static Cliente clienteB;
    static SistemaCompra compraZ;

    @BeforeAll
	static void setUpBeforeClass() throws Exception {}

	@AfterAll
	static void tearDownAfterClass() throws Exception {}

    /**Coloco L detras de los numeros de tipo Long para que me acepte el numero*/
    @BeforeEach
	void setUp() throws Exception {
        
        logger.debug("Configurando SetUp");
		target = new ClienteController();
        logger.info("ClienteController creado");
		//clienteA = listaClientes.add(new ClienteHabitual(42123456, "Cruz Cristian", "cris17@gmail.com", 3881234567L, "El Carmen"));
        clienteB = new ClienteCuentaCorriente(41234567, "Cuesta Nelson", "cuest20@gmail.com", 3889876543L, "Palpala");
        logger.info("ClienteCuentaCorriente creado"); 
        compraZ = new SistemaCompra(LocalDate.of(2023, 9, 10), 10000);
    }

    @AfterEach
    void tearDown() throws Exception {
        logger.debug("Limpiando variables");
		target = null;
        logger.info("ClienteController eliminado");
		clienteB = null;
        logger.info("ClienteCuentaCorriente eliminado");
    }

    @Test
    @DisplayName("Agregar Cliente")
    void agregarClienteTest() {
        logger.debug("Iniciando prueba: AgregarCliente");		
		target.agregarCliente(clienteB);
        logger.info("ClienteCuentaCorriente agregado");
		Cliente clienteBuscado = target.buscarCliente("Cuesta Nelson");
		assertNotNull(clienteBuscado);
        if (clienteBuscado != null) {
            logger.info("Cliente encontrado");
        }
    }

    @Test
	@DisplayName("Eliminar Cliente")
    void eliminarClienteTest() {
        logger.debug("Iniciando prueba: EliminarCliente");		
		target.agregarCliente(clienteB);
        logger.info("ClienteCuentaCorriente agregado");
		Cliente clienteBuscado = target.buscarCliente("Cuesta Nelson");
		assertNotNull(clienteBuscado);
		target.eliminarCliente(clienteBuscado);
        Cliente clienteBuscadoOtraVez = target.buscarCliente("Cuesta Nelson");
		assertNull(clienteBuscadoOtraVez);
         if (clienteBuscadoOtraVez == null) {
            logger.info("Cliente eliminado con exito");
        }
    }

    @Test
	@DisplayName("Listar Documentos")
    void listarDocumentosTest() {
        logger.debug("Iniciando prueba: Listar Documentos");		
		target.agregarCliente(clienteB);
        List<Integer> listaDniClientes = target.listarDocumentos();
        assertEquals(listaDniClientes.size(), 2);
    }
    //Sin terminar 
    @Test
	@DisplayName("Hacer Compra")
    void hacerCompraTest() {
        logger.debug("Iniciando prueba: Hacer Compra");
        target.agregarCliente(clienteB);
        target.hacerCompra(1, compraZ);

    }
}