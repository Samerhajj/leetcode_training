#include <stdio.h>

/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/
unsigned int romanTable[90] = {
	['I'] = 1,
    ['V'] = 5,
    ['X'] = 10,
    ['L'] = 50,
    ['C'] = 100,
    ['D'] = 500,
    ['M'] = 1000

};
int romanToInt(char* s);
int main()
{	
	printf("%d",romanToInt("II"));
	return 0;
}


int romanToInt(char* s)
{	
	int ans =0;
	char nextChar;
	while (*s!= '\0')
	{
		nextChar = *(s+1);
		if (romanTable[*s]<romanTable[nextChar])
		{
			ans -=romanTable[*s];
		}
		else{
			ans+=romanTable[*s];
		}
		s++;
	}
	return ans;
}