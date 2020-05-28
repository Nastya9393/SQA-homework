package Task;

/*Ученикам первого класса дают 1 пирожок. Если вес первоклассника менее 30 кг, 
 дополнительно дают 1 стакан молока и ещё 1 пирожок. В первых классах школы учится n
учеников. Стакан молока имеет емкость 200 мл, а упаковка молока – 0,9 л. Написать программу, 
которая определит количество пакетов молока и пирожков, необходимых каждый день для условий:
■ если в школе 100% всех учеников, у которых вес меньше 30 кг;
■ если в школе 60% учеников имеют вес меньше 30 кг.
■ если в школе 1% учеников имеют вес меньше 30 кг.
(!!!) Учесть, что нельзя купить два с половиной пакета молока; можно купить два или три.
*/

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
        System.out.println("\n\nУчеников в школе (чел.): " + k1 + ",\t\tпроцент учеников легче 30 кг (%): " + p1[i]+", значит таких (чел): "+ nn1 + ".");
        searchMilk(); searchPie(); i++;
        }
        while (i<p1.length);
	}
    
    private static void searchMilk(){
        int butliMilk;
        butliMilk = (int) ((int) nn1*0.2/0.9 + 1);
        if ((float)(0.9*butliMilk-nn1*0.2) == 0.9f) --butliMilk;
            System.out.println("Бутлей молока необходимо ежедневно (ед по 0,9 л): " + butliMilk + ", при этом останется на добавку (л): " + (float)(0.9*butliMilk-nn1*0.2) + ",");
    }
    
    private static void searchPie(){
        System.out.print("пирожков необходимо ежедневно (шт): " + (nn1+k1) + ".\t Школьникам приятного аппетита!\t\t Be Healthy!");
    }
    
    public static void main(String[] args){
        System.out.print("Введите количество учеников в школе (чел): ");
        Scanner sc = new Scanner(System.in);
        k1 = sc.nextInt();
        sc.close();
        doOsnUsl();
	}
}