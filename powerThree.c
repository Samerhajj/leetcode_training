#include <stdio.h>
#include <stdbool.h>
bool isPowerOfThree(int n);
#include <math.h>

#define formatBool(b) ((b) ? "true" : "false")

int main()
{
	printf("%s",formatBool(isPowerOfThree(9)));	
	return 0;
}



bool isPowerOfThree(int n){
    return ((log10(n)/log10(3))-(floor(log10(n)/log10(3))))==0;

}