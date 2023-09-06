class Solution {
    public int[] plusOne(int[] d) {
      int i=0;
      int  n = d.length;
      if(d[n-1]!=9){
          d[n-1] = d[n-1] + 1;
          return d;
      }
      else{
          for(i=n-1;i>=0;i--){
              if(d[i]!=9){
                  break;
              }
          }

          if(i == -1){
              int[] a = new int[n+1];
              a[0] = 1;
              for(int j=1;j<n;j++){
                  a[j]=0;
              }
              return a;
          }
          else{
              d[i]= d[i] + 1;
              for(int j=i+1;j<n;j++){
                  d[j]=0;
              }
          }
          return d;

      }

    }
}