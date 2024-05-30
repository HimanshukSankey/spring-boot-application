package com.movie.management.system.entities;



import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;


@Document(collection = "movies")
public class Admin {
    
    @Id
    private String id;
    private String Movie_Name;
    private String Movie_Description;
    private String Movie_Director;
    
    //Getters and Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMovie_Name() {
		return Movie_Name;
	}
	public void setMovie_Name(String Movie_Name) {
		this.Movie_Name = Movie_Name;
	}
	public String getMovie_Description() {
		return Movie_Description;
	}
	public void setMovie_Description(String Movie_Description) {
		this.Movie_Description = Movie_Description;
	}
	public String getMovie_Director() {
		return Movie_Director;
	}
	public void setMovie_Director(String Movie_Director) {
		this.Movie_Director = Movie_Director;
	}
	public Admin(String id, String Movie_Name, String Movie_Description, String Movie_Director) {
		super();
		this.id = id;
		this.Movie_Name = Movie_Name;
		this.Movie_Description = Movie_Description;
		this.Movie_Director = Movie_Director;
	}
	public Admin() {
		super();
	}
	@Override
	public String toString() {
		return "Movies [id=" + id + ", Movie_Name=" + Movie_Name + ", Movie_Description=" + Movie_Description + ", Movie_Director=" + Movie_Director
				+ "]";
	}
    
}

