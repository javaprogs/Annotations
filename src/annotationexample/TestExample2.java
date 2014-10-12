package annotationexample;
 
import annotationexample.TesterInfo.Priority;


 
@TesterInfo(
	priority = Priority.HIGH, 
	createdBy = "example2",  
	tags = {"sales","test" }
)
public class TestExample2 {
 
	@Test
	void testA() {
	  if (true)
		throw new RuntimeException("This test always failed");
	}
 
	@Test(enabled = false)
	void testB() {
	  if (false)
		throw new RuntimeException("This test always passed");
	}
 
	@Test(enabled = true)
	void testC() {
	  if (10 > 1) {
		// do nothing, this test always passed.
	  }
	}
        
        @Test(enabled = true)
        public void testowa(){
            throw new RuntimeException("test");

        
	}
 
}