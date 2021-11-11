import java.util.*;
class Tdmul
{
              public static void main(String arg[])
              {
                     int[][] a=new int[10][10];
	    int[][] b=new int[10][10];
	   int[][] mul=new int[10][10];
	   int i,j,n,m;
                     Scanner t=new Scanner(System.in);
                     System.out.println("Enter n");
                     n=t.nextInt();
	   System.out.println("Enter m");
                     m=t.nextInt();
	   System.out.println(" enter array A matrix value");
                    for (i=0;i<n;i++)
                    {
                          for(j=0;j<m;j++)
                          {
	          
                             a[i][j]=t.nextInt();
	          
	         }
                          
                     }
	  System.out.println(" enter array B matrix value");
                    for (i=0;i<n;i++)
                    {
                          for(j=0;j<m;j++)
                          {
	            b[i][j]=t.nextInt();
                          }
                            
                     }
                   for(i=0;i<n;i++)
                  {
                        for(j=0;j<m;j++)
                        {
                                   mul[i][j]=a[i][j]*b[i][j];
	              
                          }
              }
	  for(i=0;i<n;i++)
                  {
                        for(j=0;j<m;j++)
                        {
                               System.out.print(mul[i][j]+"     ");
                          }
                        System.out.println();
              }
       }
}

          
