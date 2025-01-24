package com.northsunstrider.dota2;

/**
 * @author North
 * @date 2021/05/09
 */
public class Luna {

    /**
     * @param args
     */
    public static void main(String[] args) {
        moonGlaivesOldVersion();
        System.out.println("-------------------------------");
        moonGlaivesVersion728();
        System.out.println("-------------------------------");
        moonGlaivesVersion737();
    }

    public static void moonGlaivesOldVersion() {
        int i[] = {1, 2, 3, 6};
        int attack = 100;
        int totalDamage;
        for (int x = 0; x < i.length; x++) {
            System.out.print(attack);
            double temp = attack;
            totalDamage = attack;
            for (int y = 0; y < i[x]; y++) {
                temp = temp * 0.65;
                totalDamage += temp;
                System.out.print("\t" + temp);
            }
            System.out.println();
            System.out.println(totalDamage);
        }

    }

    public static void moonGlaivesVersion728() {
        int i[] = {3, 4, 5, 6};
        double j[] = {0.5, 0.56, 0.62, 0.68};
        int attack = 100;
        int totalDamage;
        for (int x = 0; x < i.length; x++) {
            System.out.print(attack);
            double temp = attack;
            totalDamage = attack;
            for (int y = 0; y < i[x]; y++) {
                temp = temp * j[x];
                totalDamage += temp;
                System.out.print("\t" + temp);
            }
            System.out.println();
            System.out.println(totalDamage);
        }
    }

    public static void moonGlaivesVersion737() {
        int i[] = {3, 4, 5, 6};
        double j[] = {0.5, 0.55, 0.60, 0.65};
        //天赋-8%月刃衰减
        //double j[] = {0.5+0.08, 0.55+0.08, 0.60+0.08, 0.65+0.08};
        int attack = 100;
        int totalDamage;
        for (int x = 0; x < i.length; x++) {
            System.out.print(attack);
            double temp = attack;
            totalDamage = attack;
            for (int y = 0; y < i[x]; y++) {
                temp = temp * j[x];
                totalDamage += temp;
                System.out.print("\t" + temp);
            }
            System.out.println();
            System.out.println(totalDamage);
        }
    }

}
