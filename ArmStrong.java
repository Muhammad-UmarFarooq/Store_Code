class ArmStrong_m1
  {
    public static void main(String[] args)
    {
      int num=153;
      int temp1=num;
      int digits=0;
      // code for calculating length of the number
      while(temp1!=0)
        {
          digits++;
          temp1=temp1/10;
        }
      int temp2=num;
      int arm=0;
      while(temp2!=0)
        {
          int mul=1;
        //   determines the last digit from the number
          int rem=temp2%10;
          for(int i=0;i<digits;i++)
            {
              mul=mul*rem;
            }
          arm=arm+mul;
        //   removes the last digit
          temp2=temp2/10;
        }
      if(arm==num)
      {
        System.out.println(num+" is an armstrong number");
      }
      else
      {
         System.out.println(num+" is not an armstrong number");
      }
    }
  }

