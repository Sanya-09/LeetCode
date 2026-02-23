public class rotated_string {

    static String Reverse(String str1, int start, int end) {
        char[] arr = str1.toCharArray();

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return new String(arr);
    }

    static boolean clockwise(String str1, String str2) {
        int n = str1.length();
        int d = 2;

        str1 = Reverse(str1, 0, n - 1);
        str1 = Reverse(str1, 0, d - 1);
        str1 = Reverse(str1, d, n - 1);

        return str1.equals(str2);
    }

    static boolean anticlockwise(String str1, String str2) {
        int n = str1.length();
        int d = 2;

        str1 = Reverse(str1, 0, d - 1);
        str1 = Reverse(str1, d, n - 1);
        str1 = Reverse(str1, 0, n - 1);

        return str1.equals(str2);
    }

    public static void main(String[] args) {
        String str1 = "amazon";
        String str2 = "azonam";

        System.out.println("Clockwise: " + clockwise(str1, str2));
        System.out.println("Anticlockwise: " + anticlockwise(str1, str2));
    }
}
