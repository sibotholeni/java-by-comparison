public class ConsoleBasedFizzBuzz implements FizzBuzz{
    
    @Override
    public void print(int from, int to) {

        for (int x = from; x < to; x++) {
            if (x % 3 == 0 && x % 5 != 0) {
                System.out.println("Fizz");
            } else if (x % 5 == 0 && x % 3 != 0) {
                System.out.println("Buzz");
            } else if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(""+ x);
            }
        }
    }

}
