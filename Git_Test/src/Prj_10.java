import java.util.Scanner;

public class Prj_10 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a;

		System.out.println(" 1 ~ 4중에 선택하세요 : ");
		a = s.nextInt();

		switch (a) {
		case 1:
			System.out.println(a + "을 선택했다");
			break;

		case 2:
			System.out.println(a + "를 선택했다");
			break;

		case 3:
			System.out.println(a + "을 선택했다");
			break;

		case 4:
			System.out.println(a + "을 선택했다");
			break;
		default:
			System.out.println("이상한 걸 선택했다.");
		}

	}

}
