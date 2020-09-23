import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.*;
import java.util.*;
import java.io.FileWriter; 
import java.io.File;
import java.io.IOException; 
import java.io.FileOutputStream;
class formats{
public static void main(String[] args) {
  final  HashMap<String, Integer> visited = new HashMap<String, Integer>();
  final HashMap<String, Integer> included = new HashMap<String, Integer>();
    Scanner scan=new Scanner(System.in);  
    System.out.println("Please enter the url to be crawled");
    String url = scan.nextLine();
    if (!(url.contains("https://") || url.contains("http://"))){
      url="https://"+url;
    }
    String head=url;
    final File file1=new File("D:\\Java\\assign3c\\urls.csv");
    FileWriter fw=null;
    final StringBuilder sb=new StringBuilder();
    sb.append("Downloadable links \n");
    Queue<String> queue = new LinkedList<>();
    queue.add(url);
    int depth=3;
    while (queue.size()>0 && depth>0){
      int s=queue.size();
      while (s>0){
        url=queue.poll();
    try{
        Document document = Jsoup.connect(url).get();
        final Elements links=document.getElementsByTag("a");
                for (Element link:links){
          if (link.attr("abs:href").contains(head)){
            String addlink=link.attr("abs:href");
            if (!visited.containsKey(addlink))
            {
              visited.put(addlink, 1);
            queue.add(link.attr("abs:href"));
            }
          }
          try {                                 
            String savedFileName = link.attr("abs:href");
            System.out.println(savedFileName);
            if (savedFileName.endsWith(".pdf")||savedFileName.endsWith(".PDF")|| savedFileName.endsWith(".docs")||savedFileName.endsWith(".word")) 
            {
              if (!included.containsKey(savedFileName)){
                included.put(savedFileName, 1);
              sb.append(savedFileName);
              sb.append("\n");
              }
            }
        } catch (Exception e) {
          System.out.println(e);
        }
      }
    }
    catch(Exception e){
      System.out.println(e);
    }
    s--;
  }
  depth--;
    }
  try{
  fw=new FileWriter(file1);
  fw.append(sb.toString());
  fw.close();
  }
  catch(IOException e){
    System.out.println(e);
  }
}
}