package org.variety.variety_aquatic.Entities.client;

import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.variety.variety_aquatic.Entities.custom.OpahEntity;
import org.variety.variety_aquatic.Entities.custom.WhaleSharkEntity;
import org.variety.variety_aquatic.Variety_Aquatic;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class OpahRenderer extends GeoEntityRenderer<OpahEntity> {
    public OpahRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new OpahModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureLocation(OpahEntity instance) {
        return new Identifier(Variety_Aquatic.MOD_ID, "textures/entity/opah_texture.png");
    }


    @Override
    public void preRender(MatrixStack poseStack, OpahEntity animatable, BakedGeoModel model, VertexConsumerProvider bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        super.preRender(poseStack, animatable, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
        poseStack.scale(1.0F, 1.0F, 1.0F); }

}