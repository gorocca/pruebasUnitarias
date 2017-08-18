package pruebasUnitarias;

public class bidones {
	
	int kilos;
	String producto;
	String fecha;
	String numeroBidon;
	
	public bidones(int kilos, String producto,String fecha,String numeroBidon) {
		this.kilos=kilos;
		this.producto=producto;
		this.fecha=fecha;
		this.numeroBidon=numeroBidon;
	}
	
	public String toString() {
		return fecha+numeroBidon+producto;
	}
	
	public String getProducto() {
		return producto;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public String getNumeroBidon() {
		return numeroBidon;
	}

}
