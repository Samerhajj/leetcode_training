#include <stdio.h>
#include <stdbool.h>
#define formatBool(b) ((b) ? "true" : "false")
bool isPalindrome(int number);
int main()
{

	printf("%s",formatBool(isPalindrome(121)));
	return 1;
	
}

bool isPalindrome(int number)
{
	int reversed =0;
	int originalNumber=number;
	while(number!=0)
	{
		reversed *=10;
		reversed +=number %10;
		number /=10;
	}

	if(originalNumber == reversed && originalNumber>=0)
	{
		return true;
	}
	else{
		return false;
	}

}