
public class Stock_buy_and_sell_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,40,80,90}; // if nuying value is greater than selling value than loss occurs ex:{200,10,20,30,90}
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]-min>max) {
				max=arr[i]-min;
			}
		}
		System.out.println("max profit is: "+max);
	}

}
