package firstProject.test;

public class Hello9 {

	public static void main(String[] args) {
		int arr[][] = new int[2][3];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		int arr2[][] = {
				{1,2},
				{4,5,6}
		};
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.printf("arr2[%d][%d]: %d\n", i,j,arr2[i][j]);
			}
		}
	}

}
