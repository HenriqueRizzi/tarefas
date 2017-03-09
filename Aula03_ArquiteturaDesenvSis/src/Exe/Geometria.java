package Exe;
import java.util.ArrayList;
public class Geometria {
	public static void main(String[] args) 
	{
		ArrayList<Figura> figura = new ArrayList<>();
		figura.add(new Circulo(2.0,"Circulo"));
		figura.add(new Losango(2.0,4.0,"Losango",1.0,1.0,1.0,1.0));
		figura.add(new Quadrado(4.0,8.0,"Quadrado",4.0));
		figura.add(new Triangulo(3.0,9.0,"Triangulo",3.0,3.0,3.0));
		figura.add(new Retangulo(6.0,4.0,"Retangulo",6.0,3.0,2.0,2.0));
		figura.add(new Cubo(2.0,4.0,8.0,"Cubo"));
		figura.add(new Esfera(3.0,"Esfera"));
		figura.add(new Cilindro(5.0,9.0,"Cilindro"));
		figura.add(new Piramide(500.0,95.0,40.0,"Piramide"));
		
		
		for(Figura fig:figura)
		{
			
			System.out.println("AREA:");
			System.out.println(fig.getNome());
			System.out.println(fig.area()+"\n");
			System.out.println("PERIMETRO:");
			System.out.println(fig.getNome());
			System.out.println(fig.perimetro()+"\n");
			//System.out.println("DIAGONAL:");
			//System.out.println(fig.getNome());
			//System.out.println(.diagonal());
			System.out.println("VOLUME:");
			System.out.println(fig.getNome());
			System.out.println(fig.volume()+"\n");
			
		}
	}
}
