package com._2884omgpy.viewslotindex;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ViewSlotIndex.MOD_ID)
public class ViewSlotIndex
{
    public static final String MOD_ID = "viewslotindex";

    public ViewSlotIndex(FMLJavaModLoadingContext context)
    {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
