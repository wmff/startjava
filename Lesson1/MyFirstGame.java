import java.util.Scanner;

public class MyFirstGame {	
	public static void main(String[] args) {
		int num;
		int rand = (int)(System.currentTimeMillis()%100)+1;
		Scanner scanNum = new Scanner(System.in);
		System.out.print("������ ����� �� 1 �� 100: ");
		while(true) {
			num = scanNum.nextInt();
			if (num > rand) {
				System.out.println("��������� ���� ����� ������ ����, ��� ������� ���������");
			} else if (num < rand) {
				System.out.println("��������� ���� ����� ������ ����, ��� ������� ���������");
			} else if (num == rand) {
				System.out.println("�� �������!");
				break;
			}
		}
	}
}