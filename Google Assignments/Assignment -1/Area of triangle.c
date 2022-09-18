#include <stdio.h>
#include <stdlib.h>

int findArea(float a, float b, float c)
{
	if (a < 0 || b < 0 || c <0 || (a+b <= c) ||
		a+c <=b || b+c <=a)
	{
		printf("Not a valid triangle");
	}
	int s = (a+b+c)/2;
	return sqrt(s*(s-a)*(s-b)*(s-c));
}

int main()
{
	int a,b,c;
  scanf("%d %d %d,&a,&b,&c);
	printf("%d", findArea(a, b, c));
	return 0;
}
