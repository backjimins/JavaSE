package day03.operator;

import javax.swing.plaf.multi.MultiButtonUI;

/*
 *  [[������(Operator)]]
 *  ���α׷����� �����͸� ó���Ͽ� �����ϴ°��� ����(operation)
 *  ���꿡 ���Ǵ� ǥ�ó� ��ȣ�� ������(Operator)��� �Ѵ�.
 *  
 * 1. ���������
 * 		+, -, *, /, %
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		//�μ��� ���� ���ؼ� sum�̶�� int�� ������ ����
		// �μ����� = ���� + ����
		int sum = num1 + num2;
		System.out.println("sum :" + sum);
		
		// ���� + ���ڿ��� ���ڿ��̴�.
		// ���ڿ� + �� ���Ῥ�����̴�.
		String result = num1+"+"+num2+"="+sum;
		System.out.println(result);
		
		int multiply = num1 * num2;
		System.out.println("multiply : " + multiply);
		
		//������
		int divide = 10/3;
		System.out.println("10/3 =" + divide);
		
		int divide2 = num1 / num2;
		System.out.println("num1 / num2 = "+ divide2);
		
		// 9�� 5�� ���� �������� resultNum�� ����
		int resultNum = 9 % 5;
		System.out.println("9 % 5 = " + resultNum);
		
		// �Ǽ� ��� �ε��Ҽ� ���� ����!!
		double resultDouble = 10/3.0;
		System.out.println("10 / 3.0 = " + resultDouble);
		
		
		
	}
}
