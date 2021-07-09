package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

//Use this token to access the HTTP API:
//        1864070760:AAFNX3__qltf2FJDT4f6vgVHjKoRsgcjOP4
// chat  id 1243175393

//Done! Congratulations on your new bot. You will find it at t.me/notify_11HW_bot. You can now add a description, about section and profile picture for your bot, see /help for a list of commands. By the way, when you've finished creating your cool bot, ping our Bot Support if you want a better username for it. Just make sure the bot is fully operational before you do this.
//
//        Use this token to access the HTTP API:
//        1864070760:AAFNX3__qltf2FJDT4f6vgVHjKoRsgcjOP4
//        Keep your token secure and store it safely, it can be used by anyone to control your bot.
//
//        For a description of the Bot API, see this page: https://core.telegram.org/bots/api

@Tag("fakeTag")
public class EmptyTestsDisabled {

    @Test
    @Disabled("Причина 1 откл теста")
    void justTest09(){
        assertTrue(false);
    }

    @Test
    @Disabled("Cause 2 откл теста")
    void justTest10(){
        assertTrue(true);
    }

    @Test
    @Disabled("Причина #003 откл теста")
    void justTest11(){
        assertTrue(false);
    }

    @Test
    @Disabled("Caus4 #04 откл теста")
    void justTest12(){
        assertTrue(true);
    }

}
