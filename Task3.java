package Task;

public class Task3 {
	public static void main (String[] args) {
		double n, x;
		n = 2.8399999d;
		System.out.println("Имеется вещественное число n:\t\t\t" + n);
		int n1;
		x = n%1;
		if (x<0.5d) x = 0; else x = 1;
		n1 = (int) (n+x);
		n = n-n%1+x;
		System.out.println("Округление до ближайшего целого будет n':\t" + n1);
		System.out.println("Округление до ближайшего целого будет n'(2вар.):" + n);
	}
}