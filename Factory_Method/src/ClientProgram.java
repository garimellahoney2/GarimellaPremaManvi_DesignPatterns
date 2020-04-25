import java.util.Scanner;

public class ClientProgram {
public static void main(String args[])
{
	SpecializationFactory sf = new SpecializationFactory();
System.out.println("enter choice 1)ArtificialIntelligence 2)CloudComputing");
Scanner sc = new Scanner(System.in);
int choice = sc.nextInt();
Specialization s = sf.getShape(choice);
s.noOfCredits();
}
}
