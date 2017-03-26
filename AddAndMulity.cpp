// de.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include<iostream>
using namespace std;
class Complex
{
public:
	Complex(){ real = 0; imag = 0; }
	Complex(double r, double i)
	{
		real = r;
		imag = i;
	}

	friend Complex operator+(Complex &c1, Complex &c2);
	friend Complex operator*(Complex &c1, Complex &c2);
	void display();
private:
	double real;
	double imag;
};

Complex operator+(Complex &c1, Complex &c2)
{
	return Complex(c1.real + c2.real, c1.imag + c2.imag);
}
Complex operator*(Complex &c1, Complex &c2)
{
	Complex c3;
	c3.real = c1.real*c2.real - c1.imag*c2.imag;
	c3.imag = c1.real*c2.imag + c1.imag*c2.real;
	return c3;
}

void Complex::display()
{
	if (imag>0)
	cout << "(" << real << "+" << imag << "i)" << endl;
	else if (imag == 0)
	{
		cout << "(" << real<<")" << endl;
	}
	else if (imag < 0)
	{
		cout << "(" << real << imag << "i)" << endl;
	}
}
int main()
{
	Complex c1(3, -2), c2(4, -3), c3;
	c3 = c1 + c2;
	cout << "c1+c2=";
	c3.display();
	cout << endl;
	cout << "c1*c2=";
	c3 = c1*c2;
	c3.display();

	system("pause");
	return 0;
}
