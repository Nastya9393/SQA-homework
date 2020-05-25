package Task3_1;
// Написать программу, которая предлагает пользователю ввести c клавиатуры номер дня недели, и в ответ 
// показывает название этого дня (например, 6 – это суббота). Решить с использованием switch.

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		System.out.print("Введите число дня недели: ");
		Scanner sc = new Scanner(System.in);
		int nd = sc.nextInt();
		sc.close();
		System.out.print("Это будет " + nd);
	}

}
