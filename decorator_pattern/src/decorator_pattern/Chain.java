package decorator_pattern;

public interface Chain {
public void process(int price);
public void setNextProcess(Chain c);
}
