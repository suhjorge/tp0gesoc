package tp0gesoc.modelo;
import java.util.List;

public class OperacionDeEgreso {

	private double valor;
	private Boolean estaAbierto;
	
	List<Item> items;
	
	public double calcularValor() {
		
		double unValor = items.stream().mapToDouble(x->x.getPrecio()).sum();
		
		if (this.estaAbierto) {
			valor = unValor;
			return valor;
		}
		else {
			return unValor;
		}
	}
	
	public void agregarItem(Item item) {
		
		this.items.add(item);
	}

	public List<Item> getItems() {
		return items;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Boolean getEstaAbierto() {
		return estaAbierto;
	}

	public void setEstaAbierto(Boolean estaAbierto) {
		this.estaAbierto = estaAbierto;
	}
}
