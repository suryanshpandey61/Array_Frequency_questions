
class Program10{
  public static void getFrequencyOfEle(int[] a){
     int n=a.length;
     for(int i=0;i<n;i++){
        int count=1;
        for(int j=i+1;j<n;j++){
           if(a[i]==a[j]){
               count++;
               a[j]=a[n-1];
               n--;
               j--;
            }

        }
      if(count%2==0)
       System.out.println(a[i]+" is "+count+" times");
     

     }


  }

  
  public static void main(String[] args){
    int[] a={12,13,43,44,13,21,44,44,13,12,44};
    getFrequencyOfEle(a);

  }

}













