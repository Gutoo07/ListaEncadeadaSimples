package view;
import controller.Metodos;

public class Main {

	public static void main(String[] args) {
		try {
			Metodos obj = new Metodos();
			System.out.println( obj.teste() );
		} catch ( Exception e ) {
			e.printStackTrace();
		}			
	}
}
