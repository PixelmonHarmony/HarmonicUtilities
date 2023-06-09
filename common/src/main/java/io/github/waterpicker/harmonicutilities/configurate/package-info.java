/*
 * Copyright 2020 zml
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Configurate bindings for Fabric.
 *
 * <p>Most direct access to Configurate should occur through
 * {@link io.github.waterpicker.harmonicutilities.configurate.HarmonicUtilities}.
 *
 * <p>To convert between NBT tags and {@link org.spongepowered.configurate.ConfigurationNode nodes},
 * the {@link io.github.waterpicker.harmonicutilities.configurate.NbtNodeAdapter} can interpret the types.
 *
 * <p>{@link org.spongepowered.configurate.extra.dfu.v4.ConfigurateOps} provides basic
 * integration between DataFixerUpper's type system and Configurate nodes. Other
 * integration for {@link com.mojang.serialization.Codec Codecs} is in the
 * {@link org.spongepowered.configurate.extra.dfu.v4.DfuSerializers} class.
 */
package io.github.waterpicker.harmonicutilities.configurate;
