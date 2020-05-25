package Task;

public class Task6 {
	public static void main (String[] args) {
		final double W = 2.0d;
		final double H = 3.0d;
		double P, S;
		P = 2*(W+H);
		S = W*H;
		System.out.println("Ширина и высота (заданные):\t" + W +" , " + H);
		System.out.println("Периметр прямоугольника:\t" + P);
		System.out.println("Площадь прямоугольника:\t\t" + S);
	}
}