package love.chihuyu.commands

import dev.jorel.commandapi.CommandAPICommand
import dev.jorel.commandapi.arguments.TextArgument
import dev.jorel.commandapi.executors.PlayerCommandExecutor
import org.bukkit.entity.Player

fun renameItem(player: Player, name: String? = null){
    val item = player.inventory.itemInMainHand
    item.itemMeta?.setDisplayName(name)
    player.sendMessage("Renamed to $name.")
}

object CommandRenameItem{
    val main: CommandAPICommand = CommandAPICommand("renameitem")
        .withPermission("renameitem.renameitem")
        .withArguments(
            TextArgument("name")
        )
        .executesPlayer(
            PlayerCommandExecutor { sender, args ->
                val name = args[0] as String?
                renameItem(sender, name)
            }
        )
    val without_arguments: CommandAPICommand = CommandAPICommand("renameitem")
        .withPermission("renameitem.renameitem")
        .executesPlayer(
            PlayerCommandExecutor { sender, _ ->
                renameItem(sender)
            }
        )
}