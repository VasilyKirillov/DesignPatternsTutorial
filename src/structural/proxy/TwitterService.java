package structural.proxy;

public interface TwitterService {

    String getTimeline(String screeName);

    void postToTime(String screenName, String message);
}
