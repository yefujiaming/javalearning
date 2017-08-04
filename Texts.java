/*2017.8.3
f
计算*/
public class Texts
{
	public static void main(String[] args) 
	{
		Xiaoxueshen s1=new Xiaoxueshen();
		s1.minus();


	}
}
class Xiaoxueshen
{
	int x;
	int y;
	int t=2;
	//9x-9y=t
	//x,y<10,x,y!=0
	public void minus()
	{
		for(x=1;y<9;x++)
			{
				y=x+t;
				System.out.println("算式为"+y+x+"~"+x+y);
			}
		
	}
}