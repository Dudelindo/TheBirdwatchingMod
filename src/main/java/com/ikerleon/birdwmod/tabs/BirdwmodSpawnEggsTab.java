package com.ikerleon.birdwmod.tabs;

import com.ikerleon.birdwmod.init.BirdwmodItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BirdwmodSpawnEggsTab extends CreativeTabs {
    public BirdwmodSpawnEggsTab(String label) {
        super(label);
    }

    public ItemStack getTabIconItem() {
        return new ItemStack(BirdwmodItems.REDNECKEDNIGHTJAR_SPAWNEGG);
    }
}
