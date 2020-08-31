
public class cecs475lab2 {

	public static void main(String[] args) {
		System.out.println("Hello! Welcome to CECS 475 Lab 2 by Brandon Winn and Peter Park\n");
		// initialize two sets
		System.out.println( "Input Set A" );
		IntegerSet set1 = new IntegerSet();
		System.out.println( "\nInput Set B" );
		IntegerSet set2 = new IntegerSet();

		IntegerSet union = set1.Union( set2 );
		IntegerSet intersection = set1.Intersection( set2 );

		// prepare output
		System.out.println( "\nSet A contains elements:" );
		System.out.println( set1.ToString() );
		System.out.println( "\nSet B contains elements:" );
		System.out.println( set2.ToString() );
		System.out.println(
		"\nUnion of Set A and Set B contains elements:" );
		System.out.println( union.ToString() );
		System.out.println(
		"\nIntersection of Set A and Set B contains elements:" );
		System.out.println( intersection.ToString() );

		// test whether two sets are equal
		if ( set1.IsEqualTo( set2 ) )
		System.out.println( "\nSet A is equal to set B" );
		else
		System.out.println( "\nSet A is not equal to set B" );

		// test insert and delete
		System.out.println( "\nInserting 77 into set A..." );
		set1.InsertElement( 77 );
		System.out.println( "\nSet A now contains elements:" );
		System.out.println( set1.ToString() );

		System.out.println( "\nDeleting 77 from set A..." );
		set1.DeleteElement( 77 );
		System.out.println( "\nSet A now contains elements:" );
		System.out.println( set1.ToString() );

		// test constructor
		int[] intArray = { 25, 67, 2, 9, 99, 105, 45, -5, 100, 1 };
		IntegerSet set3 = new IntegerSet( intArray );

		System.out.println( "\nNew Set contains elements:" );
		System.out.println( set3.ToString() );
	} // end Main
}

