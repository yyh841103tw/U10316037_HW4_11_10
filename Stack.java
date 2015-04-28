import java.util.*;

public class Stack{
	public static void main(String[] args){
		Mystack spirit = new Mystack();

 		Scanner input= new Scanner(System.in);
		Object a;
	System.out.print("Enter 5 object\n");
	for(int i = 1;i <= 5;i++){
		a = input.next();//read a value from the input
		spirit.push(a);//add the value to arraylist 
	}
	while(!spirit.isEmpty()){
		System.out.print(spirit.pop());//print out the pop() value if the arraylist is not empty 
	}
	
	}
}
