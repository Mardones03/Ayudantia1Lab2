public class Motocicleta extends Vehiculo {
	private int capacidad;

	public Motocicleta(String marca, String modelo, Administracion menu, int capacidad) {
		super(marca, modelo, menu);
		this.capacidad = capacidad;
	}

	public int getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
}