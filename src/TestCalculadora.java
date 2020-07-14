
public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora = new Calculadora(10.5,5.2,"+");
		calculadora.realizarCalculo(5,2,"*");
		calculadora.realizarCalculo(1,100,"+");
		calculadora.realizarCalculo(9,3,"-");
		calculadora.realizarCalculo(10,2,"/");
		calculadora.realizarCalculo(5, "+");
		calculadora.realizarCalculo(2, "/");
	}

}
