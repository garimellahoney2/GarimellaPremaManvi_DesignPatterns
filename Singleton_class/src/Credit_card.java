
public class Credit_card {
	int x = 1;
static Credit_card obj = new Credit_card();
private Credit_card()//so we cannot call constructor
{
	
}
static Credit_card getInstance()
{
	return obj;
}
}
