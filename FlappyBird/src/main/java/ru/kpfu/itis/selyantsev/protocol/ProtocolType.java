package ru.kpfu.itis.selyantsev.protocol;

public enum ProtocolType {
    START(""),
    STOP(""),
    ROOM(""),
    FLY("");    
    private final String title;
    ProtocolType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
