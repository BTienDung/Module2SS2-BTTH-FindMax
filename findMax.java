package season_2.FindMax;

import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        int sizeArr;
        int array[] = new int [20];

        Scanner scanner = new Scanner(System.in);
        boolean t = true;
        do {
            System.out.println("Nhập số lượng phần tử.");
            sizeArr = scanner.nextInt();
            t= true;
            if (sizeArr>20){
                System.out.println("Mảng nhập phải bé hơn 20");
                t = true;
            } else {
                t = false;
            }
        } while (t);

        //nhap gia tri cua mang
        for (int j=0;j<sizeArr;j++){
            System.out.print("array[" +j+ "]: ");
            array[j] = scanner.nextInt();
        }

        //find max

        int maxArr = array[0];
        for (int i=0; i<sizeArr; i++){
            if (maxArr < array[i]){
                maxArr = array[i];
            }
        }
        System.out.println("giá trị lớn nhất trong mảng là: "+maxArr);
    }
}
