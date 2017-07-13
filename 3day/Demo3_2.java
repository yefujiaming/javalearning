
public class Demo3_2
{
	static int i=1;
	static
	{
		//该静态区域块只被执行一次
		//与对象是否创建无关
		System.out.println("a");
		i++;
	}
	public Demo3_2()
	{
		i++;
	}
	public static void main(String[] args) {
		Demo3_2 t1=new Demo3_2();
		System.out.println(t1.i);

		Demo3_2 t2=new Demo3_2();
		System.out.println(t2.i);
	}
}