package poc.com.br.poc;

import junit.framework.TestCase;

/**
 * Created by lkimura on 03/01/17.
 */

public class MainActivityTestUnit extends TestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testChecker(){
        MainActivity mainActivity = new MainActivity();
        boolean result = mainActivity.checker("test");
        assertEquals(true, result);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
