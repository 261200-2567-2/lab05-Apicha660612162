// Implement the MaxHammer character
class Warrior implements MaxHammer {
    private int level = 1;

    @Override
    public void levelUp() {
        level++;
        System.out.println("Warrior leveled up! Current level: " + level);
    }

    @Override
    public void shopping() {
        System.out.println("Warrior is shopping for new gear.");
    }

    @Override
    public void equipment(Weapon weapon) {
        if (weapon instanceof Hammer) {
            System.out.println("Warrior equipped a hammer.");
        } else {
            System.out.println("Warrior can only equip hammers.");
        }
    }

    @Override
    public void powerDrink() {
        System.out.println("Warrior used a power drink! Attack power increased.");
    }

    @Override
    public void block() {
        System.out.println("Warrior blocked an attack with the hammer!");
    }

    @Override
    public void attack(Character target) {
        System.out.println("Warrior attacked a target with the hammer!");
    }

    @Override
    public void spin() {
        System.out.println("Warrior performed a spinning hammer attack!");
    }
}

