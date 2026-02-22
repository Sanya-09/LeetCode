class Solution {
    public String sortSentence(String s) {
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;  

        for (int i = 0; i <= s.length(); i++) {

            if (i == s.length() || s.charAt(i) == ' ') {

                String temp = s.substring(index,i);
                int pos = temp.charAt(temp.length() - 1) - '0';

                result[pos - 1] = temp.substring(0, temp.length() - 1);

                index = i + 1; 
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
            if (i != result.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}