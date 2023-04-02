package io.github.waterpicker.harmonicutilities.fabric

import io.github.waterpicker.harmonicutilities.configurate.typeserializers.MinecraftSerializers
import net.fabricmc.api.ModInitializer

class HarmonicUtilitiesModFabric : ModInitializer {
    override fun onInitialize() {
        // initialize serializers early, fail fast
        MinecraftSerializers.collection()
    }
}