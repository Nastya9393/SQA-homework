package Task;

public class Task10 {
	private static void czedo (float korW) {
		korW *= 1000; 	
		if (korW<0) 
			{korW = korW - korW%1; korW /= -1000; 
			System.out.println("корректировка к идеальному весу (кг): нужно сбросить " + korW);
			} 
			else 
				if (korW == 0) System.out.println("в корректировке нет необходимости");
					else {korW = korW - korW%1; korW /= 1000; 
						System.out.println("корректировка к идеальному весу (кг): нужно набрать " + korW);
			}
	}	
	public static void main (String[] args) {
		final float height, weight;
		float idealW, korW;
		height = 172.1f; weight = 82.1f;
		idealW = height - 110;
		idealW *= 100; idealW = idealW - idealW%1; idealW /= 100;
		korW = idealW - weight;
		System.out.println("идеальный вес (кг): " + idealW);
		System.out.println("при росте (см): " + height + " и собственном весе (кг): " + weight);
		czedo (korW);	
	}
}