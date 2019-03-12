public class GuessGame {

    Player p1;
    Player p2;

    public void startGame() {
        Player p1 = new Player();
        Player p2 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9 ...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.guessNumber();
            p2.guessNumber();

            guessp1 = p1.number;
            guessp2 = p2.number;

            p1isRight = guessp1 == targetNumber ? true : false;
            p2isRight = guessp2 == targetNumber ? true : false;

            if (p1isRight || p2isRight) {
                System.out.println("We have a winner! ");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Game over ");
                break;
            } else {
                System.out.println("Player will have to try again");
            }
        }

    }
}