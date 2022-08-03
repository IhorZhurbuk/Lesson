package com.dota2;

import com.jdbc.DBWorker;
import com.jdbc.EngineJDBC;
import com.jdbc.Manager;

public class Main {
    public static void main(String[] args) throws NotUniqueHeroesException {
        DBWorker worker = new DBWorker();
        Manager manager = new Manager(worker);
        manager.createTable();

        EngineJDBC engineJDBC = new EngineJDBC(worker);
       /* engineJDBC.setHero("Pudge",10,12,20,400);
        engineJDBC.setHero("Rydge",11,10,20,420);
        engineJDBC.setHero("Phantom",20,12,15,300);
        engineJDBC.setHero("Asasiin",25,11,13,320);

            engineJDBC.setItem("Butter",25,10,5);
        engineJDBC.setItem("IronBranch",1,1,1);
        engineJDBC.setItem("Aganim Scepter",15,15,15);
        engineJDBC.setItem("Scadi",20,20,20);*/
      /*  engineJDBC.takesItem("Butter");
        engineJDBC.takesItem("IronBranch");
        engineJDBC.takesItem("Aganim Scepter");
        engineJDBC.takesItem("Scadi");*/
        Bench.items = new Item[]{engineJDBC.takesItem("Butter"),
                engineJDBC.takesItem("IronBranch"),
                engineJDBC.takesItem("Aganim Scepter"),
                engineJDBC.takesItem("Scadi")};

        engineJDBC.takesHero("Rydge");

        Pudge pudge = new Pudge(EngineJDBC.agility, EngineJDBC.intelect, EngineJDBC.strenght, EngineJDBC.health, EngineJDBC.names);
        engineJDBC.takesHero("Phantom");
        PhantomAssassin assassin = new PhantomAssassin(EngineJDBC.agility, EngineJDBC.intelect, EngineJDBC.strenght, EngineJDBC.health, EngineJDBC.names);
        Engine engine = new Engine(pudge, pudge);
        engine.fight();
        engineJDBC.setFight(Engine.data,Engine.log);

    }
}
