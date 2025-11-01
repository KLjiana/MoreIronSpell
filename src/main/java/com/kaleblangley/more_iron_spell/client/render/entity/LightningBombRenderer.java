package com.kaleblangley.more_iron_spell.client.render.entity;

import com.kaleblangley.more_iron_spell.common.entity.LightningBombEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class LightningBombRenderer extends EntityRenderer<LightningBombEntity> {
    public LightningBombRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public void render(LightningBombEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, buffer, packedLight);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull LightningBombEntity entity) {
        return TextureAtlas.LOCATION_BLOCKS;
    }
}
