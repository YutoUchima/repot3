package jp.ac.uryukyu.ie.e245756;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest(){
        int defaultWarriorHp = 100;
        Warrior demowarrior = new Warrior("デモ戦士", defaultWarriorHp, 20);
        Enemy slime = new Enemy("スライムもどき", 100, 10);
               
        for(int i = 1; i <=3; i++){    
            int beforeHitPoint;
            beforeHitPoint = slime.getHitPoint();
            demowarrior.attackWithWeponSkill(slime);
            assertEquals(demowarrior.getAttack() * 1.5, beforeHitPoint - slime.getHitPoint());
        }   
    }
}
