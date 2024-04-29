import java.util.Random;

public class Main {
    private static int[] coin = {1, 5, 10, 25, 50, 100};

    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;

        int target = 678;
        int remain = target - sum;
        int rand_p2 = 0;
        while (sum < 678) {
            // player 1
            if (remain % 15 == 1 || remain % 15 == 3 || remain % 15 == 5 || remain % 15 == 7 || remain % 15 == 9) {
                sum += 1;
                remain -= 1;
                System.out.println("Player 1 put 1 -> amount = " + sum + " remain = " + remain);
            } else if (remain % 15 == 10 || remain % 15 == 12 || remain % 15 == 14) {
                sum += 10;
                remain -= 10;
                System.out.println("Player 1 put 10 -> amount = " + sum + " remain = " + remain);
            } else if (remain % 15 == 11 || remain % 15 == 13) {
                sum += 5;
                remain -= 5;
                System.out.println("Player 1 put 5 -> amount = " + sum + " remain = " + remain);
            }

            if (sum == target) {
                System.out.println("Player 1 win!!!");
                break;
            }

            // player 2
            while (coin[rand_p2] + sum > target) {
                rand_p2 = rand.nextInt(coin.length);
            }
            sum += coin[rand_p2];
            remain -= coin[rand_p2];
            System.out.println("Player 2 put " + coin[rand_p2] + " -> amount = " + sum + " remain = " + remain);

            if (sum == target) {
                System.out.println("Player 2 win!!!");
                break;
            }

            rand_p2 = rand.nextInt(coin.length);
        }

    }
}