package pkgCore;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

	@Test
	public void TestHashMap1() {
		Assertions.assertTrue(true);
		
		HashMap<Integer, Rectangle> hm = new HashMap<Integer,Rectangle>();
		
		Rectangle rec1 = new Rectangle(10,20);
		
		hm.put(1, rec1);
		
		Assertions.assertTrue(hm.size() == 1);
		
		Rectangle rec2 = new Rectangle(10,20);
		
		hm.put(2, rec2);
		
		Assertions.assertTrue(hm.size() == 2);		
		
		
		Rectangle rec1Get = hm.get(1);
		
		Assertions.assertEquals(20, rec1Get.getWidth());
		Assertions.assertEquals(10, rec1Get.getLength());
	}

}
