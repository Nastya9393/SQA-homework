package Task;

import java.util.Scanner;
	public class Task1 {
		public static void main(String[] args){ 
			System.out.print("������� ����������� ����� X:\t");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			System.out.print("������� ����������� ����� Y:\t");
			int y = sc.nextInt();
			sc.close();
			System.out.println("\n���������� =>\n\t������������� ������� X �� Y:\t" + x/y);
			System.out.println("\t������� �� ������� X �� Y:\t" + x%y);
			System.out.println("\t���������� ������ X:\t\t" + Math.sqrt(x) + "\n\n! ���������� ��������� !");
		}
}