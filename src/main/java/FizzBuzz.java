public class FizzBuzz
{
    /**
     * Print the FizzBuzz sequence for 1..100 to standard output.
     * Rules:
     * - Multiples of 3 -> "Fizz"
     * - Multiples of 5 -> "Buzz"
     * - Multiples of both 3 and 5 -> "FizzBuzz"
     * - Otherwise -> the number itself
     * Output should be 100 whitespace-separated tokens (spaces or newlines are fine).
     */
    public static void main(String[] args)
    {
        for(int j=0; j<=100; j++)
        {
            if (j % 3 == 0 && j>=3)
            {
                System.out.println("Fizz");
            }
            else if (j % 5 == 0 && j>=5)
            {
                System.out.println("Buzz");
            }
            else if (j % 3 == 0 && j % 5 == 0 && j>=3)
            {
                System.out.println("FizzBuzz");
            }
            else
            {
                System.out.println(j);
            }
        }
    }
}
