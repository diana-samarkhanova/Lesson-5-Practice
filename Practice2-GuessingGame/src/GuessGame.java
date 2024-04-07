public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int nump1; //variable to store number of person 1
        int nump2; //variable to store number of person 2
        int nump3; //variable to store number of person 3

        boolean p1isrigth;
        boolean p2isrigth;
        boolean p3isrigth;

        int numToGuess = (int) (Math.random()*10);
        System.out.println("Я загадываю число от 0 до 9...");

        while(true){
            System.out.println("Число, котрое нужно угадать, - " + numToGuess);

            p1.guess();
            p2.guess();
            p3.guess();
            nump1 = p1.number;
            System.out.println("Первый игрок думает, что это " + nump1);
            nump2 = p2.number;
            System.out.println("Второй игрок думает, что это " + nump2);
            nump3 = p3.number;
            System.out.println("Третий игрок думает, что это " + nump3);

            if(nump1 == numToGuess){
                p1isrigth = true;
            } else {
                p1isrigth = false;
            }
            if(nump2 == numToGuess){
                p2isrigth = true;
            } else {
                p2isrigth = false;
            }
            if(nump3 == numToGuess){
                p3isrigth = true;
            } else {
                p3isrigth = false;
            }

            if(p1isrigth || p2isrigth || p3isrigth){
                System.out.println("У нас есть победитель!");
                System.out.println("Первый угадал? " + p1isrigth);
                System.out.println("Второй угадал? " + p2isrigth);
                System.out.println("Третий угадал? " + p3isrigth);
                System.out.println("Конец игры.");
                break;
            } else {
                System.out.println("Игроки должны попробовать еще раз.");
            }
        }




    }
}
