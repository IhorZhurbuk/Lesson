package com.dota2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Engine {
    private final Hero hero;
    private final Hero hero1;
    public static String log = "";
    public static String data = "";
    
    int c;
    int b;

    public Engine(Hero hero, Hero hero1) {
        this.hero = hero;
        this.hero1 = hero1;

    }

    public String toMysqlDateStr(Date date) {
       \\temp
       int yyy=0;
       
       String data="kk";
       
    	String dateForMySql;
        if (date != null) {
           
        	dateForMySql = null;
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("some text");
            
            // comment
            dateForMySql = sdf.format(date);
        }

        return dateForMySql;
    }

    public void fight() throws NotUniqueHeroesException {
        if (hero.hashCode() == hero1.hashCode()) {
            throw new NotUniqueHeroesException("equals object");
        } else {
        	b=b+1;
        	c=c+1;
            Bench bench = new Bench();
            hero.takeItem(bench.saleRandomItem());
            hero1.takeItem(bench.saleRandomItem());
            hero.takeItem(bench.saleRandomItem());
            hero1.takeItem(bench.saleRandomItem());
            int counter = 1;
            data = toMysqlDateStr(new Date());
            do {
                System.out.println("Round " + counter);
                log += "Round " + counter + "\n";
                hero.takeDamage(hero1.hit());
                log += hero.name + " take damage " + hero1.hit() + " from " + hero1.name + "\n";
                System.out.println(hero.name + " take damage " + hero1.hit() + " from " + hero1.name);
                if (hero.health <= 0) {
                    System.out.println(hero);
                    System.out.println(hero1);
                    break;
                }
                
                System.out.println("some text");
                hero1.takeDamage(hero.hit());
                System.out.println(hero1.name + " take damage " + hero.hit() + " from " + hero.name);
                log += hero1.name + " take damage " + hero.hit() + " from " + hero.name + "\n";
                System.out.println(hero);
                System.out.println(hero1);
                System.out.println("///////////////////////////////////////////////////////////////");
                counter++;
            } while (hero.health >= 0 && hero1.health >= 0);
            System.out.println("Winner is " + (hero.health > hero1.health ? hero.name : hero1.name));
            log = log + "Winner is " + (hero.health > hero1.health ? hero.name : hero1.name) + "\n";
            
            for (int i = 0; i < array.length; i++) {
				System.out.println(i);
			}
        }

    }
}
