
public class prj_03 {

	public static void main(String[] args) {
		String str1= "IT CookBook �Դϴ�.";
		String str2= "10";
		String str3= "20";
		
		str1 = "Java �Դϴ�. ";
		
		System.out.printf("%s \n", str1);
		System.out.printf("%s \n", str2 + str3);

		
		int num1 = Integer.parseInt(str2);
		int num2 = Integer.parseInt(str3);
		System.out.println("���ϱ� ��� : "+ (num1 + num2));
		System.out.println("���ϱ� ��� : "+ num1 + num2);
		
		System.out.println(num1 + num2);
	}

}