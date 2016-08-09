/**
 * 
 */
package prj5;

/**
 * The song object that holds all the likes,
 * heards, and percentages of each song 
 * based on the hobby selected
 * 
 * @author Kieran Cronin (croninkm)
 * @version 8/5/2016
 *
 */
public class Song 
{

	private String artistName;
    private String songTitle;
    private String genre;
    private String date;
    /**
     * A songs hobby array [x][y]
     * where x is 2, 1 for liked, 1 for heard.
     * where y is 4, 1 for each possible hobby
     */
    int[][] hobbyArray;
    /**
     * A songs total hobby array [x][y]
     * where x is 2, 1 for the total amount of likes,
     * and 1 for the total amount of heards.
     * where y is 4, 1 for each possible hobby again
     */
    int[][] hobbyTotalArray;
    

    /**
     * Creates a new song with the given parameters
     * @param artist The songs artist
     * @param title The songs title
     * @param type The songs genre
     * @param year The songs release year
     */
    public Song( String title, String artist, String year, String genre) 
    {
        artistName = artist;
        songTitle = title;
        this.genre = genre;
        date = year;

        hobbyArray = new int[2][4];
        hobbyTotalArray = new int[2][4];
        
    }

    /**
     * Returns the name or the artist for the song.
     * @return The artists name
     */
    public String name() 
    {
        return artistName;
    }

    /**
     * Returns the songs title.
     * @return The songs title
     */
    public String title() 
    {
        return songTitle;
    }

    /**
     * Returns the songs genre.
     * @return The songs genre
     */
    public String genre() 
    {
        return genre;
    }

    /**
     * Returns the songs release date
     * @return The songs release date
     */
    public String date() 
    {
        return date;
    }

    /**
     * Returns the amount of likes a song retrieved
     * @param hobby The input hobby
     * @return The amount of likes
     */
    public int getLikes(String hobby) 
    {
        switch (hobby) 
        {
            case "read":
                hobby = "Read";           
                return hobbyArray[1][0];

            case "art":
                hobby = "Art";
                return hobbyArray[1][1];

            case "sports":
                hobby = "Sports";
                return hobbyArray[1][2];

            case "music":
                return hobbyArray[1][3];

            default:
                throw new IllegalArgumentException();
        }
    }
    
    
    /**
     * Returns the amount of heards that
     * the song retrieved in the survey
     * @param hobby The input hobby
     * @return The amount of heards
     */
    public int getHeard(String hobby) 
    {
        switch (hobby) 
        {
            case "read":
                return hobbyArray[0][0];

            case "art":
                return hobbyArray[0][1];

            case "sports":
                return hobbyArray[0][2];

            case "music":
                return hobbyArray[0][3];
            default:
                throw new IllegalArgumentException();
        }
    }

    

    

    /**
     * Returns the percentage of likes
     * @param hobby The input hobby
     * @return The likes percentage
     */
    public int getLikedPercent(String hobby) 
    {
        switch (hobby) 
        {
            case "read":
                if (hobbyTotalArray[1][0] == 0) 
                {
                    return 0;
                }
                return (100 * hobbyArray[1][0]) / hobbyTotalArray[1][0];

            case "art":
                if (hobbyTotalArray[1][1] == 0) 
                {
                    return 0;
                }
                return (100 * hobbyArray[1][1]) / hobbyTotalArray[1][1];

            case "sports":
                if (hobbyTotalArray[1][2] == 0) 
                {
                    return 0;
                }
                return (100 * hobbyArray[1][2]) / hobbyTotalArray[1][2];

            case "music":
                if (hobbyTotalArray[1][3] == 0) 
                {
                    return 0;
                }
                return (100 * hobbyArray[1][3]) / hobbyTotalArray[1][3];

            default:
                throw new IllegalArgumentException();
        }
    }
    
    /**
     * Returns the percentage of heards
     * @param hobby The input hobby
     * @return The heard percentage
     */
    public int getHeardPercent(String hobby) 
    {
        switch (hobby) 
        {
            case "read":
                if (hobbyTotalArray[0][0] == 0) 
                {
                    return 0;
                }
                return (100 * hobbyArray[0][0]) / hobbyTotalArray[0][0];

            case "art":
                if (hobbyTotalArray[0][1] == 0) 
                {
                    return 0;
                }
                return (100 * hobbyArray[0][1]) / hobbyTotalArray[0][1];

            case "sports":
                if (hobbyTotalArray[0][2] == 0) 
                {
                    return 0;
                }
                return (100 * hobbyArray[0][2]) / hobbyTotalArray[0][2];

            case "music":
                if (hobbyTotalArray[0][3] == 0) 
                {
                    return 0;
                }
                return (100 * hobbyArray[0][3]) / hobbyTotalArray[0][3];

            default:
                throw new IllegalArgumentException();
        }
    }
}