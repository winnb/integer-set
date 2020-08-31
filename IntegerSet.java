public class IntegerSet {
    
    private boolean[] intRange; // Array of bool values to tell whether or not numbers 0-100 are in the set

    public IntegerSet() { // Paramaterless constructor
        intRange = new boolean[101]; // Array is initialized to 101 false values, so no numbers included in the set by default
    }

    public IntegerSet(int[] b) {
        intRange = new boolean[101]; // Array is initialized to 101 false values, so no numbers included in the set by default
        for (int i=0; i<b.length; i++) { // Iterate across given int array
            if (b[i]>-1 && b[i]<101) // Only consider adding if the current number is between 0 and 100
                intRange[b[i]] = true; // Include it in set
        }
    }

    public IntegerSet Union(IntegerSet b) { // Returns a third set that is set-theoretic union of two existing sets
        IntegerSet result = new IntegerSet(); // Creates a third IntegerSet initalized to all false bools
        for (int i=0; i<100; i++) // Iterate over entire set
            if (intRange[i] || b.intRange[i]) // If a is true, b is true, or both are true
                result.InsertElement(i); // Third set includes value
        return result; // Return third set
    }

    public IntegerSet Intersection(IntegerSet b) { // Returns a third set that is set-theoretic intersection of two existing sets
        IntegerSet result = new IntegerSet(); // Creates a third IntegerSet initalized to all false bools
        for (int i=0; i<100; i++) // Iterate over entire set
            if (intRange[i] && b.intRange[i]) // If a is true and b is true then result is true, otherwise result is false
                result.InsertElement(i); // Third set includes value
        return result; // Return third set
    }

    public void InsertElement(int i) { // Includes integer i in the set if that integer is between 0 and 100
        if (i>-1 && i<101) // From 0 to 100
            intRange[i] = true; // True = included
    }

    public void DeleteElement(int i) { // Excludes integer i from the set if that integer is between 0 and 100
        if (i>-1 && i<101) // From 0 to 100
            intRange[i] = false; // False = excluded
    }

    public String ToString() { // Returns a string containing the numbers present in the set as a list of numbers separated by spaces
        String output = "\n[";
        for (int i=0; i<101; i++)
            if (intRange[i] == true)
                output += i+" ";
        output += "]";
        return output;
    }

    public boolean IsEqualTo(IntegerSet other) { // Determines whether given set is equal to current set
        boolean equal = true; // Assumes they are equal
        for (int i=0; i<101; i++) // From 0 to 100
            if (intRange[i] != other.intRange[i]) // If a single value doesn't match, then they aren't equal
                equal = false; // Not equal
        return equal;
    }

}