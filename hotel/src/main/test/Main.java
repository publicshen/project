import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;


class MyJob implements Job {

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println(new Date());
	}

}

class Example {

	public void run() throws SchedulerException {
		Scheduler scheduler = new StdSchedulerFactory ().getScheduler();

	}
	
}

public class Main {
	public static void main(String[] args) throws JobExecutionException {
		MyJob myJob = new MyJob();
		myJob.execute(null);
	}
}