package Task;

public class Task10 {
	private static void czedo (float korW) {
		korW *= 1000; 	
		if (korW<0) 
			{korW = korW - korW%1; korW /= -1000; 
			System.out.println("������������� � ���������� ���� (��): ����� �������� " + korW);
			} 
			else 
				if (korW == 0) System.out.println("� ������������� ��� �������������");
					else {korW = korW - korW%1; korW /= 1000; 
						System.out.println("������������� � ���������� ���� (��): ����� ������� " + korW);
			}
	}	
	public static void main (String[] args) {
		final float height, weight;
		float idealW, korW;
		height = 172.1f; weight = 82.1f;
		idealW = height - 110;
		idealW *= 100; idealW = idealW - idealW%1; idealW /= 100;
		korW = idealW - weight;
		System.out.println("��������� ��� (��): " + idealW);
		System.out.println("��� ����� (��): " + height + " � ����������� ���� (��): " + weight);
		czedo (korW);	
	}
}