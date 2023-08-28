public class Auto extends Vehiculo {
	private int puertas;
	public Auto(String marca, String modelo, Administracion menu, int puertas) {
		super(marca, modelo, menu);
		this.puertas = puertas;
	}


	public int getPuertas() {
		return this.puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

}