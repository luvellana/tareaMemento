package observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CanalYT implements ICanalYT {
    private ArrayList<Subscriptor> subscriptors = new ArrayList<>();

    private List<Video> videos = new LinkedList<>();

    public List<Video> getVideos() {
        return videos;
    }

    public void newVideo(Video v) {
        videos.add(v);
        this.notifyObserver(v);
    }


    @Override
    public void attach(ISubscriptor observer) {
        this.subscriptors.add((Subscriptor) observer);
    }

    @Override
    public void deAttach(ISubscriptor observer) {
        this.subscriptors.remove(observer);
    }

    @Override
    public void notifyObserver(Video v) {

        for(Subscriptor s : subscriptors) {
            for ( String cat : s.getCategorias()){
                if(cat.equals("AnyCategory") || cat.equals(v.getCategoría())){
                    s.update("Nuevo video: " + v.getTitulo());

                }
            }
        }
    }
}
