package poc.com.br.poc;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by lkimura on 03/01/17.
 */

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @SmallTest
    public void testEditTextNameNull(){
        EditText textNome = (EditText) getActivity().findViewById(R.id.edt_nome);
        assertNull(textNome);
    }

    @SmallTest
    public void testButtonNull(){
        Button bntSubmit = (Button) getActivity().findViewById(R.id.btn_submit);
        assertNotNull(bntSubmit);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
