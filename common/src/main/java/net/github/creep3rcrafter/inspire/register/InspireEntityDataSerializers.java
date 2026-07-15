package net.github.creep3rcrafter.inspire.register;

import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;

public class InspireEntityDataSerializers {
    public static final EntityDataSerializer<Long> LONG;

    static {
        LONG = EntityDataSerializer.forValueType(StreamCodec.of((buf, val) -> buf.writeLong(val), buf -> buf.readLong()));
        EntityDataSerializers.registerSerializer(LONG);
    }
}
