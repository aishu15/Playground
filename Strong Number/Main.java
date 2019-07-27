#include <stdio.h>
int main() {
	//Type your code
  int n,f,i,temp,r,s=0;
  scanf("%d",&n);
  temp=n;
  while(n)
  {
    f=1;
    r=n%10;
    for(i=1;i<=r;i++)
      f*=i;
    s+=f;
    n/=10;
  }
  if(s==temp)
    printf("Yes");
  else
    printf("No");
	return 0;
}