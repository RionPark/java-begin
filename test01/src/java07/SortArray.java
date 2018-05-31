package java07;

public class SortArray {

	public static void main(String[] args) {
		int[] ranNums = new int[10];
		for(int i=0;i<ranNums.length;i++) {
			ranNums[i] = (int) (Math.random()*10)+1;
			for(int j=i-1;j>=0;j--) {
				if(ranNums[i]==ranNums[j]) {
					i--;
					continue;
				}
			}
		}
		
		for(int i=0;i<ranNums.length;i++) {
			for(int j=i+1;j<ranNums.length;j++) {
				if(ranNums[i] > ranNums[j]) {
					int tmp = ranNums[i];
					ranNums[i] = ranNums[j];
					ranNums[j] = tmp;
				}
			}
		}
		
		for(int i=0;i<ranNums.length;i++) {
			System.out.println("ranNums[ " + i + " ] : " + ranNums[i]);
		}
	}
}
