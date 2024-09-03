package winlyps.disableJumping

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.util.Vector

class JumpListener : Listener {

    @EventHandler
    fun onPlayerMove(event: PlayerMoveEvent) {
        // Safely handle nullable locations
        val from = event.from ?: return
        val to = event.to ?: return

        // Check if the player is jumping by comparing the y-coordinates
        if (from.y < to.y && to.y - from.y > 0.4) {
            // Prevent the jump by setting the player's velocity to zero on the y-axis
            event.player.velocity = Vector(event.player.velocity.x, 0.0, event.player.velocity.z)
        }
    }
}