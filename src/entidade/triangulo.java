package entidade;

public class triangulo { // atributo da classe entidade

	public double a; //A,B e C são os métodos do atributo triagulo
	public double b;
	public double c;
	
	//Método e função
	public double area() {
	double p =(a + b + c) / 2.0;
	double resultado = Math.sqrt(p*(p - a)*(p - b)*(p-c));
	return resultado;
}
}