package Exe;

public class Cubo extends Solido {
public double altura,largura,comprimento;

	public Cubo(double altura, double largura, double comprimento,String n) 
	{
		super(n);
		setAltura(altura);
		setLargura(largura);
		setComprimento(comprimento);
	}
	
		public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getLargura() {
		return largura;
	}
	
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}


	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double volume() 
	{
		return altura*largura*comprimento;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

}
