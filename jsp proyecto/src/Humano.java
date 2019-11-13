import java.util.ArrayList;

public abstract class Humano {
	private int vida;
	 ArrayList<Movimiento> movimientos;
	
	
	public Humano (int v) {
		
		this.vida=v;
		movimientos = new ArrayList();
	}


	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}


	public ArrayList getMovimientos() {
		return movimientos;
	}


	public void setMovimientos(ArrayList movimientos) {
		this.movimientos = movimientos;
	}

	public void usarMovimiento(Movimiento m, Humano h) {
		
		setVida(m.getDaño()+h.vida);
		
	}
	
	
	
	

}
