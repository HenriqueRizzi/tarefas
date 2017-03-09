package Exe;

public class Cilindro extends Solido {

	public double raio,altura;
	
	public Cilindro(double raio, double altura,String n) 
	{
		super(n);
		setRaio(raio);
		setAltura(altura);
	}
	
		public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double volume() 
	{
		return Math.PI*Math.pow(raio, 3)*altura;
	}

}
