package info.hri7566.roses;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlocksInit {
    public static String MODID;

    public static final Block ROSE = Rose.gen();
    public static final Block CYANROSE = Rose.gen();
    public static final Block BLUEROSE = Rose.gen();
    public static final Block BLACKROSE = Rose.gen();
    public static final Block GRAYROSE = Rose.gen();
    public static final Block BROWNROSE = Rose.gen();
    public static final Block GREENROSE = Rose.gen();
    public static final Block LIGHTBLUEROSE = Rose.gen();
    public static final Block LIGHTGRAYROSE = Rose.gen();
    public static final Block LIMEROSE = Rose.gen();
    public static final Block MAGENTAROSE = Rose.gen();
    public static final Block ORANGEROSE = Rose.gen();
    public static final Block PINKROSE = Rose.gen();
    public static final Block PURPLEROSE = Rose.gen();
    public static final Block WHITEROSE = Rose.gen();
    public static final Block YELLOWROSE = Rose.gen();

    public static void registerBlocks(String mi) {
        MODID = mi;

        Rose.fix(ROSE);
        Rose.fix(CYANROSE);
        Rose.fix(BLUEROSE);
        Rose.fix(BLACKROSE);
        Rose.fix(GRAYROSE);
        Rose.fix(BROWNROSE);
        Rose.fix(GREENROSE);
        Rose.fix(LIGHTBLUEROSE);
        Rose.fix(LIGHTGRAYROSE);
        Rose.fix(LIMEROSE);
        Rose.fix(MAGENTAROSE);
        Rose.fix(ORANGEROSE);
        Rose.fix(PINKROSE);
        Rose.fix(PURPLEROSE);
        Rose.fix(WHITEROSE);
        Rose.fix(YELLOWROSE);

        register(ROSE, "rose");
        register(CYANROSE, "cyan_rose");
        register(BLUEROSE, "blue_rose");
        register(BLACKROSE, "black_rose");
        register(GRAYROSE, "gray_rose");
        register(BROWNROSE, "brown_rose");
        register(GREENROSE, "green_rose");
        register(LIGHTBLUEROSE, "light_blue_rose");
        register(LIGHTGRAYROSE, "light_gray_rose");
        register(LIMEROSE, "lime_rose");
        register(MAGENTAROSE, "magenta_rose");
        register(ORANGEROSE, "orange_rose");
        register(PINKROSE, "pink_rose");
        register(PURPLEROSE, "purple_rose");
        register(WHITEROSE, "white_rose");
        register(YELLOWROSE, "yellow_rose");
    }

    public static Block register(Block block, String name) {
        Block b = (Block)Registry.register(Registry.BLOCK, new Identifier(MODID, name), block);
        Registry.register(Registry.ITEM, new Identifier(MODID, name), new BlockItem(b, new Item.Settings().group(ItemGroup.DECORATIONS)));
        return b;
    }
}
