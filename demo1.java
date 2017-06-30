  /*
  作者：傅家鸣
  日期：2017.6.30
  功能：比较两个数大小
  */
  import java.io.*;
  public class demo1
  {
  	public static void main(String[] args) 
  	{
  		/*int a=2;
  		int b=4;
  		if(b%a==0)
  		{
  			System.out.println("可以整除");
  		}else{
  					System.out.println("不可以整除！");
  		}
  		int a=3;
  		int b=6;
  		System.out.println(b);*/

  		try{
  			//输入流，从键盘接受数
  			InputStreamReader isr=new InputStreamReader(System.in);
  			BufferedReader br=new BufferedReader(isr);
  			//给出提示
  			System.out.println("请输入第一个数");
  			//从控制台读取一行数据
  			String a1=br.readLine();

  			System.out.println("请输入第二个数");
  			String a2=br.readLine();

  			//把string转换为flout
  			float num1=Float.parseFloat(a1);
  			float num2=Float.parseFloat(a2);

  			if (num1>num2) {
  				System.out.println("第一个大");
  			}
  			if (num1==num2) {
  				System.out.println("相等");
  			}
  			if (num1<num2) {
  				System.out.println("第二个大");
  			}


  		}catch(Exception e)
  		{
  			e.printStackTrace();
  		}
  	}
  }