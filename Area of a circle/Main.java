#include<stdio.h>
int main()
{
  //Type your code here
  float diameter,area,pi=3.14;
  scanf("%f",&diameter);
  area=pi*(diameter/2)*(diameter/2);
  printf("%.2f",area);
  return 0;
}