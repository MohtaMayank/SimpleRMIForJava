package cmu.cs.distsystems.hw3;

import java.io.Serializable;
import java.util.List;

/**
 * This is the heartbeat message task tracker sends to job tracker.
 * @author mayank
 *
 */
public class TaskTrackerHB implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String taskTrackerId;
	private int numFreeMapSlots;
	private int numFreeReduceSlots;
	private boolean isInitHB;
	
	//These 2 also consists all statistics about the map / reduce tasks
	List<Task> tasksSnapshot;

	/**
	 * 
	 * @param taskTrackerId
	 * @param numFreeMapSlots
	 * @param numFreeReduceSlots
	 * @param taskSnapshot
	 */
	public TaskTrackerHB(String taskTrackerId, int numFreeMapSlots, 
			int numFreeReduceSlots, boolean isInitHB, List<Task> taskSnapshot) {
		this.taskTrackerId = taskTrackerId;
		this.numFreeMapSlots = numFreeMapSlots;
		this.numFreeReduceSlots = numFreeReduceSlots;
		this.isInitHB = isInitHB;
		this.tasksSnapshot = taskSnapshot;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}