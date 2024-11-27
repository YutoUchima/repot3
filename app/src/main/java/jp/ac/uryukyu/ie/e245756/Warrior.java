package jp.ac.uryukyu.ie.e245756;

public class Warrior extends LivingThing{
    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if( getHitPoint() > 0 ){
            int damage = (int)(getAttack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    @Override
    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() <= 0 ) {
            setDead(true);
            System.out.printf("戦士%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}
