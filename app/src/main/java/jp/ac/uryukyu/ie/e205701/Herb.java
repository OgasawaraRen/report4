package jp.ac.uryukyu.ie.e205701;

public class Herb extends Item {
    static final int RECOVERY_AMOUNT = 10;
    static final String DESCRIPTION = "体力が" + RECOVERY_AMOUNT + "回復する";
    static final String NAME = "薬草";

    public Herb() {
        super(100, 50, DESCRIPTION, NAME);
    }

    @Override
    void use(LivingThing target) {
        if (target.getHitPoint() == target.getMaxHP()) {
            System.out.printf("%sはこれ以上体力を回復できない..\n", target.getName());
            return;
        }

        target.setHitPoint(target.getHitPoint() + RECOVERY_AMOUNT);
        if (target.getMaxHP() < target.getHitPoint()) {
            target.setHitPoint(target.getMaxHP());
        }
        System.out.printf("%sは体力が回復した!\n", target.getName());
    }

}
