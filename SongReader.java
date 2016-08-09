/**
 * 
 */
package prj5;

import java.io.File;
import java.util.Scanner;

/**
 * @author Kieran
 *
 */
public class SongReader 
{
	SongList songList;
	Scanner scanner;

	public SongReader(File file)
	{
		
	}
	
	
	private SongList readSongs(File file)
	{
		songList = new SongList();
		scanner.nextLine();
		while (scanner.hasNextLine())
		{
			String[] str = scanner.nextLine().split(", ");
			Song song = new Song(str[0], str[1], str[2], str[3]);
			songList.add(song);
		}
		
		return songList;
	}
	
}
