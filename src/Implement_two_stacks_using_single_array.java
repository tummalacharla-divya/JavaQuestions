
public class Implement_two_stacks_using_single_array {
	int size;
	int top1,top2;
	int arr[];
	public Implement_two_stacks_using_single_array(int size) {
		this.size=size;
		arr=new int[size];
		top1=-1;
		top2=size;
	}
	private void push1(int x) {
		if(top1<top2) {
			top1++;
			arr[top1]=x;
			System.out.println("push element into the stack1="+x);
		}
		else{
			System.out.println("stack overflow");
			System.exit(1);
			
		}
	}
	private void push2(int x) {
		if(top1<top2-1) {
			top2--;
			arr[top2]=x;
			System.out.println("push element into the stack2="+x);
		}
		else{
			System.out.println("stack overflow");
			System.exit(1);
			
		}
	}
	private int pop1() {
		if(top1>=0) {
			int x=arr[top1];
			System.out.println("popped element="+x);
			top1--;
			return x;
		}else {
			System.out.println("stack underflow");
			System.exit(1);
		}
		return 0;
		
	}
	private int pop2() {
		if(top2<size) {
			int x=arr[top2];
			System.out.println("popped element="+x);
			top2--;
			return x;
		}else {
			System.out.println("stack underflow");
			System.exit(1);
		}
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implement_two_stacks_using_single_array s=new Implement_two_stacks_using_single_array(10);
		s.push1(10);
		s.push1(20);
		s.push1(30);
		s.pop1();
		s.push2(40);
		s.push2(50);
		s.push2(60);
		s.pop2();

	}

}
