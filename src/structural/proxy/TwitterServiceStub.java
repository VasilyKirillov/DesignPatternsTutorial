
package structural.proxy;


public class TwitterServiceStub implements TwitterService{

    @Override
    public String getTimeline(String screeName) {
        return "Timeline";
    }

    @Override
    public void postToTime(String screenName, String message) {
    }
    
}
