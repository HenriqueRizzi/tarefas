package Exe;

public abstract class Poligono extends Figura {
	
	public double base,altura;
	public String nome;
	
	public Poligono(double base, double altura, String n)
	{
		super(n);
		this.base = base;
		this.altura = altura;
		this.nome = n;
	}
	@Override
	public abstract double area();
	
	@Override
	public double perimetro() {
		
		return 0;
	}

}
