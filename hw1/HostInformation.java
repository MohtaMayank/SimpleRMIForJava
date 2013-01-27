package cmu.cs.distsystems.hw1;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mimighostipad
 * Date: 1/26/13
 * Time: 2:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class HostInformation implements Serializable {

	private static final long serialVersionUID = 9070460687530184794L;

	private String name;
    private int port;
    private List<RemoteProcessInfo> remoteProcesses;
    private Date lastHeartBeat;

    public HostInformation(String name,int port,List<RemoteProcessInfo> infoList,Date timeStamp){
        this.name = name;
        this.port = port;
        this.remoteProcesses = infoList;
        this.lastHeartBeat = timeStamp;
    }
    
    public String getId() {
    	return name + ":" + port;
    }

    public String getName(){
        return this.name;
    }

    public int getPort(){
        return this.port;
    }

    public List<RemoteProcessInfo> getProcessList(){
        return this.remoteProcesses;
    }

    public Date getLastUpdated(){
        return this.lastHeartBeat;
    }

}
