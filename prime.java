class prime{
public static void main(String args[]){
   int low=6, high=16, i, flag;
   System.out.println("Enter two numbers(intervals): ");
   
 System.out.println  ("Prime numbers between " + low + "and " + high + " are: ");


   while (low < high) {
      flag = 0;
      if (low <= 1) {
         ++low;
         continue;
      }
      for (i = 2; i <= low / 2; ++i) {

         if (low % i == 0) {
            flag = 1;
            break;
         }
      }

      if (flag == 0)
         System.out.println(low);
      ++low;
   }

}
}