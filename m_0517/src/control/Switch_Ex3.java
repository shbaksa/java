package control;

import java.util.Scanner;

public class Switch_Ex3 {

	public static void main(String[] args) {
		// 극장에 A석, B석, C석, D석이 있다고 하자
		// A석부터가 잘 보이는 자리라고 할때 연령때에 따라서 자리를 배치하는 프로그램 만들기
		// 나이를 입력받아서 20미만이면 A석, 20이상 30미만이면 B석
		// 30이상 40미만이면 C석, 나머지는 D석으로 출력하기
				
		Scanner sc=new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age=sc.nextInt();
				
		if(age<20)
		{
			System.out.println("A석입니다");
		}
		else if(age<30)
		{
			System.out.println("B석입니다");
		}				
		else if(age<40)
		{
			System.out.println("C석입니다");
		}				
		else 
		{
			System.out.println("D석입니다");
		}
		
		//switch
		int chk=age/10;
		//20미만 > 0, 1
		//20~30미만 > 2
		//30~40미만 > 3
		//
		switch(chk)
		{
			case 0,1: System.out.println("A석입니다"); break;
			case 2: System.out.println("B석입니다"); break;
			case 3: System.out.println("C석입니다"); break;
			default : System.out.println("D석입니다"); break;
		}
	}

}