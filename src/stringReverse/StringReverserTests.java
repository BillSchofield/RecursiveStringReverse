package stringReverse;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StringReverserTests {

	private StringReverser reverser = new StringReverser();
	
	@Test
	public void shouldNotChangeStringsWithOnlyOneCharacter(){
		String originalString = "a";
		assertThat(reverser.reverse(originalString), is(originalString));
	}
	
	@Test
	public void shouldSwapTwoCharacters(){
		String originalString = "ab";
		assertThat(reverser.reverse(originalString), is("ba"));
	}
}
