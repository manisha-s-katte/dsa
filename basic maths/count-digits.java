class Main {
   public static int countDigits(int n) {
        int c = 0;
        while (n > 0) {
        c = c + 1;
        n = n / 10;
        }
       return c;
    }public static void main(String[] args) {
        int N = 6137;
        System.out.println("N: " + N);
        int digits = countDigits(N);
        System.out.println("Number of Digits in N: " + digits);
    }
}

                                
                            