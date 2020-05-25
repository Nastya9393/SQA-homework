package Task;

public class Task5 {
	public static void main (String[] args) {
		final float R = 10.792f;
		final double PI = 3.141592653589793d;
		float L1, S;
		L1 = (float) ((float) 2*R*PI);
		S = (float) ((float) R*R*PI);
		System.out.println("Радиус (заданный):\t" + R);
		System.out.println("Длина окружности:\t" + L1);
		System.out.println("Площадь круга:\t\t" + S);
	}
}