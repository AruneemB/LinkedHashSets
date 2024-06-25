import java.util.LinkedHashSet;

public class LinkedHashSets
{
    private final LinkedHashSet<String> linkedHashSet;

    public LinkedHashSets(LinkedHashSet<String> linkedHashSet)
    {
        this.linkedHashSet = linkedHashSet;
    }

    //Appends String parameter to the LinkedHashSet using the .add() method
    public void append(String element)
    {
        System.out.println("Appending element " + element + " to the LinkedHashSet: ");
        System.out.println("Before appending: " + linkedHashSet);
        linkedHashSet.add(element);
        System.out.println("After appending: " + linkedHashSet);
        System.out.println();
    }

    public void iterate()
    {
        System.out.println("Contents of the LinkedHashSet: ");
        for(String element : linkedHashSet) System.out.println(element);
        System.out.println();
    }

    public void size()
    {
        System.out.println("Number of elements in the LinkedHashSet: " + linkedHashSet.size());
        System.out.println();
    }

    public void duplicate()
    {
        System.out.println("Duplicating the LinkedHashSet: ");
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("Duplicated LinkedHashSet: " + linkedHashSet.clone());
        System.out.println();
    }

    public void empty()
    {
        System.out.println("Emptying the LinkedHashSet: ");
        System.out.println("LinkedHashSet: " + linkedHashSet);
        linkedHashSet.removeAll(linkedHashSet);
        System.out.println("Emptied LinkedHashSet: " + linkedHashSet);
        System.out.println();
    }

    public void checkEmpty()
    {
        System.out.println("Checking if LinkedHashSet is empty or not: ");
        if(linkedHashSet.isEmpty()) System.out.println("LinkedHashSet is empty.");
        else System.out.println("LinkedHashSet is not empty.");
        System.out.println();
    }

    public void summary()
    {
        System.out.println("Summary of the LinkedHashSet: ");
        System.out.println("Size: " + linkedHashSet.size());
        System.out.println("Data type: " + linkedHashSet.getClass());
        System.out.println();
    }

    public static void main(String[] args)
    {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Red");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Yellow");
        LinkedHashSets linkedHashSets = new LinkedHashSets(linkedHashSet);

        linkedHashSets.append("Green");
        linkedHashSets.append("Blue");
        linkedHashSets.append("Indigo");
        linkedHashSets.append("Violet");
        linkedHashSets.summary();
        linkedHashSets.size();
        linkedHashSets.iterate();
        linkedHashSets.duplicate();
        linkedHashSets.empty();
        linkedHashSets.checkEmpty();
    }
}
