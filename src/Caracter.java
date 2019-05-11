public abstract class Caracter {

    protected int level;
    protected int health;
    protected int strength;
    protected int agility;
    protected int intelligence;

    public Caracter(int level, int health, int strength, int agility, int intelligence) {
        this.level = level;
        this.health = health;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }
}
