package com.vishnu.paint.markers;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;

public class LogoView extends ImageView {
    public LogoView(Context context) {
        this(context, null);
    }

    public LogoView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LogoView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected boolean fitSystemWindows(Rect insets) {
        DecorTracker.get().setInsets(insets);
        return true;
    }
}
