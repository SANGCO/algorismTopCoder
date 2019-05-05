package TopCoder_05;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AlgoDrill {

    @Test
    public void kiwiJuiceEasyTest() {
//        int[] capacities = {10, 10};
//        int[] bottles = {5, 8};
//        int[] fromId = {0};
//        int[] toId = {1};
//        int[] returns = {3, 10};

        int[] capacities = {30, 20, 10};
        int[] bottles = {10, 5, 5};
        int[] fromId = {0, 1, 2};
        int[] toId = {1, 2, 0};
        int[] returns = {10, 10, 0};

//        int[] capacities = {14, 35, 86, 58, 25, 62};
//        int[] bottles = {6, 34, 27, 38, 9, 60};
//        int[] fromId = {1, 2, 4, 5, 3, 3, 1, 0};
//        int[] toId = {0, 1, 2, 4, 2, 5, 3, 1};
//        int[] returns = {0, 14, 65, 35, 25, 35};

        int[] results = thePouring(capacities, bottles, fromId, toId);

        for (int i = 0; i < returns.length; i++) {
            assertEquals(returns[i], results[i]);
        }
    }

    private int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {

        for (int i = 0; i < fromId.length; i++) {

            int sum = bottles[fromId[i]] + bottles[toId[i]];

                System.out.println("bottles[fromId[i]] : " + bottles[fromId[i]]);
                System.out.println("bottles[toId[i]] : " + bottles[toId[i]]);
                System.out.println("sum : " + sum);

            bottles[toId[i]] = Math.min(sum, capacities[toId[i]]);
            bottles[fromId[i]] = sum - bottles[toId[i]];

                System.out.println("capacities[toId[i]]" + capacities[toId[i]]);
                System.out.println("bottles[toId[i]]" + bottles[toId[i]]);
                System.out.println("bottles[fromId[i]]" + bottles[fromId[i]]);
                System.out.println("");
        }

        return bottles;
    }

}
