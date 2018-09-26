package maincode;


import Graph.get_Graph;

public class dijk {

	public static int start,end;
	public static int dist[]=new int[get_Graph.Node];
	public static int T[]=new int[get_Graph.Node];
	public static int[] use_node=new int[get_Graph.Node];
	public dijk(int start,int end){
		dijk.start=start;
		dijk.end=end;
		
		for(int i=0;i<get_Graph.Node;i++) {
			dist[i]=(int)Integer.MAX_VALUE;
			use_node[i]=i;
		}
		use_node[start]=-1;
	}
	public void get_nextNode(int Node) {
		
		
		for(int i=0;i<get_Graph.Node;i++){
			
			if(get_Graph.getG(Node, i)!=0) {
				
				if(Node==dijk.start) {
					dist[i]=get_Graph.getG(Node, i);
					
				}else if(dist[i]>dist[Node]+get_Graph.getG(Node, i)) {
					dist[i]=dist[Node]+get_Graph.getG(Node, i);
					creat_T(Node,i);
				}
					
			}else
				continue;
			
		}
	//	use_node[Node]=-1;
		check_empty(use_node);
		check_min(dist);
	}
	void check_min(int[] dist) {
		int min=Integer.MAX_VALUE;
		int now_minNode=Integer.MAX_VALUE;
		for(int i=0;i<dist.length;i++) {
			if(dist[i]<min &&use_node[i]>0) {
				min=dist[i];
				now_minNode=i;
				use_node[i]=-1;
			}
		}
		//use_node[now_minNode]=-1;
		get_nextNode(now_minNode);
	}
	void creat_T(int parent,int node) {
		T[node]=parent;
	}
	void get_shortestLine(int start,int end) {
		System.out.println(dist[end]);
	}
	void check_empty(int[] list) {
		int count=0;
		for(int i=0;i<list.length;i++) {
			if(list[i]<0) {
				count++;
			}
			if(count==get_Graph.Node) {
				get_shortestLine(dijk.start,dijk.end);
			}
		}
	}
}
	