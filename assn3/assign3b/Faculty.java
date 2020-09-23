import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.*;
import java.util.*;
import java.io.FileWriter; 
import java.io.File;
import java.io.IOException; 
class Faculty{
  public static HashMap<String, Integer> visited = new HashMap<String, Integer>();
  public static void checker(FileWriter fw,Queue<String> queue,int depth,String header)
  {
    StringBuilder sb = new StringBuilder();
    while (queue.size()>0 & depth>0)
    {
      int s=queue.size();
      while(s>0){
      String url=(String) queue.poll();
    try{
      
      Document document = Jsoup.connect(url).get();
      Elements paragraphs = document.getElementsByTag("p");
      Elements links=document.getElementsByTag("a");

      String target="faculty";
      String temp,temp1;
      for(Element link:links){
        temp1=link.attr("abs:href");
        temp=temp1.toLowerCase();
        if (temp.contains(header) && (temp.contains(target)|| depth>=0)){
          if (!visited.containsKey(temp1)){
            System.out.println(temp1);
            queue.add(temp1);
          visited.put(temp1, 1);
          }
        }
      }
      //essentially search for every paragraphs where faculty is spoken of and add them to the excel sheet
      for (Element para:paragraphs){
        if (para.toString().contains(target)){
          sb.append(url+",");
          sb.append(para.text()+",");
          sb.append("\n");
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
  fw.write(sb.toString());
fw.close();
}
catch (Exception e){
  System.out.println(e);
}
}
  public static void main(String[] args) {	
    Scanner scan=new Scanner(System.in);  
    System.out.println("Please enter the url to be crawled");
    String url = scan.nextLine();
    if (!url.contains("https://")){
      url="https://"+url;
    }
    File file=new File("D:\\Java\\assign3b\\faculty.csv");
    FileWriter fw=null;
    try{
    fw=new FileWriter(file);
    Queue<String> queue = new LinkedList<>();
    queue.add(url);
    int depth=2;
    checker(fw,queue,depth,url);
    scan.close();
  }
	catch(IOException e){
		new RuntimeException("Error message", e).printStackTrace();
    }
}
}