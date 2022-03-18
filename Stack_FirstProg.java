import java.util.Stack;

//import java.util.stack;
public class Stack_FirstProg
{
	public static void main(String args[])
	{
		Stack<Integer> stack=new Stack();
		stack.push(12);
		stack.push(24);
		stack.push(36);
		int popped=stack.pop();
		System.out.println(popped);
		int peeked=stack.peek();
		System.out.println(peeked);
	}
}
