package composite;

public class Oparete {

	public static void main(String[] args) {
		MyData myData=new MyData(10);
		MyFunction myFunction=new MyFunction();
		myFunction.setNum(myData.getDat());
		System.out.println("¿€º”£∫"+myFunction.addFun(myData.getDat()));
		System.out.println("¿€≥À£∫"+myFunction.mulityFun(myData.getDat()));
		
		MyData myData1=new MyData(2,5);
		MyData myData2=new MyData(4, -3);
		
		myFunction.complexAddFun(myData1, myData2);
		myFunction.complexMulityFun(myData1, myData2);
		
	}

}
