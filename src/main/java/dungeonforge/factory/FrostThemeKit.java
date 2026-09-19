package dungeonforge.factory;

import dungeonforge.config.RandomSource;
import dungeonforge.core.Monster;
import dungeonforge.items.*;

public class FrostThemeKit implements ThemeKit{
    private final MonsterFactory factory;

    private static final String[] FLAVORS = {
            "Biting wind blows down the corridor, causing mild numbness.",
            "Snow drifts down lazily from the ceiling. How is it doing that?",
            "The wind picks up into a blizzard, and the snow turns into hail.",
            "The floor is covered in a thick layer of snow."
    };

    public FrostThemeKit(MonsterFactory factory) {
        this.factory = factory;
    }

    @Override
    public String themeName() {
        return "Frost";
    }

    @Override
    public Monster createMonster(int depth) {
        String id = RandomSource.getInstance().pick(factory.idsForTheme("frost"));
        return factory.create(id, depth);
    }

    @Override
    public Monster createBoss(int depth) {
        return factory.create("rime_tyrant", depth);
    }

    @Override
    public Item createLoot(int depth) {
        switch (RandomSource.getInstance().nextInt(4)) {
            case 0: return new Weapon("Rime Scythe", 3.0, 70 + depth * 13, 9 + depth);
            case 1: return new Armor("Blizzard Cloak", 2.0, 80 + depth * 12, 6 + depth);
            case 2: return new Potion("Warming Draught", 0.4, 30, 33 + depth * 3);
            default: return new Treasure("Frozen Tear", 1.0, 100 + depth * 18);
        }
    }

    @Override
    public String createRoomFlavor() {
        return RandomSource.getInstance().pick(FLAVORS);
    }
}
