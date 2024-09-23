package thekidofgaming.memecollection.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import thekidofgaming.memecollection.entity.custom.Bullet;

public class Magazine extends Item {
    public Magazine(Settings settings) {
        super(settings);
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        Bullet bullet = new Bullet(world, shooter);
        return bullet;
    }
}
