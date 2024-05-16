public class HelloNumbers {
	public static void main(String[] args){
		int x = 0;
		int count = 0;
		int num = 0;
		while (x < 10) {
			while (count < x) {
				num = num + 1;
				count = count + 1;
			}
			System.out.print(num + " ");
			count = 0;
			x = x + 1;
		}
	}
}