package Task;

public class Task8 {
	public static void main(String[] args) {
		int s, v;
		final int t = 12;
		v = 331;
		s = v*t;
		System.out.printf("Расстояние до молнии: %s метров.", s);
		System.out.println("\nСправочно => \n\tвремя до 'thunderbolt', (сек): " + t +", скорость звука, (м/сек): " + v);
	}
}