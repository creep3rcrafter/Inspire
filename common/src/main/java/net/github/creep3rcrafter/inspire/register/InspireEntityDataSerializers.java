package net.github.creep3rcrafter.inspire.register;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;

public class InspireEntityDataSerializers {
    public static final EntityDataSerializer<Long> LONG;

    static {
        LONG = EntityDataSerializer.simple(FriendlyByteBuf::writeLong, FriendlyByteBuf::readLong);
        EntityDataSerializers.registerSerializer(LONG);
    }
}
