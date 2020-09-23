import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.*;
import java.util.*;
import java.io.FileWriter; 
import java.io.File;
import java.io.IOException; 
class Scrapper{
public static void main(final String[] args) {
	final Scanner scan=new Scanner(System.in);  
	System.out.println("Please enter the url to be crawled");
	String url= scan.nextLine();
	final String head=url;
	final File file=new File("D:\\Java\\assign3\\op.csv");
	final File file1=new File("D:\\Java\\assign3\\achor.csv");
	FileWriter fw=null;
	FileWriter fw2=null;
	final StringBuilder sb = new StringBuilder();
	sb.append("Tag");
	sb.append(",");
	sb.append("content");
	sb.append("\n");
	final StringBuilder anchor=new StringBuilder();
	anchor.append("Link Text");
	anchor.append(",");
	anchor.append("Link Url");
	anchor.append("\n");
	Queue<String> queue = new LinkedList<>();
	queue.add(url);
	int depth=4;
	int count=1;
	while (queue.size()>0 && depth>0){
		int s=queue.size();
		while (s>0){
		url=queue.poll();
	  try{
		  sb.append(count+":"+url+"\n");
		  count+=1;
		  anchor.append(url+"\n");
	  final Document document = Jsoup.connect(url).get();
	  final Elements paragraphs = document.getElementsByTag("p");
	  final Elements links=document.getElementsByTag("a");
	  final Elements headers=document.getElementsByTag("h3");
      for (final Element paragraph : paragraphs) {
		  if (paragraph.text().length()>0){
			sb.append("p");
			sb.append(",");
			sb.append(paragraph.text());
			sb.append("\n");
		  }
	  }
		for (final Element header:headers){
		sb.append("h3");
		sb.append(",");
		sb.append(header.text());
		sb.append("\n");
		}
	for (final Element link:links){
		anchor.append(link.text());
		anchor.append(",");
		anchor.append(link.attr("abs:href"));
		if (link.attr("abs:href").contains(head)){
			queue.add(link.attr("abs:href"));
		}
		anchor.append("\n");
	}
	sb.append("\n");
	anchor.append("\n");
}
catch(final Exception e){
	System.out.println(e);
}
s--;
		}
		depth--;
}
try{
	fw=new FileWriter(file);
	fw2= new FileWriter(file1);
}
catch(final IOException e){
	new RuntimeException("Error message", e).printStackTrace();
}
try{
	fw.write(sb.toString());
	fw2.write(anchor.toString());
	fw.close();
	fw2.close();
}
catch(IOException e)
{
	System.out.println(e);
}
		
	  }
	}