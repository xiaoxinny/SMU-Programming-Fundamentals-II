import java.util.*;
public class MatchMaker{
	
	public static void main(String[] args) throws Exception{
		ArrayList<Person> ladies = new ArrayList<Person>();
		Person p1 = new Person ("jill",1);
		Person p2 = new Person ("kate",2);
		ladies.add(p1);
		ladies.add(p2);
		
		ArrayList<Person> gentlemen = new ArrayList<Person>();
		Person p3 = new Person ("bob",1);
		Person p4 = new Person ("jack",1);
		gentlemen.add(p3);
		gentlemen.add(p4);
		
		HashMap<Person,Person> matches = MatchMaker.match(ladies,gentlemen);
		for (Person lady:matches.keySet()){
			System.out.println (lady + "-matched-to->" + matches.get(lady));
		}
	}

	//  Implement the missing method here
	public static HashMap<Person,Person> match(ArrayList<Person> ladies, ArrayList<Person> gentlemen) {
		Iterator<Person> ladiesIterator = ladies.iterator();
		HashMap<Person,Person> matches = new HashMap<>();

		while (ladiesIterator.hasNext()) {
			Person lady = ladiesIterator.next();
			for (Person g: gentlemen) {
				if (lady.getMonthBornIn() == g.getMonthBornIn() && lady.getName().charAt(0) == g.getName().charAt(0)) {
					matches.put(lady, g);
				} else {
					matches.put(lady, null);
				}
			}
		}

		return matches;
	}

	// ********************************

}