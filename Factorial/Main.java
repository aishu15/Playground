#include<stdio.h>
int main()
{
	//your code here
  long n,f=1;
  int i;
  scanf("%ld",&n);
  for(i=1;i<=n;i++)
    f*=i;
 printf("%ld",f);
}
