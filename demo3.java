/*
作者：傅家鸣
时间：2017.7.1
功能：打出金字塔
*/


public class demo3
{
	public static void main(String[] args) 
	{
		//死去活来法－>打四层
		int lay=9;
					//表示有多少层
		for(int i=1;i<=lay;i++)
		{
			//找出空格规律
			//1->3
			for(int k=1;k<=lay-i;k++)
			{
				System.out.print(" ");
			}

            //打印＊
            for(int j=1;j<=2*i-1;j++)
            {
            	//判断该层是否是顶层或者是底层
            	if (i==1||i==lay)
            	{
                 System.out.print("*");
            	}
            	else
            	{
            		if (j==1||j==(i-1)*2+1) 
            		{
            			System.out.print("*");
            		}
            		else{
            			System.out.print(" ");
            		}
            	}
		    }
         //打出一个换行
		    System.out.println();
		}


	}
}