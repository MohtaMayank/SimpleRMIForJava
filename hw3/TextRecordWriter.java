package cmu.cs.distsystems.hw3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextRecordWriter {
	public static final String DEFAULT_DELIM = "\\t";
	
	private String outputFile;
	private boolean isInit;
	private FileWriter bw;
	private String delim;

	public TextRecordWriter(String outputFile, String delimiter) {
		this.outputFile = outputFile;
		this.isInit = false;
		
		this.delim = DEFAULT_DELIM;
		if(delimiter != null) {
			this.delim = delimiter;
		}
		
	}
	
	public void writeRecord(Record<String, String> record) throws IOException {
		if(!isInit) {
			initialize();
		}
		
		bw.write(record.getKey() + this.delim + record.getValue() + "\n");
	}
	
	
	
	private void initialize() throws IOException {
		bw = new FileWriter(outputFile, true);
	}
	
	public void close() throws IOException {
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
