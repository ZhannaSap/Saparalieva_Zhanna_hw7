public class Medic extends Hero{
    private int healPoints;

    public Medic(int healPoints) {
        super();
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic  has applied the INSTANT HEALING superpower.");
    }
    public void increaseExperience(){
        healPoints += healPoints * 0.1;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }
}
