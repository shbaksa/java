package method_ex;

import java.util.Scanner;

public class Hap3 {
	// a 부터 b까지의 합을 구하기
	// 매개변수 X 리턴값 O
	Scanner sc=new Scanner(System.in);
	int a,b,hap;
	
	public void input()
	{
		System.out.print("a의 값을 입력하세요 : ");
		a=sc.nextInt(); 
		System.out.print("b의 값을 입력하세요 : ");
		b=sc.nextInt();		
	}
	public void cal()
	{
		if(a<b)
		{
		for(int i=a;i<=b;i++)
		{
			hap+=i;
		}
		}
		else
		{
			for(int i=b;i<=a;i++)
			{
				hap+=i;
			}
		}
		
	}
	public int output()
	{
		return hap;		
	}
	

}