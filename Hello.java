//作者：傅家鸣
//功能：在控制台显示“hello”
//日期：2017.6.28

//public：表示这个类是公共的，一个java文件中只能有一个public
//class：表示这是一个类
//hello:类名（公共类类名必须和文件名一致）

public class Hello
{
	//一个主函数，相当于程序的入口
    public static void main(String[] args) {
    	//执行语句
		//System.out.println("hello!");

/*多行注释*/
	/*	int a=10;//定义一个变量，变量名a，它的值是10
		int b=20;//
		int result=a+b;
		//输出结果
		System.out.println("结果是"+result);

		byte byte1=128;*/
		//char char1='q';//不能放两个字符
		//System.out.println(char1);

	//	char test1='a'+'b';
	//	System.out.println(test1);

		//int a =23;
		//a = 45;

		//	System.out.println("a="+a);

		//这样就违背了，数据从高精度到低精度的原则
		//byte<short<int<long<float<double
		//在java中小数默认为double
		//int a=1.2;
		//double a =3;
		//float a=3.4f;
		//System.out.println(a);
		int a=(int)1.2;
		int b=(int)1.9;
		System.out.println("a="+a+"b="+b);
		


	}
}