package winlyps.disableJumping

import org.bukkit.plugin.java.JavaPlugin

class DisableJumping : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        getServer().pluginManager.registerEvents(JumpListener(), this)
        logger.info("DisableJumping plugin enabled.")
    }

    override fun onDisable() {
        logger.info("DisableJumping plugin disabled.")
    }
}