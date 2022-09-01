#include<stdio.h>

#define stringSize 40

int main()
{

	int number =100;
	for (int i=1;i<=number;i++)
	{
		if(i%15==0)
		{
			printf("fizzbuzz\n");
		}
		else if(i%3 ==0)
		{
			printf("fizz\n");
		}
		else if(i%5==0)
		{
			printf("buzz\n");
		}
		else{
			printf("%d\n",i);
		}
	}
	return 0;
}