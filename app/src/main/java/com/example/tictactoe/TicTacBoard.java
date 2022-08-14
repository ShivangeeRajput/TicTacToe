package com.example.tictactoe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class TicTacBoard extends View {
    public TicTacBoard(Context context) {
        this(context, null);
    }

    public TicTacBoard(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TicTacBoard(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
