package Task;

public class Task91 {  
	public static void main (String[] args) {
		float [] czislo = {3.00f, 2.25f, 5.0f, 10.10f, 7.00f, 125.00f, 16.00f};
		for (int i = czislo.length-1; i>=0; i--)
		if (czislo[i]%1 == 0) System.out.println(czislo[i] + "\t - �� ����� ������������ �����,"); else System.out.println(czislo[i]+"\t - ����� ������������ �����,");
		System.out.println("���������� ����������� �����: " + czislo.length); // ������������� � �������
	}
}