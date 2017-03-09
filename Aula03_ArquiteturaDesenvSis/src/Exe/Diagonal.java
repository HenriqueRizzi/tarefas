package Exe;

public interface Diagonal {
	default double diagonal(double l1,double l2)
	{
		return Math.sqrt(Math.pow(l1,2)*Math.pow(l2,2));
	}
	
}
