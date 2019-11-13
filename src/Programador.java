public class Programador extends Humano{

	public Programador(int v) {
		
		super(100);
		
	}
	
	
	
	public void instanciaMovimientos() {
		//café
		Movimiento café = new Movimiento("Coffe time", 20, 5);
		//normalizar bc
		Movimiento boycecodd = new Movimiento("normalizacion boyce-codd", -50, 2);
		//eso es una df trivial
		Movimiento dfTrivial = new Movimiento("df trivial", -30);
		// ese diseño no se parece al mio
		Movimiento diseñoMalo = new Movimiento("Ese diseño no se parece al mio", -70);
		// prohibido moviles
		Movimiento prohibidoMoviles = new Movimiento ("Eso es un movil??????", -90);
		
		super.movimientos.add(seguimosConPracticas);
		super.movimientos.add(llavesCastillo);
		super.movimientos.add(dfTrivial);
		super.movimientos.add(diseñoMalo);
		super.movimientos.add(prohibidoMoviles);
		
		
	}
	
	

}
