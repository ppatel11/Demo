package coding;

public class CountAbsForLoop {
	public static void main(String[] args) {
		int [] a={1,5,3,4,5,18,20};
		int d=2;
		
		
		//System.out.println(count(a,d));
	}
	public static int count(int[] a,int d){
	
		int cnt=0;
		
		int size=a.length;
		
		for(int i=0;i<size-1;i++){
			for (int j=i;j<size-1;j++){
				if((a[i]-a[j])==d){
					cnt++;
				}
			}
		}
		return cnt;
	}

	
	
}
