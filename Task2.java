package Task;

import java.util.Scanner;

public class Task2 {
	public static void main (String[] args) {
		System.out.print("������� ����������� ����������� ����� X:\t");
		Scanner sc = new Scanner(System.in);
		int x;
			do {									//�������� �� ������������� �����
				x = sc.nextInt();
				if ((x<100) || (x>999)) System.out.print("\n������� ����������� ����������� ����� X:\t"); 
			}
			while ((x<100) || (x>999)); 
			sc.close();
			x = x/100+x%100/10+x%10;
			System.out.println("\n��������� =>\n\t����� ���� ����� X:\t" + x + "\n\n! ���������� ��������� !");
	}
}