
public class Demo3_2
{
	/*static int i=1;
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
	}*/
	public static void main(String[] args) 
	{
		/*Demo3_2 t1=new Demo3_2();
		System.out.println(t1.i);

		Demo3_2 t2=new Demo3_2();
		System.out.println(t2.i);*/
		//创建一个学生
		/*Stu stu1=new Stu(29,"aa",340);
		Stu stu2=new Stu(39,"bb",340);
		System.out.println(Stu.getTotalFee());*/

		Clerk clerk1=new Clerk("小花",24,4567.6f);
		System.out.println("名字是"+clerk1.name);

	}
}

//职员类
class Clerk
{
	public String name;
	private int age;
	private float salary;
	public Clerk(String name,int age,float sal)
	{
		this.name=name;
		this.age=age;
		this.salary=sal;

	}
	//通过一个成员方法去控制和访问私有属性
	public float getSal()
	{
		return this.salary; 
	}
}

class Stu
{
	int age;
	String name;
	int fee;
	static int totalFee;

	public Stu(int age,String name,int fee)
	{
		this.age=age;
		this.name=name;
		totalFee+=fee;
	}

	//返回总学费[这是一个类方法(静态方法)]
	//java中规则：类变量原则上用类方法去访问
	public static int getTotalFee()
	{
		return totalFee;
	}
}