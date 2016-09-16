package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jauyeung on 9/15/16.
 */
public class ImportantTweet extends Tweet{

    public ImportantTweet(String message){
        super(message);
    }

    @Override  // Doesn't do anything
    //// just means that you are intending to override it and that there should be an identical method in the parent class.
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
