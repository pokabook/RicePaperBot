package bot.cmd.commands;

import bot.cmd.BotCommand;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.io.File;

public class ImageCommandSugee implements BotCommand {
    @Override
    public void onMessage(MessageReceivedEvent event) {
        MessageChannel channel = event.getChannel();
        long time = System.currentTimeMillis();
        channel.sendFile(new File("C:\\Users\\DSM2022\\Downloads\\130_20220327020403.png")).queue();
    }
}
