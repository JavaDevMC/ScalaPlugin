package me.maximde.testplugin

import org.bukkit.Material
import org.bukkit.event.{EventHandler, Listener}
import org.bukkit.event.player.PlayerMoveEvent

class Events extends Listener {

  @EventHandler
  def onPlayerMove(event: PlayerMoveEvent): Unit = {
    val player = event.getPlayer
    player.getWorld.getBlockAt(player.getLocation).setType(Material.ICE)
  }

}

