package Lab04.AimsProject.src.hust.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{

    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    
    //getter methor
    public String getArtist(){
        return artist;
    }
    //constructor
    public CompactDisc(String title){
        super(title);
    }
    public CompactDisc (String title,String category,String artist,float cost){
        super(title,category,null,cost);
        this.artist = artist;
    }

    // thêm track
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track: " + track.getTitle() + " has been added to CD: " + this.getTitle());
        } else {
            System.out.println("Track already exists in CD.");
        }
    }
    // remove track
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track: " +track.getTitle() + " has been removed from CD: " + this.getTitle());
        } else {
            System.out.println("Track does not exist in CD.");
        }
    }
    // Play method
    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public String toString() {
        return this.getId() + " - CD: " + this.getTitle() +
                " - Category: " + this.getCategory() +
                " - Artist" + this.getArtist() +
                " - Length: " + this.getLength() + " seconds" + 
                " - Cost: " + this.getCost() + "$";
    }
    
}