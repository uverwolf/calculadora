
@SuppressWarnings("serial")
public class Calculadora implements java.io.Serializable {
	protected double operadorUno,operadorDos,resultado;
	private String operador;
	
	public Calculadora() {
		
	}
	public Calculadora(double n1,double n2,String operadorI) {
		operadorUno =n1;
		operadorDos=n2;
		operador=operadorI;
		if(operador=="+") {
			this.setResultado(getOperadorUno()+getOperadorDos());
			System.out.println(resultado);
			}
	}
	public double getOperadorUno() {
		return operadorUno;
	}
	public void setOperadorUno(double operadorUno) {
		this.operadorUno = operadorUno;
	}
	public double getOperadorDos() {
		return operadorDos;
	}
	public void setOperadorDos(double operadorDos) {
		this.operadorDos = operadorDos;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	
	public void realizarCalculo(double operador1,double operador2, String Operador) {
		switch (Operador) {
		case "+":
			setResultado(operador1+operador2);
			System.out.println("La suma es : "+getResultado());
			break;
		case "-":
			setResultado(operador1-operador2);
			System.out.println("La resta es : "+getResultado());
			break;
		case "*":
			setResultado(operador1*operador2);
			System.out.println("La multiplicacion es : "+getResultado());
			break;
		case "/":
			setResultado(operador1/operador2);
			System.out.println("La division es : "+getResultado());
		default:
			break;
		}
	}
	public void realizarCalculo(double operador,String Operador) {
		switch (Operador) {
		case "+":
			setResultado(getResultado()+operador);
			System.out.println("Resultado actual : "+getResultado());
			break;
		case "-":
			setResultado(getResultado()-operador);
			System.out.println("Resultado actual :"+getResultado());
			break;
		case "*":
			setResultado(getResultado()*operador);
			System.out.println("Resultado actual :"+getResultado());
			break;
		case "/":
			setResultado(getResultado()/operador);
			System.out.println("Resultado actual : "+getResultado());
		default:
			break;
		}
	}
}
