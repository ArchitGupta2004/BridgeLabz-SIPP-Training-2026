class GameCharacter {
    String characterName;
    public GameCharacter(String name) { this.characterName = name; }
    public void performAttack() { System.out.println(characterName + " does a basic attack."); }
}

class Warrior extends GameCharacter {
    public Warrior(String name) { super(name); }
    @Override
    public void performAttack() { System.out.println(characterName + " swings a mighty sword!"); }
}

class Mage extends GameCharacter {
    public Mage(String name) { super(name); }
    @Override
    public void performAttack() { System.out.println(characterName + " casts a fireball!"); }
}

class Archer extends GameCharacter {
    public Archer(String name) { super(name); }
    @Override
    public void performAttack() { System.out.println(characterName + " shoots a flaming arrow!"); }
}

public class GameCharacterSystem {
    public static void startBattle(GameCharacter[] characters) {
        int wCount = 0, mCount = 0, aCount = 0;
        
        for (GameCharacter c : characters) {
            c.performAttack();
            if (c instanceof Warrior) wCount++;
            else if (c instanceof Mage) mCount++;
            else if (c instanceof Archer) aCount++;
        }
        
        System.out.println("\nBattle Summary: ");
        System.out.println("Warriors: " + wCount + ", Mages: " + mCount + ", Archers: " + aCount);
    }

    public static void main(String[] args) {
        GameCharacter[] team = {
            new Warrior("Arthur"),
            new Mage("Merlin"),
            new Archer("Robin"),
            new Warrior("Conan")
        };
        startBattle(team);
    }
}
