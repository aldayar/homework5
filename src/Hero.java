public class Hero {
    private int heroHealth;
    private int heroAttack;
    private String heroPower;


    public Hero(int heroHealth, int heroAttack, String heroPower) {
        this.heroHealth = heroHealth;
        this.heroAttack = heroAttack;
        this.heroPower = heroPower;
    }

    public Hero(int heroHealth, int heroAttack) {
        this.heroHealth = heroHealth;
        this.heroAttack = heroAttack;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroAttack() {
        return heroAttack;
    }

    public String getHeroPower() {
        return heroPower;
    }
}

