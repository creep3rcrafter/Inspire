package net.github.creep3rcrafter.inspire.client.model.entity;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.world.entity.animal.horse.AbstractHorse;

public class WitherSkeletonHorseEntityModel<T extends AbstractHorse> extends WitherSkeletonHorseModel<T> {
    public WitherSkeletonHorseEntityModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition getModelData(CubeDeformation dilation) {
        return WitherSkeletonHorseModel.createBodyMesh(dilation);
    }
}
