import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10,4,6,7,8,0,0,0,0,0};
        int index;
        int addValue;
        do {
            System.out.printf("Nhap gia tri muon them vao mang: ");
            addValue = input.nextInt();
            System.out.printf("Nhap vi tri muon them vao: ");
            index = input.nextInt();
            if(index >= 0){
                if(index < arr.length){
                    for(int i = arr.length-1; i >= index; i--){
                        if(i == index){
                            arr[index] = addValue;
                            break;
                        }else {
                            arr[i] = arr[i - 1];
                        }

                    }
                    printArr(arr);
                }
            }else {
                System.out.println("Vi tri them vao khong dung. Nhap lai!!!");
            }
        }while (index < 0);
    }
    public static void printArr(int[] arr){
        System.out.printf("[ ");
        for (int i = 0; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.printf("]");
    }
}