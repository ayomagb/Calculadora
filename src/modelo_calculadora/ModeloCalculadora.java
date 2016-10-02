package modelo_calculadora;

public class ModeloCalculadora {
	//atributos
	private double n1;
	private double n2;
	//constructor sin parámetros
	public ModeloCalculadora(){
		n1=0.0;
		n2=0.0;
	}
	//constructor con parámetros
	public ModeloCalculadora(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	//consultores
	public double getN1() {
		return n1;
	}
	public double getN2() {
		return n2;
	}
	//modificadores
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	//String toString()
	@Override
	public String toString() {
		return "ModeloCalculadora [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
}
