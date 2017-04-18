/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Harude
 */
public class Video extends Media {
    private String path;
    private String caption;
    private int like;
    private String comment;
    private String loc;

    public Video(String path) {
        this.path = path;
    }

    public Video(String path, String caption) {
        this.path = path;
        this.caption = caption;
    }

    public Video(String path, String caption, String loc) {
        this.path = path;
        this.caption = caption;
        this.loc = loc;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public void setPath(String path) {
        this.path = path;
    }
    
    
}
