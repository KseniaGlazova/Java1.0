import java.util.Arrays;

public class ArrayDiapazon{
public static void main(String[]args){
        int maxNegIndex = 0;
        int minPosIndex = 0;
        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {
                mas[i] = (int) ((Math.random() * 21) - 10);
                if (mas[i] < 0) {
                        if (mas[i] > mas[maxNegIndex])
                                maxNegIndex = i;
                        if (mas[maxNegIndex] >= 0)
                                maxNegIndex = i;
                } else if (mas[i] > 0) {
                        if (mas[i] < mas[minPosIndex])
                                minPosIndex = i;
                        if (mas[minPosIndex] <= 0)
                                minPosIndex = i;
                }


        }
        System.out.println(Arrays.toString(mas));
        int temp = mas[maxNegIndex];
        mas[maxNegIndex] = mas[minPosIndex];
        mas[minPosIndex] = temp;

        System.out.println(Arrays.toString(mas));
}
}
