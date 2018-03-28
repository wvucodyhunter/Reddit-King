import java.io.*;
public class RedditKing {
		String fileToAnalyze;
		
		RedditKing()
		{
			System.out.println("Default constructor");
			fileToAnalyze="";
			
		}
		boolean detectRussia(String linetoAnalyze)
		
		{
			String lineToAnalyzeLowerCase=linetoAnalyze.toLowerCase();
			System.out.println(lineToAnalyzeLowerCase);
			if (lineToAnalyzeLowerCase.contains("russia"))
			{
				
				System.out.println("Detected Russia!");
				return true;
			}
			else 
			{
				System.out.println("NO Russia!");
				return false;
			}
		}
		
		
		public int [] getNumCommentsReddit(String fileToRead)
		{
			int [] numCommentsArray=new int[6466];
			
			try
			{
				FileReader myFileReader=new FileReader(fileToRead);
				BufferedReader myBufferReader= new BufferedReader(myFileReader);
				String line=null;
				int postCounter=0;
				while ((line=myBufferReader.readLine())!=null)
				{
					System.out.println("Num Comments Post:"+line);
					int numCommentsPost=Integer.parseInt(line);
					
					numCommentsArray[postCounter]=numCommentsPost;
					postCounter+=1;
					
					
					
				}
				System.out.println("exited while:");
				return numCommentsArray;
				
				
			}
			catch (Exception ex)
			{
				System.out.println("I don't think I was able to find your file");
			}
			
			return numCommentsArray;
				
		}
		
		RedditPost [] getPostsReddit(String fileToRead)
		{
			RedditPost [] theDonaldPosts=new RedditPost[6466];
			
			try
			{
				FileReader myFileReader=new FileReader(fileToRead);
				BufferedReader myBufferReader= new BufferedReader(myFileReader);
				String line=null;
				int postCounter=0;
				while ((line=myBufferReader.readLine())!=null)
				{
					System.out.println(line);
					theDonaldPosts[postCounter]=new RedditPost(line);
					postCounter+=1;
					
					
					
				}
				System.out.println("exited while:");
				return theDonaldPosts;
				
				
			}
			catch (Exception ex)
			{
				System.out.println("I don't think I was able to find your file");
			}
			return theDonaldPosts;
				
		}
		void readRedditFileAndDetectRussia(String fileToRead)
		{
			System.out.println("ready to read:"+fileToRead);
			try
			{
				FileReader myFileReader=new FileReader(fileToRead);
				BufferedReader myBufferReader= new BufferedReader(myFileReader);
				String line=null;
				while ((line=myBufferReader.readLine())!=null)
				{
					if (detectRussia(line)==true)
						
						System.out.println("line:"+line);
				}
				System.out.println("exited while:");
				
				
				/*String line=null;
				line=myBufferReader.readLine();
				
				System.out.println("First line:"+line);
				
				line=myBufferReader.readLine();
				System.out.println("2nd line:"+line);
				
				line=myBufferReader.readLine();
				System.out.println("3rd line:"+line);
				
				line=myBufferReader.readLine();
				System.out.println("4th line:"+line);
				
				line=myBufferReader.readLine();
				System.out.println("5th line:"+line);
				*/
				
				
				
			}
			catch (Exception ex)
			{
				System.out.println("I don't think I was able to find your file");
			}
		}
		
		

	}
