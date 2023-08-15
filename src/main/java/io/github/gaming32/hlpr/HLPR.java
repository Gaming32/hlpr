package io.github.gaming32.hlpr;

import net.lenni0451.classtransform.TransformerManager;
import net.minecraft.modding.api.Mod;
import net.minecraft.modding.api.ModInfo;
import net.minecraft.modding.api.game.ContentUtil;
import net.minecraft.modding.api.game.Registries;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class HLPR implements Mod {
    public static final Supplier<Item> CROWBAR = Registries.ITEM.registerLater(
        "hlpr:crowbar",
        () -> new SwordItem(ContentUtil.itemId(), EnumToolMaterial.IRON)
    );

    @Override
    public void init(@NotNull ModInfo modInfo, @NotNull TransformerManager transformerManager) throws Exception {
        System.out.println("Exile, it takes your mind away");
    }
}
