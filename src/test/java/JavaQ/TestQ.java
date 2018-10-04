package JavaQ;

class TestQ {
    public static void main(String[] args) {
        int a, b, left, right, middle;
		    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = -1;

        a = arr.length;
        b = 2;
        left = 0;
        right = arr.length - 1;

        while (left < right) {
            middle = left + ((right-left)/2);
            if (arr[middle] == b) {
                result = middle;
            }

            if (arr[middle] < b){
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        if (result == -1) {
            System.out.println("Variable "+b+" not found");
        } else {
            System.out.println("Variable "+b+" found at index: "+result);
        }
    }
}