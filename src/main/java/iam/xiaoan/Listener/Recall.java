package iam.xiaoan.Listener;

import iam.xiaoan.AntiReCall;
import net.mamoe.mirai.Bot;
import net.mamoe.mirai.contact.Group;
import net.mamoe.mirai.event.GlobalEventChannel;
import net.mamoe.mirai.event.Listener;
import net.mamoe.mirai.event.events.MessageRecallEvent;
import net.mamoe.mirai.message.data.At;
import net.mamoe.mirai.message.data.MessageChain;
import net.mamoe.mirai.message.data.MessageUtils;
import net.mamoe.mirai.message.data.PlainText;

import javax.swing.*;

public class Recall {
    public static void lRecall() {
            GlobalEventChannel.INSTANCE.subscribeAlways(MessageRecallEvent.GroupRecall.class, messageRecallEvent -> {
            Group group = messageRecallEvent.getGroup();
            At at = new At(messageRecallEvent.getAuthorId());
            AntiReCall.getBot().getGroup(group.getId()).sendMessage(MessageUtils.newChain(at,new PlainText(" 哈哈！你撤回了一条消息，我看到了！")));


        });
    }
}
