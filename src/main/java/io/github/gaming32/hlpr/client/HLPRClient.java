package io.github.gaming32.hlpr.client;

import io.github.gaming32.hlpr.HLPR;
import net.minecraft.client.gui.screens.inventory.CreativeTab;
import net.minecraft.modding.api.ClassEventHandler;
import net.minecraft.modding.api.ModInfo;
import net.minecraft.modding.api.Side;
import net.minecraft.modding.api.event.client.ClientInitializingEvent;
import net.minecraft.modding.api.game.client.ClientRegistries;

@Side.Client
public class HLPRClient implements ClassEventHandler<ClientInitializingEvent> {
    public static final CreativeTab TAB = ClientRegistries.CREATIVE_TAB.register("hlpr:hlpr", new CreativeTab("hlpr"));

    @Override
    public void handle(ModInfo mod, ClientInitializingEvent event) {
        TAB.setIconItem(HLPR.CROWBAR.get());
    }
}
