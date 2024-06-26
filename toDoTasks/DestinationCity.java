package toDoTasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {

	public String destCity(List<List<String>> paths) {
        Set<String> s = new HashSet<>();
        for (var p : paths) {
            s.add(p.get(0));
        }
        for (var p : paths) {
            if (!s.contains(p.get(1))) {
                return p.get(1);
            }
        }
        return "";
    }
}
