package cworks.app.domain;

import java.util.List;

public interface App extends Identity {
    Unique getKey();
    String getUrl();
    String getName();
    List<Screen> getScreens();

}
