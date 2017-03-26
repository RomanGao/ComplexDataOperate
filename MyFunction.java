package composite;

import java.awt.event.WindowFocusListener;

public class MyFunction {
	private double num;

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}
	public double mulityFun(double n)
	{
		if(n==1)
			return 1;
		else {
			 return n*mulityFun(n-1);
		}
		
		
	}
	public double addFun(double n)
	{
		if(n==1)
			return 1;
		else {
			return n+addFun(n-1);
		}
	}
	public void complexAddFun(MyData myData1,MyData myData2)
	{
		if(myData1.getImag()==0&&myData2.getImag()==0)
		{
			System.out.println(myData1.getDat()+"+"+myData2.getDat()+"="+myData1.getDat()+myData2.getDat());
		}
		else
		{
			System.out.println("("+myData1.getDat()+","+myData1.getImag()+")"+"+"+"("+myData2.getDat()+","+myData2.getImag()+")"+"="+"("+(myData1.getDat()+myData2.getDat())+","+(myData1.getImag()+myData2.getImag())+")");
		}
	}
	public void complexMulityFun(MyData myData1,MyData myData2)
	{
		if(myData1.getImag()==0&&myData2.getImag()==0)
		{
			System.out.println(myData1.getDat()+"*"+myData2.getDat()+"= "+myData1.getDat()*myData2.getDat());
		}
		else if(myData1.getDat()==0&&myData2.getDat()==0)
		{
			System.out.println(myData1.getImag()+"*"+myData2.getImag()+"= -"+myData1.getDat()*myData2.getDat());
		}
		else 
		{
			System.out.println(
					"("+myData1.getDat()+","+myData1.getImag()+")"+"*"+"("+myData2.getDat()+","+myData2.getImag()+")"+"="
			+"("+(myData1.getDat()*myData2.getDat()-myData1.getImag()*myData2.getImag())+","+(myData1.getImag()*myData2.getDat()+myData1.getDat()*myData2.getImag())+")"
					);
		}
	}
}
