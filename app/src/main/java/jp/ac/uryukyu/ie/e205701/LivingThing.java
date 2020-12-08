package jp.ac.uryukyu.ie.e205701;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false;

    }

    /**
     * 自身の生死状態を返すgetter。 呼び出された時にdeadを返す。
     * 
     * @return 死亡している時 ture, 生存している時 false
     */
    public boolean isDead() {
        return dead;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    /**
     * 自身の名前を返すgetter。 呼び出された時にnameを返す。
     * 
     * @return name :キャラクター名
     */
    public String getName() {
        return name;
    }

    /**
     * LivingThingへ攻撃するメソッド。 attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * 
     * @param hero 攻撃対象
     */
    public void attack(LivingThing opponent) {
        if (dead)
            return;

        int damage = (int) (Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * 
     * @param damage 受けたダメージ
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
