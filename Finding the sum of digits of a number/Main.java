#include <stdio.h>
int main() {
	//Type your code
  int n,r,s=0;
  scanf("%d",&n);
  while(n)
  {
    r=n%10;
    s+=r;
    n/=10;
  }
  printf("%d",s);
	return 0;
}