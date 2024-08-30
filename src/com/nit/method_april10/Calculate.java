package com.nit.method_april10;
public class Calculate {
public static int squareAndCube(int n)
{
	if(n<=0)
	{
		return(-1);
	}
	else if(n%2==0)
	{
		return n*n;
	}
	else return n*n*n;
}
}

