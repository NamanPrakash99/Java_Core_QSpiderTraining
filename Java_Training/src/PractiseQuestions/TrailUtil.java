package PractiseQuestions;
import java.util.*;
import java.util.stream.*;

public class TrailUtil {
	private List<EcoTrail> trailList=new ArrayList<>();
	private List<EcoTrail> originalList = new ArrayList<>();

	
	private List<EcoTrail> getTrailList(){
		return trailList;
	}
	
	public void setTrailList(List<EcoTrail> trailList) {
		this.trailList=trailList;
	}
	
	//   REQ 1:  ADD A TRAIL;
	
	public void addTrailList(EcoTrail trail) {
	    trailList.add(trail);

	    // store original copy for Top-N calculation
	    originalList.add(new EcoTrail(
	        trail.getTrailId(),
	        trail.getName(),
	        trail.getRegion(),
	        trail.getDifficulty(),
	        trail.getHikeCount()
	    ));
	}

	
	//   REQ 2: GET TRAILIST BY ID;
	
	public EcoTrail getTrailById(String trailId) {
		return trailList.stream()
				.filter(x->x.getTrailId().equalsIgnoreCase(trailId))
				.findFirst()
				.orElse(null);
	}
	
	//    REQ 3: GET MOST HIKED TRAIL;
	
	public Set<EcoTrail> getMostHikedTrails(){
		int max=trailList.stream()
				.mapToInt(EcoTrail::getHikeCount)
				.max()
				.orElse(0);
		return trailList.stream()
				.filter(x->x.getHikeCount()==max)
				.collect(Collectors.toSet());
	}
	
	// REQ 4: GET HIKE COUNT BY REGION;
	
	public Map<String, Integer> getHikeCountByRegion(){
		return trailList.stream()
				.collect(Collectors.groupingBy(EcoTrail::getRegion,Collectors.summingInt(EcoTrail::getHikeCount)));
	}
	
	// REQ 5:  GROUP TRAIL BY DIFFICULTY;
	
	public Map<String, List<EcoTrail>> groupTrailsByDifficulty(){
		return trailList.stream()
				.collect(Collectors.groupingBy(EcoTrail::getDifficulty));
	}
	
	
	//   REQ 6: UPADTE HIKE COUNT
	
	public boolean updateHikeCount(String trailId,int additionalHikes) {
		Optional<EcoTrail> opt=trailList.stream()
				.filter(x->x.getTrailId().equalsIgnoreCase(trailId))
				.findFirst();
		if(opt.isPresent()) {
			EcoTrail t=opt.get();
			t.setHikeCount(t.getHikeCount()+additionalHikes);
			return true;
		}
		return false;
	}
	
	
	// REQ 7: FILTER TRAILS BY REGION AND DIFFICULTY;
	
	public List<EcoTrail> filterTrails(String region,String difficulty){
		return trailList.stream()
				.filter(x->x.getRegion().equalsIgnoreCase(region))
				.filter(x->x.getDifficulty().equalsIgnoreCase(difficulty))
				.collect(Collectors.toList());
	}
	
	//   REQ 8: GET TOP TRAILS BY REGION;
	
	
	public Map<String, List<EcoTrail>> getTopTrailsByRegion(int n){

	    List<String> order = Arrays.asList("Himalayas", "RockyMountains", "Sahyadri");

	    Map<String, List<EcoTrail>> grouped =
	        originalList.stream()
	            .collect(Collectors.groupingBy(
	                EcoTrail::getRegion,
	                LinkedHashMap::new,
	                Collectors.collectingAndThen(Collectors.toList(), list ->
	                    list.stream()
	                        .sorted(Comparator.comparingInt(EcoTrail::getHikeCount).reversed())
	                        .limit(n)
	                        .collect(Collectors.toList())
	                )
	            ));

	    Map<String, List<EcoTrail>> ordered = new LinkedHashMap<>();
	    for (String r : order) {
	        if (grouped.containsKey(r)) {
	            ordered.put(r, grouped.get(r));
	        }
	    }

	    return ordered;
	}


	
	
	//      REQ 9: GET DIFFICULTY STATUS;
	
	public Map<String,String> getDifficultyStats(){
		return trailList.stream()
				.collect(Collectors.groupingBy(EcoTrail::getDifficulty,
						Collectors.collectingAndThen(Collectors.summarizingInt(EcoTrail::getHikeCount), 
								s-> "count=" + s.getCount() + ", totalHikes=" +s.getSum() + ", averageHike=" +(int)s.getAverage()
								)
						));
	}
	
	
}