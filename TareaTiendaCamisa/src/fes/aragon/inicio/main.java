package fes.aragon.inicio;

import fes.aragon.camisa.camisa;
import fes.aragon.tienda.Tienda;

public class main {
	public static void main(String[] args) {
		camisa camisaMngCrt = new camisa();
		camisa camisaCslMngLrg = new camisa();
		camisa camisaFrmlMngLrg = new camisa();
		Tienda local = new Tienda();
		
		camisaMngCrt = local.CMC();
		camisaCslMngLrg = local.CCML();
		camisaFrmlMngLrg = local.CFML();
		
		local.AñadirAlCarrito(camisaMngCrt, 4);
		local.AñadirAlCarrito(camisaCslMngLrg);
		local.AñadirAlCarrito(camisaFrmlMngLrg);
		local.AñadirAlCarrito(camisaMngCrt);
		
		local.CheckOut();
	}
}
