public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] heroes = {new Magic(),new Medic(20), new Warrior()};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            if (heroes[i] instanceof Medic){
                Medic medic = (Medic) heroes[i];
                medic.increaseExperience();
                System.out.println("Medic just increased his experience: " + medic.getHealPoints());
            }
        }
    }
}