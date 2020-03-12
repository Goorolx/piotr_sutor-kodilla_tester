package com.kodilla.collections.adv.immutable.homework;

public final class Task {                   //jezeli dobrze rozumiem samo dopisanie w linii 3 final sprawia
                                            // że wszsytko co związane z tą klasą jest już final
    protected final String title;
    protected final String duration;

    public Task(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public final String getTitle() {
        return title;
    }
    public final String getDuration() {
        return duration;
    }
}
