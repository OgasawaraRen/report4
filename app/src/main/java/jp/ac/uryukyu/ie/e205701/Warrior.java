package jp.ac.uryukyu.ie.e205701;

import java.util.ArrayList;

public class Warrior extends Hero {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * 
     * @param name      戦士名
     * @param maximumHP 戦士のHP
     * @param attack    戦士の攻撃力
     * @param money     戦士の所持金
     */
    public Warrior(String name, int maximumHP, int attack, int money, ArrayList<Item> items) {
        super(name, maximumHP, attack, money, items);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        if (this.isDead())
            return;

        int damage = (int) (1.5 * this.getAttack());
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", this.getName(), opponent.getName(), damage);
        opponent.wounded(damage);
    }
}
