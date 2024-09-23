package thekidofgaming.memecollection.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import thekidofgaming.memecollection.TheKidOfGamingMemeCollection;

public class ModEntities {
    public static final EntityType<Bullet> Bullet = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TheKidOfGamingMemeCollection.MOD_ID, "bullet"),
            FabricEntityTypeBuilder.<Bullet>create(SpawnGroup.MISC, Bullet::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

}
