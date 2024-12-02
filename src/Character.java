// Define the Character interface
interface Character {
    void levelUp();
    void shopping();
    void equipment(Weapon weapon);
    void powerDrink();
}
// Define the Weapon interface
interface Weapon {
    void upgrade();
}
// Define the MaxHammer interface extending Character
interface MaxHammer extends Character {
    void block();
    void attack(Character target);
    void spin();
}

// Define the ShockBom interface extending Character
interface ShockBom extends Character {
    void changeBullet();
    void shot(Character target);
    void shockBom();
}
// Define the Hammer interface extending Weapon
interface Hammer extends Weapon {
    void buffAttack();
}

// Define the Gun interface extending Weapon
interface Gun extends Weapon {
    void powerHit();
}