class FibonacciSeries {

    public static void main(String[] args) {
        calcFibonacciSeries(10);
    }
    static void calcFibonacciSeries(int n) {
        int num1 = 0;
        int num2 = 1;
        int nextNum;
        for (int i = 0; i <= n; i++) {
            nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
            System.out.print(num1 + ", ");
        }
    }
}