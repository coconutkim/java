public class array3 {
    public static void main(String[] args) {
		int[] num= {5,4,3,2,1};
		System.out.println("정렬 전 배열값");
		
		for(int i=0;i<num.length;i++)
			System.out.print(num[i]+"\t");

        for(int i=0;i<num.length;i++){
            for(int j=0;j>num.length;j++){
                if(num[i]>num[j]){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("정렬 후 배열값");
        for(int i=0;i<num.length;i++)
            System.out.print(num[i]+"\t");
	}
}

// System.out.println(): 출력 후 줄 바꿈이 자동으로 발생합니다.
// System.out.print(): 출력 후 줄 바꿈 없이 계속 같은 줄에 출력합니다.