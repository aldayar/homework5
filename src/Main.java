public class Main {
    public static void main(String[] args) {
        Boss boss=new Boss();
        boss.setBossHealth(600);
        boss.setBossAttack(50);
        boss.setTypeOfGuard("iron");
        System.out.println("boss information: "+ boss.getBossHealth()+" ["+ boss.getTypeOfGuard()+ "] "+boss.getBossAttack());

        Hero hero =new Hero (500,45,"Fireball");
        System.out.println("hero iformation: "+ hero.getHeroAttack()+ " "+ hero.getHeroHealth());

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i]);

        }



    }

    public static Hero[] createHeroes () {

        Hero hero = new Hero(220, 29, " Magic");
        System.out.println(hero);
        Hero hero2 = new Hero(300, 20, "Warrior");
        System.out.println(hero2);
        Hero hero3 = new Hero(200, 23, "Kinetc");
        System.out.println(hero3);
        Hero[] heroes=new Hero[]{hero,hero2,hero3};
        return heroes;
    }



}