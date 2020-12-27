package info.hri7566.roses;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.BlockSoundGroup;

public class Rose {
    public static FlowerBlock gen() {
        return new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).nonOpaque());
    }

    public static void fix(Block b) {
        BlockRenderLayerMap.INSTANCE.putBlock(b, RenderLayer.getCutout());
    }
}
