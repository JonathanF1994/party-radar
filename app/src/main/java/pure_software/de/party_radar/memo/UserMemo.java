package pure_software.de.party_radar.memo;

/**
 * Created by jfuchs on 15.07.2016.
 */
public class UserMemo {

    private int age;
    private int app_registered;
    private int fb_registered;
    private String name;
    private int id;
    private int points;
    private String prename;
    private String userName;

    public UserMemo(int age, int app_registered, int fb_registered, String name, int id, int points, String prename, String userName) {
        this.age = age;
        this.app_registered = app_registered;
        this.fb_registered = fb_registered;
        this.id = id;
        this.name = name;
        this.points = points;
        this.prename = prename;
        this.userName = userName;
    }
    public UserMemo(int age, String name,String prename, String userName) {
        this.age = age;
        this.app_registered = app_registered;
        this.fb_registered = fb_registered;
        this.id = id;
        this.name = name;
        this.points = points;
        this.prename = prename;
        this.userName = userName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getApp_registered() {
        return app_registered;
    }

    public void setApp_registered(int app_registered) {
        this.app_registered = app_registered;
    }

    public int getFb_registered() {
        return fb_registered;
    }

    public void setFb_registered(int fb_registered) {
        this.fb_registered = fb_registered;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
