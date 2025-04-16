package id.putra.prompt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jline.console.ArgDesc;
import org.jline.console.CmdDesc;
import org.jline.reader.LineReader;
import org.jline.utils.AttributedString;
import org.jline.widget.TailTipWidgets;
import org.jline.widget.TailTipWidgets.TipType;

public class JsonPrompt {
    private static Map<String, CmdDesc> tailTips = new HashMap<>();
    private static Map<String, List<AttributedString>> widgetOpts = new HashMap<>();

    private JsonPrompt() {

    }

    public static void init(LineReader reader) {
        List<AttributedString> mainDesc = Arrays.asList(
                new AttributedString("jsx -O [other_function]"));
        widgetOpts.put("-O -s",
                Arrays.asList(new AttributedString("Extract JSON based json string format must be escaped")));

        tailTips.put("jsx", new CmdDesc(mainDesc, ArgDesc.doArgNames(Arrays.asList("")), widgetOpts));

        // Create tailtip widgets that uses description window size 5 and
        // does not display suggestions after the cursor
        TailTipWidgets tailtipWidgets = new TailTipWidgets(reader, tailTips, 5, TipType.COMPLETER);
        // Enable autosuggestions
        tailtipWidgets.enable();
    }
}
