package Task3_1;
//� ���������� �������� ����� (���������� ����� �� 0 �� 24) � ��������� ������� �����������, ���������������
// ���������� ������� (��������, ����� 15 ����� � ��������� ����������� ������� �����).

import java.util.Scanner;
public class Task3_2 {
	public static void main(String[] args) {
		System.out.print("������� ������� ������ ����� ");
		Scanner hours = new Scanner(System.in);
		int a = hours.nextInt();
		hours.close();
		System.out.print(a);
		
	}
}
