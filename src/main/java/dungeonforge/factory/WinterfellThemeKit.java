package dungeonforge.factory;

import dungeonforge.config.RandomSource;
import dungeonforge.core.Monster;
import dungeonforge.items.*;

public class WinterfellThemeKit implements ThemeKit {
    private final MonsterFactory factory;

    private static final String[] FLAVORS = {
            "The biting cold numbs your face as wolves howl in the distance.",
            "The smell of smoke carries on the wind, wonder who's camping in this inhospitable place.",
            "The thud of heavy snow falling from tree branches echoes nearby.",
            "Rabbit tracks lead into the next area, hopefully it hasn't been eaten yet."
    };

    public WinterfellThemeKit(MonsterFactory factory) {
        this.factory = factory;
    }

    @Override
    public String themeName() {
        return "Winterfell";
    }

    @Override
    public Monster createMonster(int depth) {
        String id = RandomSource.getInstance().pick(factory.idsForTheme("winterfell"));
        return factory.create(id, depth);
    }

    @Override
    public Monster createBoss(int depth) {
        return factory.create("white_walker_king", depth);
    }

    @Override
    public Item createLoot(int depth) {
        switch (RandomSource.getInstance().nextInt(4)) {
            case 0: return new Weapon("Valerian Steel Greatsword", 6.0, 80 + depth * 10, 6 + depth);
            case 1: return new Armor("Valerian Steel Half-plate", 3.0, 45 + depth * 8, 5 + depth);
            case 2: return new Potion("Flagon of Mead", 0.4, 25, 18 + depth * 3);
            default: return new Treasure("Dragon Egg", 1.0, 60 + depth * 15);
        }
    }

    @Override
    public String createRoomFlavor() {
        return RandomSource.getInstance().pick(FLAVORS);
    }
}
