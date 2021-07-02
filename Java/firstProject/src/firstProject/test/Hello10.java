package firstProject.test;

public class Hello10 {

	public static void main(String[] args) {
		int array[] = makeArray();
		array[2] = 30;
		array[3] = 40;
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
	public static int[] makeArray() {
		int temp[] = new int[4];
		temp[0] = 10;
		temp[1] = 20;
		return temp;
	}
}
