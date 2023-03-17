class RotateArray {
    public static void main(String[] args) {
        int [] a = new int [] {1, 2, 3, 4, 5};
        int n = a.length-1;
        System.out.println("Original array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for(int i = 0; i < n; i++){
            int j, first;
            first = a[0];
            for(j = 0; j < a.length-1; j++){
                a[j] = a[j+1];
            }
            a[j] = first;
        }
        System.out.println();
        System.out.println("Array after left rotation: ");
        for(int i = 0; i< a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
