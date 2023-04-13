// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        String phoneNumber = args[2];
        printUserInfo(name, age, phoneNumber);
        int sortInput[] = new int[]{ 1, 2, 3, 9, 8, 7, 3, 4, 5};
        quickSort(sortInput, 0, 8);
        for(int i = 0; i < 9; i++){
            System.out.print(sortInput[i]+" ");
        }
        System.out.print("\n");
    }
    public static void printUserInfo(String useName, int useAge, String useNum){
        System.out.println("User name = "+useName+", they are "+useAge+" years old, and their number is "+useNum);
    }
    public static void quickSort(int input[], int start, int end){
        if(start < end){
            int partInd = part(input, start, end);

            quickSort(input, start, partInd-1);
            quickSort(input ,partInd+1, end);
        }
    }
    public static int part(int input[], int start, int end){
        int pivot = input[end];
        int index = start-1;
        int temporary = 0;
        for(int i = start; i <end; i++){
            if(input[i]<= pivot) {
                index++;
                temporary = input[index];
                input[index] = input[i];
                input[i] = temporary;
            }
        }
        temporary = input[index+1];
        input[index+1] = input[end];
        input[end] = temporary;
        return index+1;
    }
}
