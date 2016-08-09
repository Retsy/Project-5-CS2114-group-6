/**
 * 
 */
package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Kieran
 * @version 8/9/2016
 *
 */
public class SongReader 
{
	SongList songList;
	Scanner scanner;

	public SongReader(File file)
	{
		try 
		{
			scanner = new Scanner(new File("MusicSurveyDataSumII.csv"));
		} 
		catch (FileNotFoundException e) 
		{
			// Scanner throws FileNotFoundEXception if file is not there
			e.printStackTrace();
		}
		songList = readSongs(scanner);
	}
	
	
	/**
	 * reads the given csv file 
	 * and adds the songs with the correct
	 * parameters into a songlist
	 * @param scan the scanner that is reading the csv file
	 * @return the Songlist of songs
	 */
	public SongList readSongs(Scanner scan)
	{
		songList = new SongList();
		scan.nextLine();
		while (scan.hasNextLine())
		{
			String[] str = scan.nextLine().split(",");
			Song song = new Song(str[0], str[1], str[2], str[3]);
			songList.add(song);
		}
		
		return songList;
	}
	
	
	/**
	 * returns the list of songs
	 * @return the list of songs returned
	 */
	public SongList getList()
	{
		return songList;
	}
	
}
