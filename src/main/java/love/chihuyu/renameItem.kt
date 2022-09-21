package love.chihuyu

import love.chihuyu.commands.CommandRenameItem
import org.bukkit.plugin.java.JavaPlugin

class renameItem : JavaPlugin(){

    companion object {
        lateinit var plugin: JavaPlugin
    }

    init {
        plugin = this
    }

    override fun onEnable() {
        listOf(
            CommandRenameItem.main,
            CommandRenameItem.without_arguments
        )
            .forEach { it.register() }

    }
}