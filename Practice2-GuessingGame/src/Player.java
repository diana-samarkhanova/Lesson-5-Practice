public class Player {
    int number = 0; //number is here
    public void guess(){
        number = (int) (Math.random()*10);
        System.out.println("Думаю, это число " + number);
    }
}
