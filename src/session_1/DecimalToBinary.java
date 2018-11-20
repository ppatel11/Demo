package session_1;

public class DecimalToBinary {
	
	
	public static void main(String[] args) {
		 int n=357;
		System.out.println(convert(n));
		
	}
	
	

	public  static    void convert(int number){
		int binary[]=new int[100];
		int index=0;
		while(number>0){
			binary[index++]=number%2;
			number=number/2;	
		}
		for(int i=index-1;i>=0;i--){
			System.out.println(binary[i]);
		}
	}

}
