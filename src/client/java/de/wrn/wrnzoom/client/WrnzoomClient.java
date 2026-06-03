package de.wrn.wrnzoom.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;

public class WrnzoomClient implements ClientModInitializer {

    private static KeyMapping zoomKey;
    private static final float ZOOM_FOV = 30.0F;
    private static float oldFov = -1;

    @Override
    public void onInitializeClient() {

        zoomKey = KeyMappingHelper.registerKeyMapping(
                new KeyMapping(
                        "ZOOM",
                        GLFW.GLFW_KEY_C,
                        KeyMapping.Category.MISC
                )
        );

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            Minecraft mc = Minecraft.getInstance();

            if (zoomKey.isDown()) {

                if (oldFov == -1) {
                    oldFov = mc.options.fov().get().floatValue();
                }

                mc.options.fov().set((int) ZOOM_FOV);

            } else {

                if (oldFov != -1) {
                    mc.options.fov().set((int) oldFov);
                    oldFov = -1;
                }
            }
        });
    }
}