import java.util.Scanner;

public class Prj_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;

		System.out.println("점수를 입력하세요");
		a = s.nextInt();

		if (a >= 90)
			System.out.println("A" + "학점입니다.");
		else 
			if (a >= 80)
			System.out.println("B");
		else 
			if (a >= 70)
			System.out.println("C");
		else 
			if (a >= 60)
			System.out.println("D");
		else
			System.out.println("F");

		System.out.println("학점 입니다.");

	}

}