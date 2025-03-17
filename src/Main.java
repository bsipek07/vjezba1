public class Main {
    public static void main(String[] args) {

        int znm1 = 0;
        int znm2 = 0;
        int znm3 = 0;
        int flag1 = 1;
        int flag2 = 0;
        int temp = 0;
        for (int i = 0; i < 10000; i++) {
            temp=i;
            while(temp>0) {
                znm1 = i % 10;
                znm2 = i / 10 % 10;
                znm3 = i / 100 % 10;

                temp /= 10;
            }
                if (Math.pow(znm1, 3) + Math.pow(znm2, 3) + Math.pow(znm3, 3) == i) System.out.println(i);




        }
    }
}