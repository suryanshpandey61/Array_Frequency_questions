
class Program9{
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
      System.out.println(a[i]+" is "+count+" times");
     

     }


  }

  
  public static void main(String[] args){
    int[] a={14,47,14,12,14,58,58};
    getFrequencyOfEle(a);

  }

}













