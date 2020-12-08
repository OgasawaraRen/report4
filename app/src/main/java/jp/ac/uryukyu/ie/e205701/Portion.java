package jp.ac.uryukyu.ie.e205701;

public class Portion extends Item {
    static final int RECOVERY_AMOUNT = 30;
    static final String DESCRIPTION = "体力が" + RECOVERY_AMOUNT + "回復する";
    static final String NAME = "回復薬";

    public Portion() {
        super(300, 150, DESCRIPTION, NAME);
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
        System.out.printf("%sは体力が大回復した!\n", target.getName());
    }

}
