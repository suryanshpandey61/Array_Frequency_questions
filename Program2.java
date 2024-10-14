import java.util.Scanner;
class Program2{
  
   public static void getElementAppearOnce(int[] a){
       int[] freq=new int[101];
       for(int i=0;i<a.length;i++){
          freq[a[i]]++;
       }

       System.out.println("Elements which appers only once in array are:");
       for(int i=0;i<freq.length;i++){
       if(freq[i]==1)
         System.out.print(i+" ");
       }

   }
 
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of an Array");
     int size=sc.nextInt();
     int[] a=new int[size];
     for(int i=0;i<size;i++){
          System.out.println("Enter the "+(i+1)+" element");
          a[i]=sc.nextInt();
     }

     System.out.println("Array is ");
     for(int i=0;i<size;i++){
          System.out.print(a[i]+" ");
     }
     System.out.println();
     System.out.println("===========");
     getElementAppearOnce(a);
 
   }

 

}