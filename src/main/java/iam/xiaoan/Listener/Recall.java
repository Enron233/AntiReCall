package iam.xiaoan.Listener;

import net.mamoe.mirai.event.EventHandler;
import net.mamoe.mirai.event.GlobalEventChannel;
import net.mamoe.mirai.event.events.GroupMessageEvent;
import net.mamoe.mirai.event.events.MessageRecallEvent;
import net.mamoe.mirai.message.data.*;


public class Recall {
    public static boolean onRecall;
    @EventHandler
    public static void lRecall() {
            GlobalEventChannel.INSTANCE.subscribeAlways(GroupMessageEvent.class, event1 -> {
                GlobalEventChannel.INSTANCE.subscribeAlways(MessageRecallEvent.GroupRecall.class, hd ->{
                    hd.getGroup().sendMessage(MessageUtils.newChain(new At(hd.getAuthorId()),new PlainText(" 哈哈哈，你撤回了一条消息？被我看到啦，是不是："), event1.getMessage()));
                });
            });
    }
}
