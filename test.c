#include <stdio.h>

void main()
{
	
	int n,i,j,num;
	printf("Enter integer \n");
	scanf("%d",&n);
	int check =0;
	int array[2*n][2*n];
	int arrayTrans[2*n][2*n];
	num = n;
	for(i=0;i<2*n-1;i++)
	{
		for(j=0;j<2*n-1;j++)
		{
			if(num!=1&& check!=1)
			{
			array[i][j]=num;
			num--;
		}
			else if(num>0)
			{
				check=1;
				array[i][j]=num;
				num++;
			}

		}
		check=0;
		num--;
	}
	
	for(i=0;i<2*n-1;i++)
	{
		for (j=0;j<2*n-1;j++)
		{
			printf("%d ",array[i][j]);
		}
		printf("\n");
	}
	printf("\n*************************\n");
	/*transposing array*/
	for (i=0;i<2*n;i++)
	{
		for (j=0;j<2*n;j++)
		{
			arrayTrans[j][i]=array[i][j];
		}
	}
	for(i=0;i<2*n-1;i++)
	{
		for (j=0;j<2*n-1;j++)
		{
			printf("%d ",arrayTrans[i][j]);
		}
		printf("\n");
	}

}
