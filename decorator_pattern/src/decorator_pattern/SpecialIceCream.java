package decorator_pattern;

public class SpecialIceCream implements Chain {

	Chain nextProcess = null;
	@Override
	public void setNextProcess(Chain c) {
		// TODO Auto-generated method stub
		nextProcess = c;

	}

	@Override
	public void process(int price) {
		
			System.out.println("Here is your special ice cream");
	}
		


}
