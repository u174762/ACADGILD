package Problem_stmt_2;

public class Main {

	public static void main(String args[])
	{
		// in this function the derived classes from StringedInstrument are called with their play methods.
		
		ElectricGuitar guitar = new ElectricGuitar();
		ElectricBassGuitar bass_guitar = new ElectricBassGuitar();
		
		guitar.play();
		bass_guitar.play();
	}
	
}
