package Task;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		double s, v1;
		final double t = 3.2d;
		System.out.print("Speed today (m/sec): ");
		Scanner v = new Scanner(System.in);
		v1 = v.nextDouble();
		v.close();
		s = v1*t;
		System.out.printf("���������� �� ������: %s ������.", (float) s);
		System.out.println("\n��������� => \n\t����� �� 'thunderbolt', (���): " + t +", �������� �����, (�/���): " + v1);
	}
}