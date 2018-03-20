package views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import java.io.File;

/**
 * Created by Team SDC on 20/03/18.
 */
public class FontTextView extends TextView {

    public FontTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        parseAttributes(context, attrs);
    }

    public FontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        parseAttributes(context, attrs);
    }

    public FontTextView(Context context) {
        super(context);
    }

    private void parseAttributes(Context context, AttributeSet attrs) {
        setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts" + File.separator + "Roboto-Light.ttf"));
    }
}
