public class Arms {
    public static void main(String[] args){
      int num = 153;
      int copy=num;
      int arm=0;
      int count=0;
      while(num>0){
          num = num/10;
          count++;
      }
      while(copy>0){
          int digit=copy%10;
          arm += (int) (Math.pow(digit,count));
          copy=copy/10;
      }
        System.out.println(arm);


    }
}
