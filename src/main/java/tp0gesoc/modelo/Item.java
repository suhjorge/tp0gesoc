package tp0gesoc.modelo;


public abstract class Item {

	private double precio;
	
	protected double getPrecio() {
		
		return this.precio;
	}
	
	protected void setPrecio(double importe) {
		
		this.precio = importe;
		
	}
}
