package PractiseQuestions;
import java.util.*;


public class EcoUserInterface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		TrailUtil util=new TrailUtil();
		
		System.out.println("Enter the numbers of trails to be added");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println();
		
		System.out.println("Enter trails detail");
		for(int i=0;i<n;i++) {
			String line=sc.nextLine();
			String[] p=line.split(":");
			EcoTrail t=new EcoTrail(p[0],p[1],p[2],p[3],Integer.parseInt(p[4]));
			util.addTrailList(t);
		}
		System.out.println();
		
		System.out.println("Enter the trail Id to check hike status");
		String id=sc.nextLine();
		EcoTrail found=util.getTrailById(id);
		if(found!=null) {
			System.out.println(found);
		}else {
			System.out.println("Trail id "+id+" not found");
		}
		System.out.println();
		
		
		System.out.println("Most hiked trails are");
		util.getMostHikedTrails().forEach(System.out::println);
		System.out.println();
		
		System.out.println("Region-wise hike count");
		util.getHikeCountByRegion().forEach((k,v)->System.out.println(k + ": " + v + " hikes"));
		System.out.println();
		
		System.out.println("Trails grouped by Difficulty");
		util.groupTrailsByDifficulty().forEach((k,v)->{System.out.println(k);
		v.forEach(System.out::println);
		});
		System.out.println();
		
		
		System.out.println("Enter trail Id to update  hike and additional hikes");
		String[] up=sc.nextLine().split(" ");
		boolean ok=util.updateHikeCount(up[0], Integer.parseInt(up[1]));
		if(ok) {
			System.out.println("Updated "+up[0] +" by "+up[1]+" hikes");
			System.out.println(util.getTrailById(up[0]));
		}else {
			System.out.println("Trail Id "+up[0]+" not found");
		}
		System.out.println();
		
		
		System.out.println("Filter trails by region and difficulty");
		String[] fd=sc.nextLine().split(" ");
		util.filterTrails(fd[0], fd[1]).forEach(System.out::println);
		System.out.println();
		
		
		int topN=Integer.parseInt(sc.nextLine());
		System.out.println("Top "+ topN +" trails per region");
		util.getTopTrailsByRegion(topN).forEach((k,v)->{
			System.out.println(k);
			v.forEach(System.out::println);
		});
		System.out.println();
		
		
		System.out.println("Difficulty statistics");
		util.getDifficultyStats().forEach((k,v)->System.out.println(k+": " + v));
		
		
		
	}
}
