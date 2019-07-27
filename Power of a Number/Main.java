#include <stdio.h>
int main()
{
  	//Your code here  
  int base,exponent,ans=1,i;
  scanf("%d%d",&base,&exponent);
  if(exponent>=0)
  {
    for(i=1;i<=exponent;i++)
      ans*=base;
    printf("%d",ans);
  }
  else
    printf("Wrong input");
    return 0;
}