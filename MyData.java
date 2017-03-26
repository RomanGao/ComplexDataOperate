package composite;

public class MyData {
	private double dat;
	private double imag;
	public MyData()
	{
		dat=0;
		imag=0;
	}
	public MyData(int d)
	{
		dat=d;
	}
	
	public MyData(double dat, double imag) {
		super();
		this.dat = dat;
		this.imag = imag;
	}
	
	public MyData getData()
	{
		return new MyData(dat, imag);
	}
	public double getDat() {
		return dat;
	}
	
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	public void setDat(double dat) {
		this.dat = dat;
	}
}
