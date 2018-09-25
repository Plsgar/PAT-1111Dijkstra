package Graph;

public class get_Graph {
	private static int time[][];
	private static int instance[][];
	private static int C[][];
	public static int Node;
	public static int[][] getTime() {
		return time;
	}



	public static int[][] getInstance() {
		return instance;
	}

	

	public static int[][] getC() {
		return C;
	}

	public static void setC(int[][] c) {
		C = c;
	}
	
	
	public get_Graph() {
		
	}
	public static void init(int Node) {
		get_Graph.Node=Node;
		time=new int[Node][Node];
		instance=new int[Node][Node];
		for(int i=0;i<Node;i++) {
			for(int j=0;j<Node;j++) {
				time[i][j]=0;
				instance[i][j]=0;
			}
		}
	}
	public static void insert(int start,int end,int way,int Instance,int Time) {
		time[start][end]=Time;
		instance[start][end]=Instance;
		if(way==0) {
			time[end][start]=Time;
			instance[end][start]=Instance;
		}
	}
	public static int getG(int i,int j) {
		return C[i][j];
	}

}
