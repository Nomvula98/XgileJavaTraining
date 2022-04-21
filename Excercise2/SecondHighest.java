class SecondHighest {
    public static void main(String[] args) {
        int[] numberArr = {45, 3, 56, 4356, 5, 78, 81};
        int temp;
        for (int i = 0; i <numberArr.length; i++){
            for(int j =i; j<numberArr.length; j++){
                if(j<numberArr.length-1) {
                    if (numberArr[i] < numberArr[j + 1]) {
                        temp = numberArr[i];
                        numberArr[i] = numberArr[j + 1];
                        numberArr[j + 1] = temp;
                    }
                }
            }
            }
        System.out.println("The second highest value is: "+ numberArr[1]);
    }
}