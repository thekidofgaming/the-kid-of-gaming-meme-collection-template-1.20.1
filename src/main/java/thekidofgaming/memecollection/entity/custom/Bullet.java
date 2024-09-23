package thekidofgaming.memecollection.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;
import thekidofgaming.memecollection.entity.ModEntities;
import thekidofgaming.memecollection.item.ModItems;

public class Bullet extends ThrownItemEntity {
    public Bullet(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public Bullet(LivingEntity livingEntity, World world) {
        super(ModEntities.Bullet, livingEntity, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.Magazine;
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        this.discard();
        super.onBlockHit(blockHitResult);
    }
}
