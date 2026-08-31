class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }

        StringBuilder stack = new StringBuilder();

        for (char digit : num.toCharArray()) {

            // Remove larger digits from the stack
            // while we still have digits to remove
            while (k > 0 && stack.length() > 0 
                    && stack.charAt(stack.length() - 1) > digit) {
                
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }

            stack.append(digit);
        }

        // If k is still remaining, remove from the end
        while (k > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }

        // Remove leading zeros
        int i = 0;
        while (i < stack.length() && stack.charAt(i) == '0') {
            i++;
        }

        String result = stack.substring(i);

        return result.length() == 0 ? "0" : result;
    }
}