package Text;

import java.util.Scanner;

import Graph.get_Graph;
import maincode.dijk;
import maincode.enter;

public class dijk_text {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan=new Scanner(System.in);
		int N,M;
		int start,end;
		System.out.println("enter N,M:");
		N=scan.nextInt();
		M=scan.nextInt();
		
		get_Graph.init(N);
		System.out.println("enter line");
		for(int i=0;i<M;i++) {
			new enter(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		}
		System.out.println("enter start end:");
		start=scan.nextInt();
		end=scan.nextInt();
		dijk jj=new dijk(start,end);
		get_Graph.setC(get_Graph.getInstance());
		jj.get_nextNode(start);
		get_Graph.setC(get_Graph.getTime());
		jj.get_nextNode(start);
		
	}
}
