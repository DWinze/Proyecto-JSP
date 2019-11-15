
public class Movimiento {
	private String nombre;
	private int daño;
	private int usos;
	public Movimiento(String n, int d, int u) {
		this.nombre=n;
		this.daño=d;
		this.usos=u;
			
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

	public int getUsos() {
		return usos;
	}

	public void setUsos(int usos) {
		this.usos = usos;
	}

	@Override
	public String toString() {
		return "Movimiento: " + nombre + " " + daño +  "\n" + " usos disponibles: "  + usos ;
	}
	
	

}
