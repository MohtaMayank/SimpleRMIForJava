package cmu.cs.distsystems.hw3;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a split of input data which should be submitted to a Mapper
 * It is comprised of a list of FilePartitions which represent the chunks of 
 * data that this split contains 
 * @author mayank
 *
 */
public class Split {
	FilePartition filePartition;
	
	public Split(FilePartition fp) {
		this.filePartition = fp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}