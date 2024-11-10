/**
 * Find all four-digit number that has the property: 
 * eg. 3025: 30 + 25 = 55 and 55^2 = 3025 
 */
public class FourDigitNum {
    public static void main(String[] args){

        int number = 1000;
        while(number < 10000){

            int num1, num2, sum;
            num1 = number / 100;
            num2 = number % 100;
            sum = num1 + num2;

            if(number == Math.pow(sum, 2))
                System.out.println(number);

            number++;
        }
    }
}
