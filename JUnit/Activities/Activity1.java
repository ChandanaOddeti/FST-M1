package demos;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {
	static ArrayList<String> list,
list = new ArrayList<String>();

@Test 
public void insertTest() {
	assertEquals(2, list.size(), ("Wrong Size"));
}

}
