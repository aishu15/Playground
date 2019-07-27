#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n,i,c=0,s=0,t,f,r;
  scanf("%d",&n);
  t=f=n;
  while(n!=0)
  {
    n/=10;
    c++;
  }
  while(f)
  {
    r=f%10;
    r=pow(r,c);
    s+=r;
    f/=10;
  }
  if(s==t)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
    
	return 0;
}