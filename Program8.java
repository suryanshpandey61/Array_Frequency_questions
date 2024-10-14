import java.util.Scanner;
class Program8{

 public static void getFirstNonRepeatEle(int[] a){
    int[] freq=new int[101];
    int temp=0;
    for(int i=0;i<a.length;i++){
      freq[a[i]]++;
    }
    for(int i=0;i<a.length;i++){
       temp=a[i];
       if(freq[temp]==1){
         System.out.println("The First non repeating ele is : "+temp+" its index is: "+i );
         break; 
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
    System.out.println("===========");
    getFirstNonRepeatEle(a);
  }

}