package com.jagrosh.jmusicbot.commands.dj;

import com.jagrosh.jmusicbot.Bot;
import com.jagrosh.jmusicbot.commands.DJCommand;
import com.jagrosh.jdautilities.command.CommandEvent;
import com.jagrosh.jmusicbot.commands.dj.ForceskipCmd;

public class PlayskipCmd extends PlaynextCmd {

    private ForceskipCmd skip;
    public PlayskipCmd(Bot bot)
    {
        super(bot);
        this.name = "playskip";
        this.help = "adds a song next in the queue and then skips to it";
        this.aliases = bot.getConfig().getAliases(this.name);
        this.beListening = true;
        this.bePlaying = true;
        this.skip = new ForceskipCmd(bot);
    }

    @Override
    public void doCommand(CommandEvent event)
    {
        super.doCommand(event);
        skip.doCommand(event);
    }
}
