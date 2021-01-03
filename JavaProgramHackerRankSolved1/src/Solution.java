import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Song song[] =new Song[5];
		for(int i=0;i<song.length;i++)
		{
			int songId=sc.nextInt();
			sc.nextLine();
			String title=sc.nextLine();
			
			String artist=sc.nextLine();
			int rating=sc.nextInt();
			
			song[i]=new Song(songId, title, artist, rating);
		}
		sc.nextLine();
		String artist1=sc.nextLine();
		
		String artist2=sc.nextLine();
		
		int avg=findAvgRatingForArtist(song, artist1);
		if(avg==0) 
		{
			System.out.println(avg);
		}
		else 
		{
			System.out.println("There are no songs with the given artist");
		}
		
		Song sg1[]=searchSongByArtist(artist2, song);
		
		for(Song sgk:sg1)
		{
			if(sgk==null)
			{
				System.out.println("There are no songs available for the given artist");
			}else {
				System.out.println(sgk.getSongId());
			}
		}
	
	}
	
	public static int findAvgRatingForArtist(Song[] song, String artist)
	  {
			int result =0;
			int total=0;
			int count=0;
			for(Song sg:song)
			{
				if(sg.getArtist().equalsIgnoreCase(artist))
				{
					total=total+ sg.getRating();
					count++;
				}
				if(count>0)
				{
					result=total/count;
				}
			}
			return result;
	  }

	public static Song[] searchSongByArtist(String artist, Song[] song)
	  {
		 {
			   //method logic
			   int value = 0;
			   for(int i=0;i<song.length;i++){
			       if(artist.equalsIgnoreCase(song[i].getArtist()))
			        value++;
			   }
			   if(value == 0)
			    return null;
			   Song[] s = new Song[value];
			   value = 0;
			   for(int i=0;i<song.length;i++){
			       if(artist.equalsIgnoreCase(song[i].getArtist())){
			           s[value++] = song[i];
			       }
			   }
			   for(int i=0;i<s.length;i++){
			       for(int j=i+1;j<s.length;j++){
			           if(s[i].getSongId()<=s[j].getSongId()){
			               Song temp = s[i];
			               s[i] = s[j];
			               s[j] = temp;
			           }
			       }
			   }
			   return s;
			  }
			
	  }
	}

