package jp.ac.uryukyu.ie.e205701;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void weponSkillTest() {
        int defaultWarriorAttack = 10;
        Warrior demoWarrior = new Warrior("デモ戦士", 100, defaultWarriorAttack);
        Enemy slime = new Enemy("スライムもどき", 100, 10);
        for (int i = 0; i < 3; i++) {
            int beforeEnemyHP = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            int decreasedHP = beforeEnemyHP - slime.getHitPoint();
            assertEquals(decreasedHP, (int) (defaultWarriorAttack * 1.5));
        }

    }
}
