package Exe;

public class Triangulo extends Poligono {
	public double lado1,lado2,lado3;
	
	public Triangulo(double base,double altura, String nome,double l1,double l2,double l3)
	{
		super(base,altura,nome);
		setLado1(l1);
		setLado2(l2);
		setLado3(l3);
	}
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public double area() 
	{
		return ((base*altura)/2);
	}
	
	@Override
	public double perimetro() {
		
		return lado1+lado2+lado3;
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
