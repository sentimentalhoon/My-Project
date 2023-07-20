package JavaTest230720.Question6_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StoreController.setStore();
            while (true) {
                try {
                    print("[1] 음식점보기 [2] 미용실보기 [3] 상세보기 [4] 평점보기 [5] 종료 >>>\t");
                    int selectNum = sc.nextInt();
                    switch (selectNum) {
                        case 1:
                            getAllRestaurant();
                            break;
                        case 2:
                            getAllSalon();
                            break;
                        case 3:
                            findStore(sc);
                            break;
                        case 4:
                            getAllStoreGrade();
                            break;
                        case 5:
                            System.exit(0);
                            break;
                        default:
                            println("정확한 숫자를 입력해 주세요!");
                            break;
                    }
                } catch (Exception e) {
                    println("정확한 숫자를 입력해 주세요!");
                }
            }
        }
    }

    private static void getAllStoreGrade() {
        // StringBuilder stringBuilder = new StringBuilder();
        String[][] arrayString = new String[11][StoreController.getStoreList().size() + 1];
        for (int i = 0; i < 10; i++) {
            arrayString[i][0] = String.valueOf((10 - i) * 10) + "\t";
            for (int j = 1; j < StoreController.getStoreList().size() + 1; j++) {
                double grade = StoreController.getStore(StoreController.getStoreList().get(j - 1).getName()).grade();
                if (grade >= (10 - i) * 10) {
                    arrayString[i][j] = "*\t   ";
                } else {
                    arrayString[i][j] = " \t   ";
                }
            }
        }
        int k = 1;
        arrayString[10][0] = "  \t";
        for (Store store : StoreController.getStoreList()){
            arrayString[10][k++] = store.getName() + " ";
        }
        for (int i = 0; i < arrayString.length; i++){
            //println(Arrays.toString(arrayString[i]));
            for (int j = 0; j < StoreController.getStoreList().size() + 1; j++ ){
            print(arrayString[i][j]);
            }
            println("");
        }
        // System.out.printf("   \t%s \t \t \t \t \t \t");
    }

    private static void findStore(Scanner sc) {
        print("==== 상점 상세 보기 ====\n가게명 입력 :\t");
        String storeName = sc.next();
        for (Store store : StoreController.getStoreList()) {
            if (store.getName().contains(storeName)) {
                System.out.printf("가게명 : %s\n", store.getName());
                println(String.format("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t", 10, 20, 30, 40, 50, 60, 70, 80, 90,
                        100));
                double grade = store.grade();
                String str = "";
                for (int i = 0; i < grade / 10; i++) {
                    str += "*\t";
                }
                println(str);
                break;
            }
        }
    }

    private static void getAllSalon() {
        println("==== 미용실 보기 ====");
        for (Store store : StoreController.getStoreList()) {
            if (store.getEvent().equals("살롱"))
                System.out.printf("1. %s \t 평점 : %.2f\n", store.getName(), store.grade());
        }
    }

    private static void getAllRestaurant() {
        println("==== 음식점보기 ====");
        for (Store store : StoreController.getStoreList()) {
            if (store.getEvent().equals("식당"))
                System.out.printf("1. %s \t 평점 : %.2f\n", store.getName(), store.grade());
        }
    }

    private static void println(String str) {
        System.out.println(str);
    }

    private static void print(String str) {
        System.out.print(str);
    }
}
