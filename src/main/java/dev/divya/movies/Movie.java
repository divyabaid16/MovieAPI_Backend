package dev.divya.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor // Constructor that takes all these private field as arguments
@NoArgsConstructor // Takes no parameters whatsoever
public class Movie {
    @Id
    private ObjectId id;
    
    private String imdbId;
    
    private String title;
    
    private String releaseDate;
    
    private String trailerLink;
    
    private String poster;
    
    private List<String> genres;

    private List<String> backdrops;

    @DocumentReference // Only store ids of the review and the reviews will be in separate collection (manual relationship)
    private List<Review> reviewIds;
}
