
import java.util.Scanner;
import java.io.IOException;
public class Main {
    private int[] theArray = new int[50];
    private int arraySize = 10;
    int i;
    public void genRandomArray() {

        for (i = 0; i < arraySize; i++) {
            theArray[i] = (int)(Math.random() * 10) + 10;
        }
    }

    public void printArray() {
        System.out.println("-------");
        for (i = 0; i < arraySize; i++) {
            System.out.println("|" + i + "|" + theArray[i] + "|");
            System.out.println("-------");
        }
    }
    public int getValuebyindex(int index){
        if(index < arraySize) return theArray[index];
        return 0;
    }
    public boolean ValuecheckinArray(int SearchValue){
        boolean ValueinArray = false;
    for(i = 0; i < arraySize; i++){
        if(theArray[i] == SearchValue){
            ValueinArray = true;
        }
    }
        return ValueinArray;
    }
public void Deleteivalue(int index){
    if(index < arraySize){
        for(int j = index; j < arraySize; j++){
            theArray[j] = theArray[j+1];
        }
    }
}
    public static void main(String[] args){
        Main newArray = new Main();
        newArray.genRandomArray();
        newArray.printArray();
        while(true) {
            System.out.println("what do you want to do (search/check/exit/delete)");
            Scanner scan = new Scanner(System.in);
            String c = scan.nextLine();
            if (c.equals("search")) {
                try {
                    System.out.println("in which index does you want to get value out of? : (1-10)");
                    Scanner userInput = new Scanner(System.in);
                    int a = userInput.nextInt();
                    if (a > 10 || a < 1) {
                        System.out.println("Please enter a number between 1-10");
                        continue;
                    }
                    System.out.println(newArray.getValuebyindex(a));
                } catch (Exception e) {
                    System.out.println("please enter an interger in the range of 1 to 10");
                }
            }
            if (c.equals("check")) {
                System.out.println("enter the value you want to check for in the array");
                Scanner userInput = new Scanner(System.in);
                int b = userInput.nextInt();
                if (newArray.ValuecheckinArray(b))
                    System.out.println(b + " is a in the array");
                else
                    System.out.println(b + " is not in the array");
            }
            if (c.equals("exit")) {
                System.out.println("Goodbye! System exiting");
                break;
            }
            if (c.equals("delete")) {
                System.out.println("Enter the index of which value you want to delete");
                Scanner userInput = new Scanner(System.in);
                int e  = userInput.nextInt();
                newArray.Deleteivalue(e);
                System.out.println("the value you enter has been deleted");
                newArray.printArray();
            }



        }
    }
}
