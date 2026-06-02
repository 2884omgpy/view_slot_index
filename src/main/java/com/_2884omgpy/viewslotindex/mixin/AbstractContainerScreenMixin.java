package com._2884omgpy.viewslotindex.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.world.inventory.Slot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractContainerScreen.class)
public class AbstractContainerScreenMixin
{
    @Inject(method = "renderSlot", at = @At("RETURN"))
    private void rendSlotIndex(GuiGraphics guiGraphics, Slot slot, CallbackInfo ci)
    {
        Font font = Minecraft.getInstance().font;
        String indexString = String.valueOf(slot.index);
        int textX = slot.x + 8 - font.width(indexString) / 2;
        int textY = slot.y + 5;
        int color = 0xFFFFFFFF;
        guiGraphics.drawString(font, indexString, textX, textY, color, false);
    }
}
