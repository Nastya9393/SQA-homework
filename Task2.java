package Task;

import java.util.Scanner;

public class Task2 {
	public static void main (String[] args) {
		System.out.print("Введите натуральное трехзначное число X:\t");
		Scanner sc = new Scanner(System.in);
		int x;
			do {									//проверка на трехзначность числа
				x = sc.nextInt();
				if ((x<100) || (x>999)) System.out.print("\nВведите натуральное ТРЕХЗНАЧНОЕ число X:\t"); 
			}
			while ((x<100) || (x>999)); 
			sc.close();
			x = x/100+x%100/10+x%10;
			System.out.println("\nРезультат =>\n\tсумма цифр числа X:\t" + x + "\n\n! Вычисления закончены !");
	}
}