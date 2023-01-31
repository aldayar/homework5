public class Hero {
    private int heroHealth=350;
    private int heroAttack=24;
    private String heroPower="unlimitedAmmo";

    public Hero(int heroHealth, int heroAttack) {
        this.heroHealth = heroHealth;
        this.heroAttack = heroAttack;
    }
    public Hero(String forAll){

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

