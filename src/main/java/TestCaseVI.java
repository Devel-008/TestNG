import org.testng.annotations.Test;

//grouping test!!
public class TestCaseVI {
    @Test(groups = {"track"})
    void play()
    {
        System.out.println("Play the track or video. ");
    }
    @Test(groups = {"video"})
    void pause()
    {
        System.out.println("Pause the track or video.  ");
    }
    @Test(groups = {"track","video"})
    void resume()
    {
        System.out.println("Resume the track or video.");
    }
    @Test(groups = {"video"})
    void fastForward()
    {
        System.out.println("FastForward the track or video.");
    }
    @Test(groups = {"video","track"})
    void slowMotion()
    {
        System.out.println("Slowed the track or video.");
    }
    @Test(groups = {"video"})
    void Skip()
    {
        System.out.println("Skip the track or video.");
    }
    @Test(groups = {"image"})
    void SlideShow()
    {
        System.out.println("Slideshow of image!!.");
    }
}
