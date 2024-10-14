import java.util.Scanner;
class Program1{

  public static void getFrequency(int[] a){
      int[] freq=new int[101];
      for(int i=0;i<a.length;i++){
          int x=a[i];
          freq[x]++;
      }
      for(int i=0;i<freq.length;i++){
         if(freq[i]>0){
           System.out.println(i+" appears "+freq[i]+" times");
         }
      }

  }

 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of an array");
     int size=sc.nextInt();
     int[] a=new int[size];
     for(int i=0;i<size;i++){
          System.out.println("Enter the "+(i+1)+" element");
          a[i]=sc.nextInt();
     }
     
     for(int i=0;i<size;i++){
          System.out.print(a[i]+" ");
     }
     
     System.out.println();
     System.out.println("===============");
     getFrequency(a);
 }

}








