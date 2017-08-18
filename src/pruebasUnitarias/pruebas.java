package pruebasUnitarias;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class pruebas {
	@BeforeClass
	public static void setUpClass() throws Exception {
		// Inicializaci�n general de variables, escritura del log...
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
		// Liberaci�n de recursos, escritura en el log...
	}

	@Before
	public void setUp() {
		// Inicializaci�n de variables antes de cada Test
		 
	}

	@After
	public void tearDown() {
		// Tareas a realizar despu�s de cada test
	}

	@Test
	public void pruebaNumeroBidon() {
		bidones b =new bidones(225,"28/30","10/08/2017","000032654");
		assertTrue(b.getNumeroBidon()==("000032654"));
	}
	@Test
	public void pruebaFecha() {
		bidones b =new bidones(225,"28/30","10/08/2017","000032654");
		assertTrue(b.getFecha().equals("10/08/2017"));
	}
	@Test
	public void pruebaProducto() {
		bidones b =new bidones(225,"28/30","10/08/2017","000032654");
		assertTrue(b.getProducto().equals("28/30"));
	}

	@Test
	public void pruebatoString() {
		bidones b =new bidones(225,"28/30","10/08/2017","000032654");
		assertTrue(b.toString().equals(b.fecha+b.numeroBidon+b.producto));
	}

	public void funcionAuxiliar() {
		// tareas auxiliares
	}
}
