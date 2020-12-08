package jp.ac.uryukyu.ie.e205701;

/**
 * ヒーロークラス。 String name; //ヒーローの名前 int hitPoint; //ヒーローのHP int attack;
 * //ヒーローの攻撃力 boolean dead; //ヒーローの生死状態。true=死亡。 Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * 
     * @param name      ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack    ヒーローの攻撃力
     */
    public Hero(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint <= 0) {
            dead = true;
            System.out.printf("勇者%sは倒れた。\n", name);
        }
    }
}