import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Gift4_2 {
    public static void main(String[] args) throws IOException {
        makeAGift();
    }
    public static void makeAGift() throws IOException {
        ArrayList<Sweets> sweets = new ArrayList<>();
        boolean formed = false;
        int totalPrice = 0;
        int totalWeight = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Нажми соответствующую цифру, чтобы выбрать сладость и добавить в подарок: ");
        System.out.println("1 - конфеты \"Маска\" \n2- конфеты \"Мишка в лесу\" \n3 - леденцы \"Chupa-Chups\" \n4 - закончить " +
                "собирать подарок");
        while (!formed){
            String choice = reader.readLine();
            switch (choice){
                case "1":
                    Candy mask = new Candy("Конфеты \"Маска\"", 50, 80, "400 каллорий на 100 гр");
                    sweets.add(mask);
                    totalPrice += mask.getPrice();
                    totalWeight += mask.getWeight();
                    System.out.println("Конфеты \"Маска\" теперь лежат в твоем подарке!");
                    break;
                case "2":
                    Candy bearInForest = new Candy("Конфеты \"Мишка в лесу\"", 100, 500, "350 каллорий на 100 гр");
                    sweets.add(bearInForest);
                    totalPrice += bearInForest.getPrice();
                    totalWeight += bearInForest.getWeight();
                    System.out.println("Конфеты \"Мишка в лесу\" теперь лежат в твоем подарке!");
                    break;
                case "3":
                    LollyPop chups = new LollyPop("Леденец \"Chupa-Chups\"", 500, 1000, "423 каллории на 100 гр");
                    sweets.add(chups);
                    totalPrice += chups.getPrice();
                    totalWeight += chups.getWeight();
                    System.out.println("Леденцы \"Chupa-Chups\" теперь лежат в твоем подарке!");
                    break;
                case "4":
                    formed = true;
                    break;
            }
        }
        int count = 0;
        System.out.println("Состав подарка: ");
        for (Sweets sweet:sweets) {
            count++;
            System.out.println(count + ". " + sweet.getName() + " - " + sweet.getAdditionalInfo());
        }
        System.out.println(String.format("\nОбщий вес подарка: %s гр.\nОбщая цена подарка: %s руб.", totalWeight, totalPrice));
    }
}
