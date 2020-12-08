package jp.ac.uryukyu.ie.e205701;

public class Elixir extends Item {
    static final String DESCRIPTION = "体力が全回復する";
    static final String NAME = "エリクサー";

    public Elixir() {
        super(10000, 5000, DESCRIPTION, NAME);
    }

    @Override
    void use(LivingThing target) {
        target.setHitPoint(target.getMaxHP());
        System.out.printf("%sは体力が全回復した!\n", target.getName());
    }

}
