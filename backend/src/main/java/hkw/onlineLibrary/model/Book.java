package hkw.onlineLibrary.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;




@Entity
public class Book {
    @Id
    @Column(name = "ISBN")
    private String ISBN;

    @Column
    private String Name;

    @Column
    private String Author;

    @Column(name = "introduction")
private String introduction;

    public String getISBN(){
        return ISBN;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getAuthor(){
        return Author;
    }
    public void setAuthor(String Author){
        this.Author = Author;
    }

    public String getintroduction(){
        return introduction;
    }
    public void setintroduction(String introduction){
        this.introduction = introduction;
    }
}

