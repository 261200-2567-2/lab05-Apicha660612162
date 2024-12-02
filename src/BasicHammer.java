// Implement the Hammer class
class BasicHammer implements Hammer {
    @Override
    public void upgrade() {
        System.out.println("Hammer upgraded!");
    }

    @Override
    public void buffAttack() {
        System.out.println("Hammer attack power increased!");
    }
}
