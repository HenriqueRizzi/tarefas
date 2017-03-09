package Exe;

public class Quadrado extends Poligono implements Diagonal{
	public double lado;
	
	public Quadrado(double base,double altura, String nome,double lado)
	{
		super(base,altura,nome);
		setLado(lado);
	}
	
	public double getLado() 
	{
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area()
	{
		return base*base;
	}
	
	@Override
	public double perimetro() {
		
		return lado*4;
	}
	
	public double diagonal()
	{
		return Math.sqrt(Math.pow(lado,2)*Math.pow(lado,2));
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
