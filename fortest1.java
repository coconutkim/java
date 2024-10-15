// package fortest;

public class fortest1{
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			sum+=i;//sum=sum+i;
		}
		System.out.println("sum of 1~5");
		System.out.println("sum of 1~5:%d\n");
	}
}

// fortest1에 오류가 나면
// java의 파일명을 class와 동일하게 한다