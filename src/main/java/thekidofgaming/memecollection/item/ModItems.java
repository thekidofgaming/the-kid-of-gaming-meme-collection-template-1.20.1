package thekidofgaming.memecollection.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import thekidofgaming.memecollection.TheKidOfGamingMemeCollection;

public class ModItems {
    public static final Item CRESCENT_ROSE_SCYTHE_FORM = registerItem("crescent_rose_scythe_form", new SwordItem(ModToolMaterial.Crescent, 5, 3f, new FabricItemSettings()));
    public static final Item CRESCENT_ROSE_GUN_FORM = registerItem("crescent_rose_gun_form", new BowItem(new FabricItemSettings().maxDamage(3)));
    public static final Item Magazine = registerItem("Magazine", new ArrowItem(new FabricItemSettings()));

    private static void addItemsToWeaponItemGroup(FabricItemGroupEntries entries) {
        entries.add(CRESCENT_ROSE_SCYTHE_FORM);
        entries.add(CRESCENT_ROSE_GUN_FORM);
        entries.add(Magazine);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheKidOfGamingMemeCollection.MOD_ID, name), item);
    }

    public static void registerModItems() {

        TheKidOfGamingMemeCollection.LOGGER.info("Registering Mod Items for " + TheKidOfGamingMemeCollection.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToWeaponItemGroup);
    }
}
