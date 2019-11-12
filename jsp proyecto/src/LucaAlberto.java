import java.util.ArrayList;

public class LucaAlberto extends Humano{

	public LucaAlberto(int v) {
		
		super(500);
		
	}
	
	
	public void setMovimientosLA(){
		
	}
	
	public void instanciaMovimientos() {
		//seguimos con las practicas
		Movimiento seguimosConPracticas = new Movimiento("Seguimos con las practicas", 20);
		//castillo
		Movimiento llavesCastillo = new Movimiento("Las llaves de un castillo", 5);
		//eso es una df trivial
		Movimiento dfTrivial = new Movimiento("df trivial", 30);
		// ese diseño no se parece al mio
		Movimiento diseñoMalo = new Movimiento("Ese diseño no se parece al mio", 70);
		// prohibido moviles
		Movimiento prohibidoMoviles = new Movimiento ("Eso es un movil??????", 90);
		
		super.movimientos.add(seguimosConPracticas);
		super.movimientos.add(llavesCastillo);
		super.movimientos.add(dfTrivial);
		super.movimientos.add(diseñoMalo);
		super.movimientos.add(prohibidoMoviles);
		
		
	}
	
	

}
