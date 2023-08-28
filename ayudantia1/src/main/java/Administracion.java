import java.util.ArrayList;
import java.util.Scanner;

public class Administracion {
	public static void main(String[] args) {
	Administracion administracion = new Administracion();
	administracion.iniciarMenu();
}
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private Scanner scanner = new Scanner(System.in);

	public void iniciarMenu() {
		boolean continuar = true;

		while (continuar) {
			System.out.println("Menú");
			System.out.println("1. Crear Auto");
			System.out.println("2. Crear Motocicleta");
			System.out.println("3. Ver Vehículos");
			System.out.println("4. Salir");
			System.out.print("Por favor ingrese una opcion: ");

			int opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
				case 1:
					System.out.print("Ingrese la marca del auto: ");
					String marcaAuto = scanner.nextLine();
					System.out.print("Ingrese el modelo del auto: ");
					String modeloAuto = scanner.nextLine();
					System.out.print("Ingrese el numero de puertas del auto: ");
					int puertas = Integer.parseInt(scanner.nextLine());
					crearAuto(marcaAuto, modeloAuto, puertas);
					break;

				case 2:
					System.out.print("Ingrese la marca de la motocicleta: ");
					String marcaMoto = scanner.nextLine();
					System.out.print("Ingrese el modelo de la motocicleta: ");
					String modeloMoto = scanner.nextLine();
					System.out.print("Ingrese la capacidad de la motocicleta: ");
					int capacidad = Integer.parseInt(scanner.nextLine());
					crearMotocicleta(marcaMoto, modeloMoto, capacidad);
					break;

				case 3:
					verVehiculos();
					break;

				case 4:
					continuar = false;
					salirDeMenu();
					break;

				default:
					System.out.println("Opción inválida.");
					break;
			}
		}

		scanner.close();
	}

	public void crearAuto(String marca, String modelo, int puertas) {
		Auto auto = new Auto(marca, modelo, this, puertas);
		vehiculos.add(auto);
	}

	public void crearMotocicleta(String marca, String modelo, int capacidad) {
		Motocicleta motocicleta = new Motocicleta(marca, modelo, this, capacidad);
		vehiculos.add(motocicleta);
	}

	public void verVehiculos() {
		System.out.println("Lista de vehículos:");
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println("Marca: " + vehiculo.getMarca() + ", Modelo: " + vehiculo.getModelo());

			if (vehiculo instanceof Auto) {
				Auto auto = (Auto) vehiculo;
				System.out.println("Numero de puertas del auto: " + auto.getPuertas());
			} else if (vehiculo instanceof Motocicleta) {
				Motocicleta motocicleta = (Motocicleta) vehiculo;
				System.out.println("Capacidad de la motocicleta: " + motocicleta.getCapacidad());
			}

			System.out.println("  ");
		}
	}

	public void salirDeMenu() {
		System.out.println("Gracias por usar el sistema");
	}

}