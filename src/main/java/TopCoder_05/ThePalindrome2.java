package TopCoder_05;

public class ThePalindrome2 {

    public int solution(String s) {

        for (int i = s.length(); ; i--) {
            boolean flag = true;

            for (int j = 0; j < s.length(); j++) {

                if (j < (i - j - 1) && s.charAt(j) != s.charAt(i - j - 1)) {
                    System.out.println("s.charAt(i - j - 1) " + s.charAt(i - j - 1));
                    System.out.println("s.charAt(j) " + s.charAt(j));
                    flag = false;
                    break;
                }
            }

            if (flag) return i;
        }
    }

}
