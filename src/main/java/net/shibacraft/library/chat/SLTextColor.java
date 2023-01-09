package net.shibacraft.library.chat;

import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;

@UtilityClass
public class SLTextColor {

    public String color(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

}
