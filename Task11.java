package Task;

import java.util.Scanner;

public class Task11 {
	public static void EqMC (int a){
		int d, h, m, s;
		m=a/60; s=a-60*m; h = m/60; m = m - 60*h; d = h/24; h = h - 24*d;
		System.out.println("Осталось " + d + " дня(ей) " + h + " часа(ов) "+ m +" минут(а) " + s +" секунд(ы)." );
	}
	public static void main(String[] args) {
		System.out.print("Введите количество секунд до Нового года:\t");
		Scanner hmMC = new Scanner(System.in);
		int a = hmMC.nextInt();
		hmMC.close();
		EqMC(a);
		System.out.println("Вcе ожидаем Деда Мороза и Снегурочку!");
	}
}
