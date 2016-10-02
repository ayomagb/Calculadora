package metodos_calculadora;
import modelo_calculadora.ModeloCalculadora;

public class MetodosCalculadora {
	//atributos
	private ModeloCalculadora mc;
	//constructor con parámetros
	public MetodosCalculadora(ModeloCalculadora mc) {
		this.mc = mc;
	}
	/**
	 * double sumar()
	 * @return n1+n2
	 */
	public double sumar(){
		return mc.getN1()+mc.getN2();
	}
}
