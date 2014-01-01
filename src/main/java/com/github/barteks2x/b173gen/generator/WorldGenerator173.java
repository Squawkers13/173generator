package com.github.barteks2x.b173gen.generator;

import java.util.Random;
import org.bukkit.World;

public interface WorldGenerator173 {

    public boolean generate(World world, Random rand, int x, int y, int z);

    public void scale(double d0, double d1, double d2);
}
