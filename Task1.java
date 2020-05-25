package Task;

import java.util.Scanner;
	public class Task1 {
		public static void main(String[] args){
			System.out.print("Введите натуральное число X:\t");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt(); 
			System.out.print("введите натуральное число Y:\t");
			int y = sc.nextInt();
			sc.close();
			System.out.println("\nРезультаты =>\n\tцелоцисленное деление X на Y:\t" + x/y);
			System.out.println("\tостаток от деления X на Y:\t" + x%y);
			System.out.println("\tквадратный корень X:\t\t" + Math.sqrt(x) + "\n\n! Вычисления закончены !");
		}
}