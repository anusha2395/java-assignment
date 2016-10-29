import java.io.*;

class  Question
{
    public static void main(String args[]) 
    {
       final String ans="RAM";
       String str;
       int n=3,attempt=0;

       try{
          BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));

          while(n>0)
          {
              System.out.print("Which type of memory gets lost when you switch off: ");
              
              str=obj.readLine();
              attempt++;
              if( str.equalsIgnoreCase(ans) == true)
              {
                     if(attempt==1)
                     {
                         System.out.println("\nVERY GOOD");
                         System.exit(1);
                     }
                     else if(attempt==2)
                      {
                         System.out.println("\nGOOD");
                         System.exit(1);
                      }
                     else
                      {
                         System.out.println("CORRECT");
                         System.exit(1);
                      }
            }
            else
                   System.out.println("\nTRY AGAIN\n");
            
            n=n-1;
         }
         if(attempt>=3)
            System.out.println("\nANSWER IS "+ans);
        }
    catch(Exception e) {}
    }
}
