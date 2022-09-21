package love.chihuyu

import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class PluginTemplate : JavaPlugin(), Listener {

    companion object {
        lateinit var plugin: JavaPlugin
    }

    init {
        plugin = this
    }

    override fun onEnable() {
        server.pluginManager.registerEvents(this, this)
    }
}