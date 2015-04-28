import java.util.*;

public class Mystack extends ArrayList<Object>{
	//to distinguish stack empty or not
	public boolean isEmpty(){
		return super.isEmpty();
	}
	//get stack size
	public int getSize(){
		return super.size();
	}
	//peek stack
	public Object peek(){
		return super.get(getSize() - 1);
	}
	//remove the last value first
	public Object pop(){
		Object o = super.get(getSize() - 1);
		super.remove(getSize() - 1);
		return o;
	}
	//add object
	public void push(Object o){
		super.add(o);
	}
	@Override
	public String toString(){
		return "stack" + super.toString();
	}
}
