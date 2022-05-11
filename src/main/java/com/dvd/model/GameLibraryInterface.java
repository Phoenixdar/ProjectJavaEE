
package com.dvd.model;

import java.util.List;

public interface GameLibraryInterface {
    List getDVDCollection();
    GameItem addDVD(String title, String year, String genre,String semi_genre,String rating,String recense,String image);
    List getGenres();
    void addGenre(String new_genre);
}


