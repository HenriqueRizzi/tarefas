package Exe;

public abstract class Figura {
	
	public String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Figura(String n)
	{
		this.nome = n;
	}
public abstract double area();

public abstract double perimetro();

public abstract double volume();


}
