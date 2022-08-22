#include <stdio.h>
#include <stdbool.h>
#define ln(x) log(x)
#include <math.h>

#define formatBool(b) ((b) ? "true" : "false")

bool isPowerOfTwo(int n);
int main()
{

	printf("%s",formatBool(isPowerOfTwo(6)));
	return 0;
}

bool isPowerOfTwo(int n)
{
	return (ln(n)-floor(ln(n)))==0;

}