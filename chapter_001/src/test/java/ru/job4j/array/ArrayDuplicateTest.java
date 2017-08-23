package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

	/**
	  * ArrayDuplicateTest class.
	  */

public class ArrayDuplicateTest {
	/**
	  * @Test "remove" method.
	  */
	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		ArrayDuplicate array = new ArrayDuplicate();
        String[] result = array.remove(new String[] {"qwe", "asd", "zxc", "qwe", "asd", "qwe", "ewq"});
        String[] expected = new String[] {"qwe", "asd", "zxc", "ewq"};
        assertThat(result, is(expected));
	}
}