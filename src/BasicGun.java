// Implement the Gun class
class BasicGun implements Gun {
    @Override
    public void upgrade() {
        System.out.println("Gun upgraded!");
    }

    @Override
    public void powerHit() {
        System.out.println("Gun power hit activated!");
    }
}
