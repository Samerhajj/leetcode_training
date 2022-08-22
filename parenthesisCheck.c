#include <stdio.h>
#include <stdbool.h>
#define formatBool(b) ((b) ? "true" : "false")

bool isValid(char* s);
int main()
{
	char test[] = "{}{}{))(";
	printf("%s\n",formatBool(isValid(test)));
	return 0;
}

bool isValid(char* s)
{
	  char *q=s;
    
    for (char *p=s; *p; p++) 
        switch(*p) {
            case '(': *q++ = ')'; continue;
            case '{': *q++ = '}'; continue;
            case '[': *q++ = ']'; continue;
            default: if (q==s || *p != *--q) return false;
        }
    
    return q==s;
}

