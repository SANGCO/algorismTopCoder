package TopCoder_04;

public class ThePalindrome2 {

    public int solution(String s)
    {
        int answer = 0;
        StringBuilder sb;

        for (int i=0; i < s.length(); i++) {
            sb = new StringBuilder();
            sb.append(s.charAt(i));

            for (int j=i+1; j < s.length(); j++) {
                sb.append(s.charAt(j));
                if( s.charAt(i) == s.charAt(j) ) {
                    int length = checkPalindrome(sb);
                    if( (answer < length) || (answer == 0) ) {
                        answer = length;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    private int checkPalindrome(StringBuilder sb) {
        if( sb.reverse().toString().equals(sb.toString()) ) {
            return sb.length();
        }
        return 0;
    }

}
