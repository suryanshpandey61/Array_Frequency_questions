import java.util.Scanner;
class Program7{

 public static void getMaxOccurElement(int[] a){
  int max=0;
  int[] freq=new int[101];
  for(int i=0;i<a.length;i++){
     freq[a[i]]++;
   }
  for(int i=0;i<freq.length;i++){
    if(max<freq[i])
       max=freq[i];
  }

  for(int i=0;i<freq.length;i++){
     if(freq[i]==max)
       System.out.println("The maximun occuring element is :"+i);
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
    System.out.println("===========");
    getMaxOccurElement(a);
  }

}