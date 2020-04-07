package tp0gesoc.modelo;


import org.junit.Assert;
import org.junit.Test;

public class TestGeneral {

	private Item item1;
	private Item item2;
	private OperacionDeEgreso op;
	
	@Test
	public void testSetPrecioItem() {
		
		item1 = new Articulo();
		//item2 = new ;
	
		item1.setPrecio(20);
	
		Assert.assertEquals(20.0,item1.getPrecio(),0);
	}

//	@Test
//	public void testAgregarItems() {
//		
//		item1 = new Articulo();
//		item2 = new Servicio();
//	
//		op = new OperacionDeEgreso();
//		
//		op.agregarItem(item1);
//		op.agregarItem(item2);
//	
//		Assert.assertEquals(2,op.items.size(),0);
//	}
//	
}
