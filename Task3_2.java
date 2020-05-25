package Task3_1;
//С клавиатуры вводится время (количество часов от 0 до 24) – программа выводит приветствие, соответствующее
// введенному времени (например, ввели 15 часов – выводится приветствие «Добрый день»).

import java.util.Scanner;
public class Task3_2 {
	public static void main(String[] args) {
		System.out.print("Введите сколько сейчас часов ");
		Scanner hours = new Scanner(System.in);
		int a = hours.nextInt();
		hours.close();
		System.out.print(a);
		
	}
}
