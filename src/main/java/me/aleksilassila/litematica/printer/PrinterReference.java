package me.aleksilassila.litematica.printer;

import fi.dy.masa.malilib.util.StringUtils;
import net.minecraft.MinecraftVersion;

public class PrinterReference {
    public static final String MOD_ID = "forgematica_printer";
    public static final String MOD_KEY = "litematica-printer"; // For lang files since they shouldn't use a '_'
    public static final String MOD_VERSION = StringUtils.getModVersionString(MOD_ID);
    public static final String MC_VERSION = MinecraftVersion.field_25319.getName();
    public static final String MOD_STRING = MOD_ID + "-" + MC_VERSION + "-" + MOD_VERSION;
}
