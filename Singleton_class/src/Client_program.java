
public class Client_program {
public static void main(String args[])
{
	Credit_card AxisAtmCard = Credit_card.getInstance();
	Credit_card StateAtmCard = Credit_card.getInstance();
	AxisAtmCard.x = 2;
	System.out.println(StateAtmCard.x);
}
}
