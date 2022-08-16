/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.sql.Date;

/**
 *
 * @author MarcoMan
 * Channel: https://www.youtube.com/channel/UCPgcmw0LXToDn49akUEJBkQ
 * Please support our channel (SUBSCRIBE --> TURN ON NOTIFICATION --> HIT THE LIKE BUTTON)
 */
public class saveBook {
    
    private final String title;
    private final String author;
    private final String genre;
    private final Date date;
    private final String image;
    
    public saveBook(String title, String author, String genre, String image, Date date){
        
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.date = date;
        this.image = image;
        
    }
    
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }
    public Date getDate(){
        return date;
    }
    public String getImage(){
        return image;
    }
    
}
