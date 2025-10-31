public class Java {
    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void genRandomArray() {
        int i;
        for (i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public void printArray() {
        int i;
        System.out.println("-----------");
        for (i = 0; i < arraySize; i++) {
            System.out.println("|  " + i + " |");
            System.out.println(theArray[i] + " |");
            System.out.println("-----------");
        }
    }
}

