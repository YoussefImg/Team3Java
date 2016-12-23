package services;

import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

public class SyncAllRunnable implements Runnable
{

	private final Object _lock = new Object();
    private Queue<Runnable> workQueue;

    public SyncAllRunnable()
    {
    	workQueue = new LinkedTransferQueue<Runnable>();
        
    	workQueue.add(new SyncAddressRunnable());
    	workQueue.add(new SyncStationRunnable());
        
    }
    
	@Override
	public void run()
	{
		System.out.println("synced");
		synchronized(_lock)
        {
			while(true)
            {
                Runnable r = workQueue.poll();
                
                if (r == null)
                	return;
                
                r.run();
                
            }
        }
	}

}
