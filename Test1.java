//作者：傅家鸣
//时间：2017.7.1
//功能：循环

import java.io.*;
public class Test1
{
	public static void main(String[] args)throws Exception
    {
	   /*String str;
	   int a;
	   BufferedReader buf;	

	   buf =new BufferedReader(new InputStreamReader(System.in));
	   str =buf.readLine();
	   a =Integer.parseInt(str);
	   switch(a)//switch中可用的数据类型主要是：允许byte，short,int,char,enum等
	   {
	   	case a<=100&&a>=90:System.out.println("优");break;
	   	case a<90&&a>=80:System.out.println("良");break;
	   	case a<80&&a>=70:System.out.println("中");break;
	   	case a<70&&a>=60:System.out.println("及格");break;
	   	case a<60&&a>=0:System.out.println("不合格");break;
	   	default:System.out.println("input error");break;*/

	   	for(int i=0;i<10;i++)
	   	{
	   	System.out.println("你好，我是刘德华！");
	    }

	    int a=0;
	    while(a<10)
	    {
	    	System.out.println(a);
	    	a++;
	    }

	    int b=9;
	    do{
	    	System.out.println(b);
	    	b--;
	    }while(b>=0);
	}
}