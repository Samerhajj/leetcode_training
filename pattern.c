#include <stdio.h>

void printPattern(int num,int lines);
int main()
{
	printPattern(3,3);
	return 0;

}	
void printPattern(int num,int lines)
{
	int i,j,gapline=1;

	for (i=0;i<lines;i++)
	{
		for (j=0;j<gapline;j++)
		{
			printf("%d ",num+j);

		}
		gapline*=2;
		num=num*2;
		printf("\n");
	}
	
}