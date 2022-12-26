package me.maximde.testplugin

import org.bukkit.plugin.java.JavaPlugin


class TestPlugin extends JavaPlugin {

  override def onEnable(): Unit = {
    System.out.print("Enabled scala test plugin")
    getServer.getPluginManager.registerEvents(new Events, this)
  }

}
