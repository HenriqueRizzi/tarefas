package Exe;

public class Circulo extends Figura {
public double raio;


	public Circulo(double r, String n)
	{
		super(n);
		this.raio = r;
		this.nome = n;
	}
	
	@Override
	public double area() 
	{
		return Math.PI*Math.pow(raio, 2);
	}
	
	@Override
	public double perimetro() {
		
		return 2*Math.PI*raio;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}


}
