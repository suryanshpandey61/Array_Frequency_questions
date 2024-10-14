import java.util.Scanner;
class Program5{

  public static void printEvenAppearanceElement(int[] a){
        int[] freq=new int[101];
        for(int i=0;i<a.length;i++){
             freq[a[i]]++;
        }
        for(int i=0;i<freq.length;i++){
           if(freq[i]%2==0 && freq[i]>0)
              System.out.print(i+ " ");
        }

  }

 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of an array");
   int size=sc.nextInt();
   int[] a=new int[size];
   for(int i=0;i<a.length;i++){
      System.out.println("Enter the "+(i+1)+" Elements ");
      a[i]=sc.nextInt();
   }

   for(int i=0;i<a.length;i++){
      System.out.print(a[i]+ " ");
   }

   System.out.println();
   System.out.println("=============");
   printEvenAppearanceElement(a);
  


 }

}