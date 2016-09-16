package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jauyeung on 9/15/16.
 */
public abstract class Tweet {
    private String message;
    private Date date;
    //public String s;
    //protected String p;
    //String nothing;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();

    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 240){
            //Do something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }
}
