public class Programador extends Humano{

	public Programador() {
		
		super(100);
		
	}
	
	
	
	public void instanciaMovimientos() {
		//café
		Movimiento cafe = new Movimiento("Coffe time", 20, 5);
		//normalizar bc
		Movimiento boycecodd = new Movimiento("normalizacion boyce-codd", -50, 2);
		//eso es una df trivial
		Movimiento sacarTriviales = new Movimiento("normalizado", -70, 2);
		// ese diseño no se parece al mio
		Movimiento diseñoDeveloper = new Movimiento("diseñar dpm", -200,1 );
		// prohibido moviles
		Movimiento usarMovil = new Movimiento ("hacer foto con el movil", -500, 1);
		
		super.movimientos.add(cafe);
		super.movimientos.add(sacarTriviales);
		super.movimientos.add(boycecodd);
		super.movimientos.add(diseñoDeveloper);
		super.movimientos.add(usarMovil);
		
		
	}
	
	

}
