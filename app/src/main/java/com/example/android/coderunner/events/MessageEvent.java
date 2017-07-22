package com.example.android.coderunner.events;

/** * Created by Paulo Vila Nova on 2017-07-22.
 */

public class MessageEvent {


    public MessageEvent(String message) {
        this.message = message;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
