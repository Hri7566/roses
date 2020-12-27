package info.hri7566.roses;

import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

	public String MODID = "roses";

	@Override
	public void onInitialize() {
		BlocksInit.registerBlocks(this.MODID);
		System.out.println("test");
	}
}
