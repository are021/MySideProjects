/**
 *   * My first C program
 *     * @author are021 
 *     */
#include <stdio.h>
double square(double x);
int factorial(int n);

/**
 *   * Main entry point
 *     */

int main() 
{
  int val;
  scanf("%d",&val);
  printf("The factorial of 4 is %d\n", factorial(val));
  printf("The square of 22 is %f\n", square(val));

  return 0;
}

/**
  *  Compute the factorial of a number
  */

int factorial(int n)
{
  int f = 1;
  int i;
  for(i=1; i<=n; i++)
  {
    f *= i;
  }
  return f;
}


/**
 * Compute the square of a number
 */
double square(double x)
{
  return x * x;
}
