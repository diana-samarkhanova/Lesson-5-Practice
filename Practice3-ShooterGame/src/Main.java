import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        Weapon[] weapon = new Weapon[5];
        weapon[0] = new Gun();
        weapon[1] = new MachineGun();
        weapon[2] = new RPG();
        weapon[3] = new Slingshot();
        weapon[4] = new WaterGun();

        System.out.format("У игрока %d слотов с  оружием,"
                + " введите номер, чтобы выстрелить,"
                + "-1 чтобы выйти%n",
                player.getSlotsCount());
        int slot;

        do{
            slot = scanner.nextInt();

            if(slot != (-1)){
                player.shotWithWeapon(slot-1);
            } else if(slot < -1) {
                System.out.println("Неправильный ввод! Повторите еще раз!");
            }
        } while(slot != -1);

        System.out.println("Game over!");

    }
}