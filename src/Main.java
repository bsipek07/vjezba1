public class Main {
    public static void main(String[] args) {

        int znm = 0;
        int broj=0;
        int temp = 0;
        for (int i = 0; i < 10000; i++) {

            temp=i;
            while(temp>0) {
                znm=temp%10;
                broj += Math.pow(znm,3);
                temp /= 10;
            }

                if(broj==i) System.out.println(i);
                else broj=0;
                //if (Math.pow(i%10, 3) + Math.pow(i/10%10, 3) + Math.pow(i/100%10, 3) == i) System.out.println(i);




        }
    }
}