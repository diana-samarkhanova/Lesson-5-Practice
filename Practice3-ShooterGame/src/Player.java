//contains list of guns and method to shoot
public class Player {
    private Weapon[] weaponSlots;

    public Player(){
        weaponSlots = new Weapon[] {
                new Gun(),
                new MachineGun(),
                new RPG(),
                new Slingshot(),
                new WaterGun()
        };
    }

    public int getSlotsCount(){
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot){
        if(slot < 0 || slot >= weaponSlots.length){
            System.out.println("Неправильный ввод! Введите число от 1 до 5.");
            return;
        }
        Weapon weapon = weaponSlots[slot]; //getting a weapon from the slot
        weapon.shot(); //shooting

    }
}
