#define ln(x) log(x)
#include <stdio.h>
#include <math.h>
#include <stdbool.h>
bool isPowerOfFour(int n);
#define formatBool(b) ((b) ? "true" : "false")


int main()
{

	printf("%s",formatBool(isPowerOfFour(4)));

	return 0;
}


bool isPowerOfFour(int n){

	if( n <0)
	{
		return false;
	}
	int i;
	float test;
	test = ln(n)/ln(4);
	if(pow(4,test) == n)
	{
		return true;
	}
	return false;
}