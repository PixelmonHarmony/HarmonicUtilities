package io.github.waterpicker.harmonicutilties.forge

import io.github.waterpicker.harmonicutilities.configurate.typeserializers.MinecraftSerializers
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
import java.util.*

@Mod("harmonicutilities")
class HarmonicUtilitiesModForge {
    init {
        with(thedarkcolour.kotlinforforge.forge.MOD_BUS) {
            addListener(this@HarmonicUtilitiesModForge::initialize)
        }
    }

    fun initialize(event: FMLCommonSetupEvent) {
        MinecraftSerializers.collection()
    }

}