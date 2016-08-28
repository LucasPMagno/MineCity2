package br.com.gamemods.minecity.forge.base.core.transformer.forge.block;

import br.com.gamemods.minecity.forge.base.core.transformer.InsertInterfaceTransformer;

public class IBlockStateTransformer extends InsertInterfaceTransformer
{
    public IBlockStateTransformer()
    {
        super("net.minecraft.block.state.IBlockState", "br.com.gamemods.minecity.forge.base.accessors.block.IState");
    }

    public IBlockStateTransformer(String interfaceClass)
    {
        super("net.minecraft.block.state.IBlockState", interfaceClass);
    }
}