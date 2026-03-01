package BasicPrograms.basic;

public class findDigitsBetweenTwoSameDigits {
    public static void main(String[] args) {
        //[-1.4,-3,4,6,8,1.5,6,3.6,1]
        //convert negative and decimal to int then find digits between 2 same int
        //eg. 1=4 --> between -1.4 and 1.5 has 4 digits and we need to truncate decimal part of digits
        //e.g. 1=4; 3=5; 4=0; 6=2; 8=0; 1=2; 6=0; 3=0; 1=0]



        double[] arr = {-1.4,-3,4,6,8,1.5,6,3.6,1};

        for(int i=0; i<arr.length; i++){
            int num1 = (int)Math.abs(arr[i]); // to remove -ve and decimal values
            int count =0;
            boolean b = false;
            for(int j=i+1; j<arr.length; j++){
                int num2 = (int)Math.abs(arr[j]);
                if(num1==num2){
                    b = true;
                    break;
                }
                count++;

            }
            if(b==false){
                count = 0;
            }
            System.out.println(num1+"-> "+count);
        }
    }
}
