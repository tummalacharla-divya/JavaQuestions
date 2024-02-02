import java.util.Stack;

public class Stack_implementation_using_array {

	
		// TODO Auto-generated method stub
	int arr[]=new int[5];
	int top=0;
	private void push(int x) {
		top++;
		arr[top]=x;
		System.out.println("element pushed in to stack="+x);
			
	}
	private int pop() {
		int x=arr[top--];
		System.out.println("element popped from stack="+x);
		return x;
	}
	private int peek() {
		return arr[top];
	}
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.pop();
	
	}

}
