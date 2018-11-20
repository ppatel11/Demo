package coding;

import java.util.HashSet;
import java.util.Set;

public class CountAbsPair {
	public static int count(int [] a, int d){
		
		int count=0;
		Set<Integer>set =new HashSet<>();
		for(int i :a){
			set.add(i);
			
		}
		for (int i:a){
			if(set.contains(i-d)){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int [] a={1,5,3,4,5,18,20};
		int d=2;
		System.out.println(count(a,d));
	}

}
