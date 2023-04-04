package fes.aragon.Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import fes.aragon.camisa.camisa;
import fes.aragon.tienda.Tienda;

public class Tests {
	
	camisa camisaMngCrt = new camisa();
	camisa camisaCslMngLrg = new camisa();
	camisa camisaFrmlMngLrg = new camisa();
	Tienda local = new Tienda();
	
	//las barras "/////////////" son para diferenciar con mas claridad cada resultado de las prueba

	@Test
	public void testCMC() {
		
		camisaMngCrt = local.CMC();
	}

	@Test
	public void testCCML() {
		
		camisaCslMngLrg = local.CCML();
		
	}

	@Test
	public void testCFML() {
	
		camisaFrmlMngLrg = local.CFML();
	}

	@Test
	public void testAñadirAlCarritoCamisa() {
		local.AñadirAlCarrito(camisaCslMngLrg);
	}

	@Test
	public void testAñadirAlCarritoCamisaInt() {
		local.AñadirAlCarrito(camisaMngCrt, 4);
	}


	@Test
	public void testCheckOut() {
		double expected = 0.0;
		Tienda local = new Tienda();
		//TotalPagar
		
		local.CheckOut();
		Assert.assertEquals(expected, local.getPreciototal(), 0.0);
		System.out.println("///////////////////////////////////////");
		
		
	}
	
	@Test
	public void testVaciarCarrito() {
		local.VaciarCarrito();
	}
	
	@Test
	public void testComprarMenosde3() {
		camisaMngCrt = local.CMC();
		camisaCslMngLrg = local.CCML();
		camisaFrmlMngLrg = local.CFML();
		
		double exp = 500.0;
		
		local.AñadirAlCarrito(camisaFrmlMngLrg);
		local.AñadirAlCarrito(camisaMngCrt);
		
		local.CheckOut();
		Assert.assertEquals(local.getPreciototal(),exp,0.0);
		
		System.out.println("///////////////////////////////////////");
	}
	
	@Test
	public void testComprarDe3a5() {
		camisaMngCrt = local.CMC();
		camisaCslMngLrg = local.CCML();
		camisaFrmlMngLrg = local.CFML();
		
		local.AñadirAlCarrito(camisaFrmlMngLrg);
		local.AñadirAlCarrito(camisaMngCrt);
		local.AñadirAlCarrito(camisaCslMngLrg);
		
		local.CheckOut();
		System.out.println("///////////////////////////////////////");
	}
	
	@Test
	public void testComprar5() {
		camisaMngCrt = local.CMC();
		camisaCslMngLrg = local.CCML();
		camisaFrmlMngLrg = local.CFML();
		
		local.AñadirAlCarrito(camisaFrmlMngLrg,2);
		local.AñadirAlCarrito(camisaMngCrt,2);
		local.AñadirAlCarrito(camisaCslMngLrg);
		
		local.CheckOut();
		System.out.println("///////////////////////////////////////");
	}
	
	@Test
	public void testComprar8() {
		camisaMngCrt = local.CMC();
		camisaCslMngLrg = local.CCML();
		camisaFrmlMngLrg = local.CFML();
		
		local.AñadirAlCarrito(camisaFrmlMngLrg,2);
		local.AñadirAlCarrito(camisaMngCrt,2);
		local.AñadirAlCarrito(camisaCslMngLrg,4);
		
		local.CheckOut();
		System.out.println("///////////////////////////////////////");
	}
	
	@Test
	public void testComprar20() {
		camisaMngCrt = local.CMC();
		camisaCslMngLrg = local.CCML();
		camisaFrmlMngLrg = local.CFML();
		
		local.AñadirAlCarrito(camisaFrmlMngLrg,10);
		local.AñadirAlCarrito(camisaMngCrt,5);
		local.AñadirAlCarrito(camisaCslMngLrg,5);
		
		local.CheckOut();
		System.out.println("///////////////////////////////////////");
	}
	
	@Test
	public void TestArrepentimiento() {
		camisaMngCrt = local.CMC();
		camisaCslMngLrg = local.CCML();
		camisaFrmlMngLrg = local.CFML();
		
		local.AñadirAlCarrito(camisaFrmlMngLrg,10);
		local.AñadirAlCarrito(camisaMngCrt,5);
		local.AñadirAlCarrito(camisaCslMngLrg,5);
		
		local.VaciarCarrito();
		local.CheckOut();
		System.out.println("///////////////////////////////////////");
	}
	
	@Test
	public void testComprar20expected() {
		double expected = 4784.0;
		camisaMngCrt = local.CMC();
		camisaCslMngLrg = local.CCML();
		camisaFrmlMngLrg = local.CFML();
		
		local.AñadirAlCarrito(camisaFrmlMngLrg,10);
		local.AñadirAlCarrito(camisaMngCrt,5);
		local.AñadirAlCarrito(camisaCslMngLrg,5);
		
		local.CheckOut();
		Assert.assertEquals(local.getPreciototal(),expected,0.0);
		System.out.println("///////////////////////////////////////");
	}
	
	@Test
	public void testComprarPocos() {
		double expected = 310.0;
		camisaFrmlMngLrg = local.CFML();
		
		local.AñadirAlCarrito(camisaFrmlMngLrg);
	
		
		local.CheckOut();
		Assert.assertEquals(local.getPreciototal(),expected,0.0);
		System.out.println("///////////////////////////////////////");
	}
	
	@Test
	public void testComprarPocos2() {
		double expected = 230.0;
		camisaCslMngLrg = local.CCML();
		
		
		local.AñadirAlCarrito(camisaCslMngLrg);

		local.CheckOut();
		Assert.assertEquals(local.getPreciototal(),expected,0.0);
		System.out.println("///////////////////////////////////////");
	}
	
	@Test
	public void testComprarPocos3() {
		double expected = 190.0;
		camisaMngCrt = local.CMC();
		
		
		local.AñadirAlCarrito(camisaMngCrt);
	
		
		local.CheckOut();
		Assert.assertEquals(local.getPreciototal(),expected,0.0);
		System.out.println("///////////////////////////////////////");
	}
	
	@Test
	public void testErrorCamisa() {
		double expected = 190.0;
		camisaMngCrt = local.CCML();
		
		
		local.AñadirAlCarrito(camisaMngCrt);
	
		//provocaremos un error , esperaremos un precio de una camisa pero en realidad metimos otra camisa
		local.CheckOut();
		Assert.assertEquals("No coincide el precio",expected, local.getPreciototal(),0.0);
		System.out.println("///////////////////////////////////////");
	}
	
	
	
	
	
	
	
}
