package Tests;

import metodos_calculadora.MetodosCalculadora;
import modelo_calculadora.ModeloCalculadora;

public class TestSumar {

	public static void main(String[] args) {
		ModeloCalculadora modCal = new ModeloCalculadora(5,11);
		MetodosCalculadora metCal=new MetodosCalculadora(modCal);
		System.out.println(metCal.sumar());
	}

}
