package Arrays;


public class Majority {
    public static void main(String[] args) {
        int[] arr={3,2,3,2,2,4,3,2,2,2};
        int candidate=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
          if(count==0)
          {
            candidate=arr[i];
          }   
          if(arr[i]==candidate)
          {
            count++;
          }
          else{
            count--;
          }
        }
        count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==candidate)
            count++;
        }
        if(count>arr.length/2)
        {
            System.out.print(candidate +" "+"Majority Element");
        }
        else{
            System.out.println("NO Majority Element");
        }
    }
}
