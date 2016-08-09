/**
 * 
 */
package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Reads the input File to gather the data for the songs
 * 
 * @author Kieran Cronin (croninkm)
 * @version 8/8/2016
 *
 */
public class InfoReader extends FileReader
{
	
	
	private int hobby = -1;
    private SongList linkedList;
    private Scanner scanner;

    public InfoReader(File file) throws FileNotFoundException 
	{
		super(file);
		
	}
    
    /**
     * Creates a new Reader
     * 
     * @param file the file with the survey answers
     * @param list the linked list of the songs
     *        that are already sorted
     * @throws FileNotFoundException 
     */
    public InfoReader(File file, SongList list) throws FileNotFoundException 
    {
    	super(file);
        linkedList = list;
        try 
        {
            scanner = new Scanner(file);
        }

        catch (Exception e) 
        {
            e.printStackTrace();
        }

    }

    /**
     * Updates each song's heard/liked count
     */
    public void sortData() 
    {

        scanner.nextLine();

        while (scanner.hasNextLine()) 
        {
            String[] str = scanner.nextLine().split(",");
            if (str.length > 2) 
            {
                setInts(str[4]);
                int index = 0;
                for (int i = 5; i < str.length
                        && index < linkedList.getList().size(); i++) 
                {
                    

                    if (hobby >= 0) 
                    {
                        if (str[i].equals("Yes")) 
                        {
                            linkedList.getList()
                                        .get(index).hobbyArray[0][hobby]++;
                        }
                        if (!str[i].equals("")) 
                        {
                            linkedList.getList()
                                        .get(index).hobbyTotArray[0][hobby]++;
                        }
                    }

                    i++;

                    
                    if (hobby >= 0 && str.length > i) 
                    {
                        if (str[i].equals("Yes")) 
                        {
                            linkedList.getList()
                                    .get(index).hobbyArray[1][hobby]++;
                        }
                        if (!str[i].equals("")) 
                        {
                            linkedList.getList()
                                    .get(index).hobbyTotArray[1][hobby]++;
                        }
                    }
                    index++;
                }

            }
        }
    }

    /**
     * Adjusts the current major/hobby/region
     * 
     * @param maj
     *            Major
     * @param reg
     *            Region
     * @param hob
     *            Hobby
     */
    private void setInts(String hobbyy) 
    {
        
        switch (hobbyy) 
        {
            case "reading":
                hobby = 0;
                break;
            case "art":
                hobby = 1;
                break;
            case "sports":
                hobby = 2;
                break;
            case "music":
                hobby = 3;
                break;
            default:
                hobby = -1;
                break;
        }
    }

}