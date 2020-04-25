package decorator_pattern;

public class ChocolateIceCream implements Chain {

	Chain nextProcess = null;
	@Override
	public void setNextProcess(Chain c) {
		// TODO Auto-generated method stub
		nextProcess = c;

	}

	@Override
	public void process(int price) {
		if(price>=500&&price<1000)
			System.out.println("Here is your chocolate ice cream");
		else
			nextProcess.process(price);
	}
		


}
