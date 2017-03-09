package Exe;

public class Esfera extends Solido {
public double raio;

	public Esfera(double raio,String n) 
	{
		super(n);
		setRaio(raio);
	}
	
	
		public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
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
		return ((4/3)*Math.PI*Math.pow(raio, 3));
	}

}
