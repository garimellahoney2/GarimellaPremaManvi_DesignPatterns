package decorator_pattern;

import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) {
		Chain ordinary = new OrdinaryIceCream();
		Chain chocolate = new ChocolateIceCream();
		Chain special = new SpecialIceCream();
		// TODO Auto-generated method stub
		ordinary.setNextProcess(new ChocolateIceCream());
		chocolate.setNextProcess(new SpecialIceCream());
		while(true)
		{
			System.out.println("enter choice");
			System.out.println("1)to enter price");
			System.out.println("2)to exit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if(choice==1)
			{
				System.out.println("price");
				int  price = sc.nextInt();
				ordinary.process(price);
			}
			else
			{
				break;
			}
		}

	}

}
