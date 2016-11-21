package com.ray3k.skincomposerui;

import com.badlogic.gdx.math.Vector2;

public interface WindowWorker {
    public static enum WindowState {
        ICONIFIED, RESTORED, MAXIMIZED
    }
    public void minimize();
    public void maximize();
    public void restore();
    public void setPosition(int x, int y);
    public int getPositionX();
    public int getPositionY();
    public WindowState getWindowState();
}
