

public class demo2
{
	public static void main(String[] args) {
		
		/*int a=90;int b=90;
		if(a==b||a>8){System.out.print("ok1");}
		b--;
		if(a>b && a>45){System.out.print("ok2");}
		if(!(a<=b)){System.out.print("ok3");}
		int a=12;

		if (a>18)
		{
			System.out.print("a>18");
		}else if(a>10&&a<=18){
			System.out.print("a>10&&a<=18");
		}else{
			System.out.print("others");
		}*/

		//根据用户输入判断是星期几 
		char c='a';

		switch(c)
		{
			case'a':
			System.out.println("今天星期一");
			int a=1;int b=4;int d=a+b;
			System.out.println(d);
			break;//break,表示跳出swich
			case'b':
			System.out.println("今天星期二");
			break;
			case'c':
			System.out.println("今天星期三");
			break;
			default:
			System.out.println("不知道");

		}
	}
}