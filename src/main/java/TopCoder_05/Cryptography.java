package TopCoder_05;

import java.util.Arrays;

public class Cryptography {
    public static void main(String[] args) {

        int[] numbers1 = {1000, 999, 998, 997, 996, 995};
        // expect Returns : 986074810223904000
        System.out.println(encrypt_version1(numbers1));

        int[] numbers2 = {1000, 999, 998, 997, 996, 995};
        System.out.println(encrypt_version2(numbers2));

    }

    private static long encrypt_version1(int[] numbers) {
        long ret = 1;
        Arrays.sort(numbers);
        numbers[0]++;

        for (int i=0; i < numbers.length; i++) {
            ret *= numbers[i];
        }

        return ret;
    }

    private static long encrypt_version2(int[] numbers) {
      long ans = 0;

      for (int i=0; i<numbers.length; i++) {
          long temp = 1;

          for (int j=0; j<numbers.length; j++) {
              if (i == j) {
                  temp *= (numbers[j] + 1);
              } else {
                  temp *= numbers[j];
              }
          }

          ans = Math.max(ans, temp);
      }

      return ans;
    }
}
