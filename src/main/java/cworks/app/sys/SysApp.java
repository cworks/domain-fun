package cworks.app.sys;

import cworks.app.domain.App;
import cworks.app.domain.Unique;
import cworks.app.domain.Screen;

import java.util.Collection;
import java.util.List;

public class SysApp extends SysObject implements App {


    @Override
    public Unique getKey() {
        return null;
    }

    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Object value() {
        return null;
    }

    @Override
    public Object value(int n) {
        return null;
    }

    @Override
    public Collection<Object> values() {
        return null;
    }

    @Override
    public List<Screen> getScreens() {
        return null;
    }

    @Override
    public Object getId() {
        return null;
    }
}
