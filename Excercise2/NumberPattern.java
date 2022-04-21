class NumberPattern {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                num++;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
