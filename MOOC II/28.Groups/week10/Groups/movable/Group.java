package week10.Groups.movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {

	private List<Movable> GroupOfOrganisms;

	public Group() {
		this.GroupOfOrganisms = new ArrayList<Movable>();
	}

	public void addToGroup(Movable movable) {
		this.GroupOfOrganisms.add(movable);
	}

	@Override
	public String toString() {
		String print = "";
		for (Movable n : this.GroupOfOrganisms) {
			print += n.toString() + "\n";
		}
		return print;
	}

	public void move(int dx, int dy) {
		for (Movable n : this.GroupOfOrganisms) {
			n.move(dx, dy);
		}
	}
}
