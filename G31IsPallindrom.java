class G31IsPallindrom {

    static boolean isPallindrom(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "madam";

        if (isPallindrom(str))
            System.out.println("String is Pallindrom");
        else
            System.out.println("String is not Pallindrom");
    }
}