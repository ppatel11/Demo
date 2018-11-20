package session_1;

public class Session_1 {
	public static int SetBits(int n){
		int count=0;
		while(n>0){
			count+=n & 1;
			n>>=1;
		}
		return count;
	}
	
	public static int FlippedBits(int a, int b){
		return SetBits(a^b);
	}
	
	
	public static void main(String[] args) {
		int x=80;
		int y=85;
		System.out.println(FlippedBits(x, y));
	
	
	
}
}