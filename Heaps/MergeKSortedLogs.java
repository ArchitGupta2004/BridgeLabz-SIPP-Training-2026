import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class LogEntry {
    int timestamp;
    String message;
    LogEntry(int timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }
    @Override
    public String toString() {
        return "[" + timestamp + "] " + message;
    }
}

public class MergeKSortedLogs {
    static List<LogEntry> mergeKSortedLogs(List<List<LogEntry>> sources) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> sources.get(a[0]).get(a[1]).timestamp - sources.get(b[0]).get(b[1]).timestamp
        );
        for (int i = 0; i < sources.size(); i++) {
            if (!sources.get(i).isEmpty()) {
                minHeap.offer(new int[]{i, 0});
            }
        }
        List<LogEntry> merged = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            int[] top = minHeap.poll();
            int sourceIdx = top[0], elemIdx = top[1];
            merged.add(sources.get(sourceIdx).get(elemIdx));
            if (elemIdx + 1 < sources.get(sourceIdx).size()) {
                minHeap.offer(new int[]{sourceIdx, elemIdx + 1});
            }
        }
        return merged;
    }

    public static void main(String[] args) {
        System.out.println("=== Scenario 6: Merge K Sorted Sources ===");
        List<List<LogEntry>> logs = new ArrayList<>();
        logs.add(Arrays.asList(new LogEntry(1, "Server A start"), new LogEntry(4, "Server A stop")));
        logs.add(Arrays.asList(new LogEntry(2, "Server B start"), new LogEntry(5, "Server B stop")));
        logs.add(Arrays.asList(new LogEntry(3, "Server C error")));
        
        List<LogEntry> mergedLogs = mergeKSortedLogs(logs);
        for (LogEntry log : mergedLogs) {
            System.out.println(log);
        }
    }
}
