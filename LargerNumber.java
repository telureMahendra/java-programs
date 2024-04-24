public class LargerNumber {
    public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java LargerNumber <number1> <number2>");
            return;
        }

        // Parse command line arguments to integers
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        // Compare the numbers and find the larger one
        int largerNumber = Math.max(number1, number2);

        // Print the result
        System.out.println("The larger number is: " + largerNumber);
    }
}
