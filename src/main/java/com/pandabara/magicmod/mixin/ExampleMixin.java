package com.pandabara.magicmod.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class ExampleMixin {
	@SuppressWarnings({"PMD.UnusedPrivateMethod","PMD.UnusedFormalParameter"})
	@Inject(method = "loadWorld", at = @At("HEAD"))
	private void init(final CallbackInfo info) {
		// Injected by Mixin
	}
}
