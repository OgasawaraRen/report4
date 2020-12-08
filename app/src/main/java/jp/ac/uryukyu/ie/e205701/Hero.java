package jp.ac.uryukyu.ie.e205701;

import java.util.ArrayList;

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
     * @param money     ヒーローの所持金
     */

    private int money;
    private ArrayList<Item> items;

    public Hero(String name, int maximumHP, int attack, int money, ArrayList<Item> items) {
        super(name, maximumHP, attack);
        this.money = money;
        this.items = items;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public void useRandomItem() {
        if (items.size() == 0) {
            System.out.printf("%sはアイテムを持っていない!\n", this.getName());
            return;
        }

        Item item = items.remove((int) (Math.random() * items.size()));
        System.out.printf("%sは%sを使った!", this.getName(), item.getName());
        item.use(this);
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public int getItemsNum() {
        return items.size();
    }
}