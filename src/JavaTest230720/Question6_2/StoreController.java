package JavaTest230720.Question6_2;

import java.util.ArrayList;
import java.util.Random;

public class StoreController {
    private static ArrayList<Store> storeList = new ArrayList<Store>();

    public static void setStore() {
        Random ran = new Random();

        storeList.add(new Restaurant("HAE", "식당", ran.nextInt(8000, 10000), ran.nextInt(70, 100), ran.nextInt(70, 100),
                ran.nextInt(70, 100)));
        storeList.add(new Restaurant("정림이네", "식당", ran.nextInt(8000, 10000), ran.nextInt(70, 100), ran.nextInt(70, 100),
                ran.nextInt(70, 100)));
        storeList.add(new Restaurant("왕뼈사랑", "식당", ran.nextInt(8000, 10000), ran.nextInt(70, 100), ran.nextInt(70, 100),
                ran.nextInt(70, 100)));

        storeList.add(new Salon("박승철", "살롱", ran.nextInt(8000, 10000), ran.nextInt(70, 100), ran.nextInt(70, 100)));
        storeList.add(new Salon("이가자", "살롱", ran.nextInt(8000, 10000), ran.nextInt(70, 100), ran.nextInt(70, 100)));
        storeList.add(new Salon("리안", "살롱", ran.nextInt(8000, 10000), ran.nextInt(70, 100), ran.nextInt(70, 100)));
    }

    public static ArrayList<Store> getStoreList() {
        return storeList;
    }

    public static Store getStore(String storeName) {
        for (Store store : getStoreList()) {
            if (storeName.equals(store.getName())) {
                return store;
            }
        }
        return null;
    }
}
