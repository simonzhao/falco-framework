package com.matrix001.falcoframework.context;

public interface ConfigurableApplicationContext {
    void refresh();
    void close();
    void isActive();
}
