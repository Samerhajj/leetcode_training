#include<stdio.h>


int mySqrt(int x);
int main()
{

	printf("%d",mySqrt(15));
	return 0;
}

int mySqrt(int x)
{
	int i=1;
	int count=0;
	for (int i=1;i<=x;i+=2)
	{
		x-=i;
		
		count+=1;
	}
	return count;
}