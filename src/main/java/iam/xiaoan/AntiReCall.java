package iam.xiaoan;

import iam.xiaoan.Listener.Recall;
import net.mamoe.mirai.Bot;
import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;

public final class AntiReCall extends JavaPlugin {
    public static final AntiReCall INSTANCE = new AntiReCall();

    private AntiReCall() {
        super(new JvmPluginDescriptionBuilder("iam.xiaoan.AntiReCall", "1.0-SNAPSHOT")
                .author("xiaoan")
                .build());
    }

    @Override
    public void onEnable() {
        Recall.lRecall();
        getLogger().info("Plugin loaded!");
        getLogger().info("Hello！我是小安！感谢你使用这款反撤回插件！");

    }
    public static Bot getBot() {
        Bot bot = Bot.getInstance(1049768206);
        return bot;
    }
}