
public class ForPractice {
	public static void main(String[] args) {
		outer: for (int i = 1; i <= 5; i++) {
			System.out.println("OuterLoop" + i);
			inner: for(int j = 1; j <= 6; j++) {
				System.out.print(j + " ");
				if(j == 3) {
					break inner;
				}
			}
		}
	}
}
