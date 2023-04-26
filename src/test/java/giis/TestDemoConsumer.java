package giis;
import org.junit.*;

public class TestDemoConsumer {
	@Test
	public void testDemo() {
		Demo d=new Demo();
		Assert.assertEquals(4, d.getValue());
	}
}
