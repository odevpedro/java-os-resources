import java.io.ObjectStreamException;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.MemoryMXBean;
import java.lang.management.ThreadMXBean;

public class ResourceManagement {

    private OperatingSystemMXBean osBean;
    private MemoryMXBean memoryBean;
    private ThreadMXBean threadBean;

    public ResourceManagement() {
        osBean = java.lang.management.ManagementFactory.getOperatingSystemMXBean();
        memoryBean = java.lang.management.ManagementFactory.getMemoryMXBean();
        threadBean = java.lang.management.ManagementFactory.getThreadMXBean();
    }

    // Method to get the current CPU usage
    public void getCpuUsage() {
         Object loadAvarege = osBean.getSystemLoadAverage();
        System.out.println(loadAvarege);
    }

    // Method to get the current memory usage
    public void getMemoryUsage() {
        Object heapMemoryInfo = memoryBean.getHeapMemoryUsage().getUsed();
        System.out.println(heapMemoryInfo);
    }

    // Method to get the current thread count
    public void getThreadCount() {
        Object threadInfo = threadBean.getThreadCount();
        System.out.println(threadInfo);
    }
}
