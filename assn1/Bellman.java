import java.util.*;


class Bellman{
	class Edge{
		int src,dest,weight;
		Edge(int src,int dest,int weight){
			this.src=src;
			this.dest=dest;
			this.weight=weight;
		}
	};
	int V,edges;
	Edge E[];
	Bellman(int v,int e){
		V=v;
		edges=e;
		E=new Edge[e];
		for (int i=0;i<e;i++){
			E[i]=new Edge(0,0,0);
		}
		return E;
	}
	public static void evaluate(Bellman graph,int src){
		int v=graph.V;
		int e=graph.edges;
		int dist[]=new int [v];
		for (int i=0;i<v;i++){
			dist[i]=Integer.MAX_VALUE; 
		}
		dist[src]=0;


		for (int i=0;i<v-1;i++){
			for (int j=0;j<e;j++){
				int u=graph[j].src;
				int v=graph[j].dest;
				int weight=graph[j].weight;
				if (dist[u]!=Integer.MAX_VALUE && dist[v]>dist[u]+weight){
					dist[v]=dist[u]+weight;
				}
			}
		}
		//after doing relaxation for n-1 times we do it once more. If there is relaxation negative cycles exist
		for (int j=0;j<e;j++){
			int u=graph[j].src;
			int v=graph[j].dest;
			int weight=graph[j].weight;
			if (dist[u]!=Integer.MAX_VALUE && dist[v]>dist[u]+weight){
				System.out.println("Negative Cycles exist :(");
				return;
				}
		}

		for (int i=0;i<v;i++){
			System.out.prinln("Distance from source");
			System.out.prinln(i + "\t"+ distance[i]);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		int v=scan.nextInt();
		System.out.print("Enter the number of edges");
		int e=scan.nextInt();
		Bellman[] graph=new Bellman(v,e);
		Class c=graph;
		System.out.println("Enter the source destination and weight of each edges");
		for (int i=0;i<e;i++){
			graph[i].src=scan.nextInt();
			graph[i].dest=scan.nextInt();
			graph[i].weight=scan.nextInt();
		}
		evaluate(graph,0);
	}
}
