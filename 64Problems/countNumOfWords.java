//Write a program to count the number of characters, words and sentences present in a paragraph. 

class countNumOfWords
{

	public static int countWords(String str)
	{
		int count = 0; 
		boolean wordEnd = false; 
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				count++;
			}
		}
		return count;
	
	}
	
	public static int countSentences(String str)
	{
		int count = 0; 
		boolean senEnd = false; 
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == '.')
			{
				count++;
			}
		}
		return count;
	
	}
	
	public static void main(String[] args)
	{
		String str = "What is a paragraph? Paragraphs are the building blocks of papers. Many students define paragraphs in terms of length: a  paragraph is a group of at least five sentences, a paragraph is half a page long, etc. In reality, though, the unity and coherence of ideas among sentences is  what constitutes a paragraph.";
		
		System.out.println("Number of Characters: " + str.length());
		System.out.println("Number of Words: " + countWords(str));
		System.out.println("Number of Sentences: " + countSentences(str));
	}
}        
