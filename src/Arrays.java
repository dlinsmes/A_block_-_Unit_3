import java.util.Scanner;

public class Arrays {
    public static void main(String [] args) {
        //an array is a collection of data
        //arrays are different from lists because
        //arrays need to have a preset size (length)
        //-the size can't change

        //an array needs to be declared as a single
        //data type and can only hold values of that
        //type

        //String array

        //length of words is 4
        String [] words = new String[4];

        //values (elements) in an array are referred to
        //by an index (position)
        //indexing starts at 0
        words[0] = "hello";
        words[1] = "hi";
//        words[2] = "word";
        words[3] = "unforgettable";

        System.out.println("the value at index 1 is "
                + words[1]);

        System.out.println("the length of words is "+
                words.length);

        System.out.println("the value at index 2 is "
                + words[2]);
        //in arrays, any uninitialized values will
        //default to null (nothing) for Strings
        // 0 for int
        // 0.0 for doubles
        // false for booleans

        String word;
        //System.out.println(word);
        //the values will only default within arrays,
        //not singular variables

        //print out whole array
        System.out.println(words);
        //if you try to print an array like this,
        //you get the memory location of the array
        //(not useful)

        //to print out all values in a list, use a loop
        //that iterates through all indices
        System.out.println("words:");
        for (int i = 0; i < words.length; i++) {
            //best practice to use words.length as the
            //loop condition rather than hardcoded value
            System.out.println(words[i]);
        }

        int [] nums = {4, 5, 9, 1 };
        System.out.println("length of nums is " + nums.length);

        int [] nums2;
        //nums2 =  {4, 5, 9, 1 };
        //to set the values like this, do it in the same
        //line as the declaration

        //still need to set the array size
        nums2 = new int [5];

        //set the value at position 0 to 4
        nums2[0] = 4;

        //defaults to 0
        System.out.println(nums2[1]);

        //set all values in nums2 to a random number
        //between 1 and 10
        System.out.print("nums2: ");
        for (int i = 0; i < nums2.length; i++) {
            //each position will get a newly generated
            //number
            nums2[i] = (int)(Math.random() * 10 + 1);
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        //ask the user for how many items to place in
        //their shopping cart, then ask for each item
        //and place it into an array

        Scanner s = new Scanner(System.in);
        System.out.println("how many items to add?");
        int numItems = s.nextInt();
        s.nextLine();
        String [] cart = new String[numItems];

        for (int i = 0; i < cart.length; i++) {
            System.out.println("enter an item");
            cart[i] = s.nextLine();
        }

        //if you try to access a value at an invalid
        //index, you get an out of bounds error
//        for (int i= 0; i <= cart.length; i++) {
//            System.out.println(cart[i]);
//        }

        //last possible index is always the length-1

        for (int i= 0; i < cart.length; i++) {
            System.out.println(cart[i]);
        }

        //prompt the user to ask for the index of the
        //item they want printed and keep going until
        //they enter -1
        System.out.println("enter the index of the " +
                "item you want or enter -1 to stop");
        int index = s.nextInt();
        while(index != -1) {
            if (index >= 0 && index < cart.length) {
                System.out.println(cart[index]);
            }
            else {
                System.out.println("Invalid index");
            }
            System.out.println("enter the index of the " +
                    "item you want or enter -1 to stop");
            index = s.nextInt();
        }

    }
}
