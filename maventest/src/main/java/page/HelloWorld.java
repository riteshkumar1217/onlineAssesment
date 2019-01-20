package page;

public class HelloWorld{

     public static void main(String []args){
         double  arr[] ={1,2,3,4,5,6};
         System.out.println(arr[1]);
         double total=0;
         for (int i=0;i<arr.length;i++)
         {
             System.out.println(arr[i]);
              if(arr[i]%2==0)
              System.out.println(arr[i]+" "+"Number is even");
         }
        //  double avg= total/arr.length;
        // System.out.println(avg);
     }
}