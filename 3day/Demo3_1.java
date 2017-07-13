/*
作者：傅家鸣
时间：2017.7.5
功能：this的必要性
*/

public class Demo3_1
{
	public static void main(String[] args) {
		/*Dog dog1=new Dog(2,"大黄");
		Person p1=new Person(dog1,23,"郭德纲");
		Person p2=new Person(dog1,24,"刘谦");
		p1.showinfo();
		p1.dog.showinfo();*/
		//int total=0;
		Child ch1=new Child(2,"妞妞");
		ch1.joinGame();
		//total++;
		Child ch2=new Child(4,"小小");
		ch1.joinGame();
		//total++;
		System.out.println("G共有＝"+ch1.total);

	}
}

// 定义小孩类
class Child
{
	int age;
	String name;
	//total是静态变量，被任何一个对象访问
	static int total=0;
	public Child(int age,String name)
	{
		this.age=age;
		this.name=name;

	}
	public void joinGame()
	{
		total++;
		System.out.println("有一个小孩加入了！");
	}
}
//定义一个人类
class Person
{
	//成员变量
	int age;
	String name;
	Dog dog;
	public Person(Dog dog,int age,String name)
	{
		//可读性不好
		//this是属于对象，不是属于类的
		this.age=age;
		this.name=name;
		this.dog=dog;
	}
	//显示人名
	public void showinfo()
	{
		System.out.println("人名是："+name);
	}
}
class Dog
{
	int age;
	String name;
	public Dog(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	//显示狗名
	public void showinfo()
	{
		System.out.println("狗名叫"+this.name);
	}
}
