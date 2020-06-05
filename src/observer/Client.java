package observer;

import java.util.LinkedList;
import java.util.List;

public class Client {

    public static void main (String [] argsss){
        CanalYT VideosXD = new CanalYT();
        List<String> l1= new LinkedList<>();
        l1.add("AnyCategory");
        List<String> l2= new LinkedList<>();
        l2.add("comedia");

        Subscriptor s1 = new Subscriptor("pepeBellot", l1);
        Subscriptor s2 = new Subscriptor("ariG", l2);

        VideosXD.attach(s1);
        VideosXD.attach(s2);



            Video v1 = new Video("23", "Golpes graciosos", 15, "comedia");
            Video v2 = new Video("aqui", "nuevo juego", 50, "gameplay");
        VideosXD.newVideo(v1);
        VideosXD.newVideo(v2);

    }
}
