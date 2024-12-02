// Implement the ShockBom character
class Gunner implements ShockBom {
    private int level = 1;

    @Override
    public void levelUp() {
        level++;
        System.out.println("Gunner leveled up! Current level: " + level);
    }

    @Override
    public void shopping() {
        System.out.println("Gunner is shopping for new ammunition.");
    }

    @Override
    public void equipment(Weapon weapon) {
        if (weapon instanceof Gun) {
            System.out.println("Gunner equipped a gun.");
        } else {
            System.out.println("Gunner can only equip guns.");
        }
    }

    @Override
    public void powerDrink() {
        System.out.println("Gunner used a power drink! Speed and accuracy increased.");
    }

    @Override
    public void changeBullet() {
        System.out.println("Gunner changed the gun's magazine.");
    }

    @Override
    public void shot(Character target) {
        System.out.println("Gunner shot a target!");
    }

    @Override
    public void shockBom() {
        System.out.println("Gunner launched a shock bomb!");
    }
}