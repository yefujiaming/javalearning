/*
作者：傅家鸣
日期：2017.7.3
功能：一个可以算数的机器人
*/
import java.io.*;
public class Demo4
{
	public static void main(String[] args) 
	{
	 try{
			Robot r1=new Robot();
			r1.name="小茗";
			r1.age=1;
			r1.nation="China";
			r1.writer="傅家鸣";
			//调用speak方法
			r1.speak();
			//调用可以传入参数的计算方法
			InputStreamReader isr=new InputStreamReader(System.in);
  			BufferedReader br=new BufferedReader(isr);
  			for (; ; ) 
  			{
  				//给出提示
  				System.out.println("第一个数:");
  				//从控制台读取第一行数据
  				String a1=br.readLine();
  				System.out.println("第二个数:");
  				//从控制台读取第二行数据
  				String a2=br.readLine();
  				//把string转换为flout
  				float num1=Float.parseFloat(a1);
  				float num2=Float.parseFloat(a2);
				r1.add(num1,num2);
	    	}
	    }catch(Exception e)
  		{
  			e.printStackTrace();
  		}

	}
}
//定义一个类
class Robot
{
	int age;
	String name;
	String nation;
	String writer;
	//方法
	public void speak()
	{
		System.out.println("您好，我是一个对象。我能计算出两数相加的和。^_^");
	}
	//计算两个数之和
	public void add(float num1,float num2)
	{
		float result=0;
		result=num1+num2;
		System.out.println("结果为："+result);
		System.out.print("还需要帮忙吗？");		
	}

}
