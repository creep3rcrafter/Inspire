package net.github.creep3rcrafter.inspire.client.gui.screens.inventory;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.platform.Lighting;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Matrix4f;
import com.mojang.math.Vector3f;
import net.github.creep3rcrafter.inspire.Inspire;
import net.github.creep3rcrafter.inspire.inventory.CurseMenu;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.EnchantmentNames;
import net.minecraft.client.model.BookModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;

import java.util.List;

public class CurseScreen extends AbstractContainerScreen<CurseMenu> {
    private static final ResourceLocation ENCHANTING_TABLE_LOCATION = new ResourceLocation(InspireCommon.MOD_ID, "textures/gui/container/cursing_table.png");
    private static final ResourceLocation ENCHANTING_BOOK_LOCATION = new ResourceLocation("textures/entity/enchanting_table_book.png");
    private final RandomSource random = RandomSource.create();
    public int time;
    public float flip;
    public float oFlip;
    public float flipT;
    public float flipA;
    public float open;
    public float oOpen;
    private BookModel bookModel;
    private ItemStack last;

    public CurseScreen(CurseMenu curseMenu, Inventory inventory, Component component) {
        super(curseMenu, inventory, component);
        this.last = ItemStack.EMPTY;
    }

    protected void init() {
        super.init();
        this.bookModel = new BookModel(this.minecraft.getEntityModels().bakeLayer(ModelLayers.BOOK));
    }

    public void containerTick() {
        super.containerTick();
        this.tickBook();
    }

    public boolean mouseClicked(double d, double e, int i) {
        int j = (this.width - this.imageWidth) / 2;
        int k = (this.height - this.imageHeight) / 2;

        for (int l = 0; l < 3; ++l) {
            double f = d - (double) (j + 60);
            double g = e - (double) (k + 14 + 19 * l);
            if (f >= (double) 0.0F && g >= (double) 0.0F && f < (double) 108.0F && g < (double) 19.0F && ((CurseMenu) this.menu).clickMenuButton(this.minecraft.player, l)) {
                this.minecraft.gameMode.handleInventoryButtonClick(((CurseMenu) this.menu).containerId, l);
                return true;
            }
        }

        return super.mouseClicked(d, e, i);
    }

    protected void renderBg(PoseStack poseStack, float f, int i, int j) {
        Lighting.setupForFlatItems();
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, ENCHANTING_TABLE_LOCATION);
        int k = (this.width - this.imageWidth) / 2;
        int l = (this.height - this.imageHeight) / 2;
        this.blit(poseStack, k, l, 0, 0, this.imageWidth, this.imageHeight);
        int m = (int) this.minecraft.getWindow().getGuiScale();
        RenderSystem.viewport((this.width - 320) / 2 * m, (this.height - 240) / 2 * m, 320 * m, 240 * m);
        Matrix4f matrix4f = Matrix4f.createTranslateMatrix(-0.34F, 0.23F, 0.0F);
        matrix4f.multiply(Matrix4f.perspective((double) 90.0F, 1.3333334F, 9.0F, 80.0F));
        RenderSystem.backupProjectionMatrix();
        RenderSystem.setProjectionMatrix(matrix4f);
        poseStack.pushPose();
        PoseStack.Pose pose = poseStack.last();
        pose.pose().setIdentity();
        pose.normal().setIdentity();
        poseStack.translate((double) 0.0F, (double) 3.3F, (double) 1984.0F);
        float g = 5.0F;
        poseStack.scale(5.0F, 5.0F, 5.0F);
        poseStack.mulPose(Vector3f.ZP.rotationDegrees(180.0F));
        poseStack.mulPose(Vector3f.XP.rotationDegrees(20.0F));
        float h = Mth.lerp(f, this.oOpen, this.open);
        poseStack.translate((double) ((1.0F - h) * 0.2F), (double) ((1.0F - h) * 0.1F), (double) ((1.0F - h) * 0.25F));
        float n = -(1.0F - h) * 90.0F - 90.0F;
        poseStack.mulPose(Vector3f.YP.rotationDegrees(n));
        poseStack.mulPose(Vector3f.XP.rotationDegrees(180.0F));
        float o = Mth.lerp(f, this.oFlip, this.flip) + 0.25F;
        float p = Mth.lerp(f, this.oFlip, this.flip) + 0.75F;
        o = (o - (float) Mth.fastFloor((double) o)) * 1.6F - 0.3F;
        p = (p - (float) Mth.fastFloor((double) p)) * 1.6F - 0.3F;
        if (o < 0.0F) {
            o = 0.0F;
        }

        if (p < 0.0F) {
            p = 0.0F;
        }

        if (o > 1.0F) {
            o = 1.0F;
        }

        if (p > 1.0F) {
            p = 1.0F;
        }

        //this.bookModel.setupAnim(0.0F, o, p, h);
        //MultiBufferSource.BufferSource bufferSource = MultiBufferSource.immediate(Tesselator.getInstance().getBuilder());
        //VertexConsumer vertexConsumer = bufferSource.getBuffer(this.bookModel.renderType(ENCHANTING_BOOK_LOCATION));
        //this.bookModel.renderToBuffer(poseStack, vertexConsumer, 15728880, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        //bufferSource.endBatch();
        poseStack.popPose();
        RenderSystem.viewport(0, 0, this.minecraft.getWindow().getWidth(), this.minecraft.getWindow().getHeight());
        RenderSystem.restoreProjectionMatrix();
        Lighting.setupFor3DItems();
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        EnchantmentNames.getInstance().initSeed((long) ((CurseMenu) this.menu).getEnchantmentSeed());
        int q = ((CurseMenu) this.menu).getGoldCount();

        for (int r = 0; r < 3; ++r) {
            int s = k + 60;
            int t = s + 20;
            this.setBlitOffset(0);
            RenderSystem.setShader(GameRenderer::getPositionTexShader);
            RenderSystem.setShaderTexture(0, ENCHANTING_TABLE_LOCATION);
            int u = ((CurseMenu) this.menu).costs[r];
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            if (u == 0) {
                this.blit(poseStack, s, l + 14 + 19 * r, 0, 185, 108, 19);
            } else {
                String string = "" + u;
                int v = 86 - this.font.width(string);
                FormattedText formattedText = EnchantmentNames.getInstance().getRandomName(this.font, v);
                int w = 6839882;
                if ((q < r + 1 || this.minecraft.player.experienceLevel < u) && !this.minecraft.player.getAbilities().instabuild) {
                    this.blit(poseStack, s, l + 14 + 19 * r, 0, 185, 108, 19);
                    this.blit(poseStack, s + 1, l + 15 + 19 * r, 16 * r, 239, 16, 16);
                    this.font.drawWordWrap(formattedText, t, l + 16 + 19 * r, v, (w & 16711422) >> 1);
                    w = 4226832;
                } else {
                    int x = i - (k + 60);
                    int y = j - (l + 14 + 19 * r);
                    if (x >= 0 && y >= 0 && x < 108 && y < 19) {
                        this.blit(poseStack, s, l + 14 + 19 * r, 0, 204, 108, 19);
                        w = 16777088;
                    } else {
                        this.blit(poseStack, s, l + 14 + 19 * r, 0, 166, 108, 19);
                    }

                    this.blit(poseStack, s + 1, l + 15 + 19 * r, 16 * r, 223, 16, 16);
                    this.font.drawWordWrap(formattedText, t, l + 16 + 19 * r, v, w);
                    w = 8453920;
                }

                this.font.drawShadow(poseStack, string, (float) (t + 86 - this.font.width(string)), (float) (l + 16 + 19 * r + 7), w);
            }
        }

    }

    public void render(PoseStack poseStack, int i, int j, float f) {
        f = this.minecraft.getFrameTime();
        this.renderBackground(poseStack);
        super.render(poseStack, i, j, f);
        this.renderTooltip(poseStack, i, j);
        boolean bl = this.minecraft.player.getAbilities().instabuild;
        int k = ((CurseMenu) this.menu).getGoldCount();

        for (int l = 0; l < 3; ++l) {
            int m = ((CurseMenu) this.menu).costs[l];
            Enchantment enchantment = Enchantment.byId(((CurseMenu) this.menu).enchantClue[l]);
            int n = ((CurseMenu) this.menu).levelClue[l];
            int o = l + 1;
            if (this.isHovering(60, 14 + 19 * l, 108, 17, (double) i, (double) j) && m > 0 && n >= 0 && enchantment != null) {
                List<Component> list = Lists.newArrayList();
                list.add(Component.translatable("container.enchant.clue", new Object[]{enchantment.getFullname(n)}).withStyle(ChatFormatting.WHITE));
                if (!bl) {
                    list.add(CommonComponents.EMPTY);
                    if (this.minecraft.player.experienceLevel < m) {
                        list.add(Component.translatable("container.enchant.level.requirement", new Object[]{((CurseMenu) this.menu).costs[l]}).withStyle(ChatFormatting.RED));
                    } else {
                        MutableComponent mutableComponent;
                        if (o == 1) {
                            mutableComponent = Component.translatable("container.enchant.lapis.one");
                        } else {
                            mutableComponent = Component.translatable("container.enchant.lapis.many", new Object[]{o});
                        }

                        list.add(mutableComponent.withStyle(k >= o ? ChatFormatting.GRAY : ChatFormatting.RED));
                        MutableComponent mutableComponent2;
                        if (o == 1) {
                            mutableComponent2 = Component.translatable("container.enchant.level.one");
                        } else {
                            mutableComponent2 = Component.translatable("container.enchant.level.many", new Object[]{o});
                        }

                        list.add(mutableComponent2.withStyle(ChatFormatting.GRAY));
                    }
                }

                this.renderComponentTooltip(poseStack, list, i, j);
                break;
            }
        }

    }

    public void tickBook() {
        ItemStack itemStack = ((CurseMenu) this.menu).getSlot(0).getItem();
        if (!ItemStack.matches(itemStack, this.last)) {
            this.last = itemStack;

            do {
                this.flipT += (float) (this.random.nextInt(4) - this.random.nextInt(4));
            } while (this.flip <= this.flipT + 1.0F && this.flip >= this.flipT - 1.0F);
        }

        ++this.time;
        this.oFlip = this.flip;
        this.oOpen = this.open;
        boolean bl = false;

        for (int i = 0; i < 3; ++i) {
            if (((CurseMenu) this.menu).costs[i] != 0) {
                bl = true;
            }
        }

        if (bl) {
            this.open += 0.2F;
        } else {
            this.open -= 0.2F;
        }

        this.open = Mth.clamp(this.open, 0.0F, 1.0F);
        float f = (this.flipT - this.flip) * 0.4F;
        float g = 0.2F;
        f = Mth.clamp(f, -0.2F, 0.2F);
        this.flipA += (f - this.flipA) * 0.9F;
        this.flip += this.flipA;
    }
}
