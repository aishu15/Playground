#include <stdio.h>
int main() {
	//Type your code
  int f,l,n;
  scanf("%d",&n);
  l=n%10;
  f=n;
  while(n>=10)
  {
    n=n/10;
  }
  f=n;
  printf("%d",(f+l));
	return 0;
}