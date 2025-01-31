package club.someoneice.vine.init;

import club.someoneice.vine.common.Goblet;
import club.someoneice.vine.common.barrel.BrewingBarrel;
import club.someoneice.vine.common.boilers.DistillationBoiler;
import club.someoneice.vine.common.cocktail.Cocktail;
import club.someoneice.vine.common.shaker.Shaker;
import club.someoneice.vine.core.TskimiSeiranVine;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TskimiSeiranVine.MODID);

    public static final RegistryObject<Block> BrewingBarrelBlock = BLOCKS.register("brewing_barrel", BrewingBarrel::new);
    public static final RegistryObject<Block> DistillationBoilerBlock = BLOCKS.register("distillation_boiler", DistillationBoiler::new);
    public static final RegistryObject<Block> ShakerBlock = BLOCKS.register("shaker", Shaker::new);
    public static final RegistryObject<Block> GobletBlock = BLOCKS.register("goblet", Goblet::new);
    public static final RegistryObject<Block> NoneCocktail = BLOCKS.register("none_cocktail", () -> new Cocktail.CocktailBlock(7));

}
