public class ArrayPractice {


    public static void main(String [] args) {

        //redo the million die roll problem, but use
        //an array to track all the results
        //-after the million rolls, print the totals of
        //each result

        int [] results = new int [6];

        for (int i = 0; i < 1000000; i++) {

            // can leave the random range as [0, 5] to use
            //as an index in results
            int roll = (int)(Math.random() * 6);

            //increment the value stored at results[roll]
            results[roll]++;
        }

        for (int i = 0; i < results.length; i++)
            System.out.println((i+1) + "s: " + results[i]);

        System.out.println();

        int [] nums = {5, 4, 10, 2, 8, 1, 3, 9};

        //enhanced for loop or for-each loops
        //-iterate through each value in an array in sequence
        //-don't use if you need the index number of a value
        for (int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        //can't use for-each loops to change or assign values
        for (int num: nums)
            num = 0;

        for (int num: nums) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println();

        //swap the elements at index 0 and index 3

//        nums[3] = nums[0];
//        nums[0] = nums[3];
        //doesn't work because the old value of nums[3]
        //is never saved

        int temp = nums[3];
        nums[3] = nums[0];
        nums[0] = temp;

        for (int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();

        //sorting algorithms - selection sort
        //-moving from left to right, build the sorted section
        //on the left by finding the smallest value in the
        //unsorted section (on the right). Once the smallest
        //value is found, swap it into place in the current
        //position of the sorted section

        //i is the index that we want to swap the next smallest
        //value to
        for (int i = 0; i < nums.length; i++) {

            //track the index of the next smallest value so
            //that you can swap later
            int nextSmallestI = i;

            //look in all positions after i for a smaller value
            //-if the element at j is smaller than the
            //element at nextSmallestI, update nextSmallestI
            for (int j = i+1; j < nums.length; j++) {

                if (nums[j] < nums[nextSmallestI])
                    nextSmallestI = j;
            }
            //after the inner loop, nextSmallestI will be the
            //position to swap with

            //swap the values at nextSmallestI and i
            int swap = nums[i];
            nums[i] = nums[nextSmallestI];
            nums[nextSmallestI] = swap;

            //print the progress after each swap
            for (int num: nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //use arrays to print a deck of cards
        //print each individual card combination on its own line

        String [] suits = {"spades", "diamonds", "hearts", "clubs"};
        String [] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

        for(String suit: suits) {
            for(String rank: ranks) {
                System.out.println(rank + " of " + suit);
            }
        }
        System.out.println();
        for (int i = 0; i < suits.length; i++)
            for (int j = 0; j < ranks.length; j++)
                System.out.println(ranks[j] + " of " + suits[i]);

        //draw a random card from the deck
        int randRank = (int)(Math.random() * 13);
        int randSuit = (int)(Math.random() * 4);
        System.out.println("you drew the " +  ranks[randRank] +
                " of " + suits[randSuit]);
    }
}
