package org.thinkingstudio.forgematica.printer;

import me.aleksilassila.litematica.printer.LitematicaMixinMod;
import me.aleksilassila.litematica.printer.PrinterReference;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLLoader;
import org.thinkingstudio.mafglib.util.ForgeUtils;


@Mod(value = PrinterReference.MOD_ID)
public class ForgematicaPrinter {
    public ForgematicaPrinter() {
        if (FMLLoader.getDist().isClient()) {
            ModContainer modContainer = ModLoadingContext.get().getActiveContainer();

            ForgeUtils.getInstance().getClientModIgnoredServerOnly(modContainer);
            LitematicaMixinMod.onInitialize();
        }
    }
}
