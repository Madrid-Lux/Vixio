package me.iblitzkriegi.vixio.conditions;

import ch.njol.skript.lang.Condition;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.util.Kleenean;
import org.bukkit.event.Event;

/**
 * Created by Blitz on 10/16/2016.
 */
public class CondBeginsWith extends Condition {
    private Expression<String> string1;
    private Expression<String> string2;
    @Override
    public boolean check(Event e) {
        if(string1.getSingle(e).startsWith(string2.getSingle(e))) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(Event event, boolean b) {
        return getClass().getName();
    }

    @Override
    public boolean init(Expression<?>[] expr, int i, Kleenean kleenean, SkriptParser.ParseResult parseResult) {
        string1 = (Expression<String>) expr[1];
        string2 = (Expression<String>) expr[0];
        return true;
    }
}
