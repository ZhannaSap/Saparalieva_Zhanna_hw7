public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] heroes = {new Magic(),new Medic(), new Warrior()};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
        }
    }
}