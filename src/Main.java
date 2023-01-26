public class Main {
    public static void main(String[] args) {
        Boss boss=new Boss();
        boss.setBossHealth(600);
        boss.setBossAttack(50);
        boss.setTypeOfGuard("titan");
        System.out.println("boss information: "+ boss.getBossHealth()+" ["+ boss.getTypeOfGuard()+ "] "+boss.getBossAttack());

        Hero hero= new Hero();
        System.out.println("hero iformation: "+ hero.getHeroAttack()+ " "+ hero.getHeroHealth());

    }

}