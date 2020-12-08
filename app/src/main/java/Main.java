import java.util.ArrayList;

import jp.ac.uryukyu.ie.e205701.*;

public class Main {
    static ArrayList<Item> allItems() {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Herb());
        items.add(new Portion());
        items.add(new Elixir());

        return items;
    }

    public static void main(String[] args) {
        ArrayList<Item> warriorItems = allItems();

        Warrior warrior = new Warrior("戦士", 100, 10, 0, warriorItems);
        Enemy enemy = new Enemy("スライム", 60, 3);

        System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());

        int turn = 0;
        while (warrior.isDead() == false && enemy.isDead() == false) {
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            double rand = Math.random();
            if (0.3 >= rand) {
                warrior.attackWithWeponSkill(enemy);
            } else if (0.6 >= rand && warrior.getItemsNum() > 0) {
                warrior.useRandomItem();
            } else {
                warrior.attack(enemy);
            }
            enemy.attack(warrior);
        }
        System.out.println("戦闘終了");
    }
}