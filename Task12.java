package Task;

import java.util.Scanner;

public class Task12 {
    static int k1, nn1;
    static int [] p1 = {100, 60, 10, 1, 0};
    
    private static void searchLegkoVes(int a){
        if (a*k1%100<50) nn1 = a*k1/100; else nn1 = a*k1/100+1;
    }
    
    private static void doOsnUsl(){
    int i=0;
    do 	{
        searchLegkoVes(p1[i]);
        System.out.println("\n\n�������� � ����� (���.): " + k1 + ",\t\t������� �������� ����� 30 �� (%): " + p1[i]+", ������ ����� (���): "+ nn1 + ".");
        searchMilk(); searchPie(); i++;
        }
        while (i<p1.length);
	}
    
    private static void searchMilk(){
        int butliMilk;
        butliMilk = (int) ((int) nn1*0.2/0.9 + 1);
        if ((float)(0.9*butliMilk-nn1*0.2) == 0.9f) --butliMilk;
            System.out.println("������ ������ ���������� ��������� (�� �� 0,9 �): " + butliMilk + ", ��� ���� ��������� �� ������� (�): " + (float)(0.9*butliMilk-nn1*0.2) + ",");
    }
    
    private static void searchPie(){
        System.out.print("�������� ���������� ��������� (��): " + (nn1+k1) + ".\t ���������� ��������� ��������!\t\t Be Healthy!");
    }
    
    public static void main(String[] args){
        System.out.print("������� ���������� �������� � ����� (���): ");
        Scanner sc = new Scanner(System.in);
        k1 = sc.nextInt();
        sc.close();
        doOsnUsl();
	}
}